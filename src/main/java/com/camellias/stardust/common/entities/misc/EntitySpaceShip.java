package com.camellias.stardust.common.entities.misc;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntitySpaceShip extends Entity
{
	Entity rider = getControllingPassenger();
	
	public EntitySpaceShip(World world)
	{
		super(world);
		setSize(12F, 5F);
	}
	
	public EntitySpaceShip(World world, double x, double y, double z)
	{
		super(world);
		setPosition(x, y, z);
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;
	}
	
	@Override
	protected void entityInit()
	{
		
	}
	
	@Override
	public boolean processInitialInteract(EntityPlayer player, EnumHand hand)
	{
		if(!world.isRemote && !isBeingRidden()) player.startRiding(this);
		return super.processInitialInteract(player, hand);
	}
	
	@Override
	public double getMountedYOffset()
	{
		return super.getMountedYOffset();
	}
	
	@Override
	public boolean canPassengerSteer()
	{
		return true;
	}
	
	public boolean canBeSteered()
	{
		return getControllingPassenger() instanceof EntityLivingBase;
	}
	
	@Override
	public Entity getControllingPassenger()
	{
		return getPassengers().isEmpty() ? null : getPassengers().get(0);
	}
	
	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if(getControllingPassenger() != null)
		{
			motionX = rider.motionX;
			motionZ = rider.motionZ;
			if(rider.rotationPitch > rotationPitch + 25) rider.rotationPitch = (rotationPitch + 25);
			if(rider.rotationPitch < rotationPitch - 25) rider.rotationPitch = (rotationPitch - 25);
			if(rider.rotationYaw > rotationYaw + 15) rider.rotationYaw = (rotationYaw + 15);
			if(rider.rotationYaw < rotationYaw - 15) rider.rotationYaw = (rotationYaw - 15);
			
			if(rider instanceof EntityPlayer)
			{
				GameSettings settings = Minecraft.getMinecraft().gameSettings;
				
				if(isAirBorne)
				{
					if(settings.isKeyDown(settings.keyBindJump))
					{
						motionY = MathHelper.clamp(motionY += 0.2D, -2D, 2D);
						rotationPitch = MathHelper.clamp(rotationPitch++, -90, 90);
					}
					else
					{
						motionY = MathHelper.clamp(motionY -= 0.2D, -2D, 2D);
						rotationPitch = MathHelper.clamp(rotationPitch--, -90, 90);
					}
					
					if(settings.isKeyDown(settings.keyBindRight))
					{
						rotationYaw = MathHelper.clamp(rotationYaw--, -30, 30);
					}
					
					if(settings.isKeyDown(settings.keyBindLeft))
					{
						rotationYaw = MathHelper.clamp(rotationYaw++, -30, 30);
					}
				}
				else if(onGround)
				{
					motionY = 0;
					rotationPitch = 0;
				}
			}
		}
		
		move(MoverType.SELF, motionX, motionY, motionZ);
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbt)
	{
		if(nbt.hasKey("posX")) posX = nbt.getDouble("posX");
		if(nbt.hasKey("posY")) posY = nbt.getDouble("posY");
		if(nbt.hasKey("posZ")) posZ = nbt.getDouble("posZ");
		
		if(nbt.hasKey("motionX")) motionX = nbt.getDouble("motionX");
		if(nbt.hasKey("motionY")) motionY = nbt.getDouble("motionY");
		if(nbt.hasKey("motionZ")) motionZ = nbt.getDouble("motionZ");
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound nbt)
	{
		nbt.setDouble("posX", posX);
		nbt.setDouble("posY", posY);
		nbt.setDouble("posZ", posZ);
		
		nbt.setDouble("motionX", motionX);
		nbt.setDouble("motionY", motionY);
		nbt.setDouble("motionZ", motionZ);
	}
}
