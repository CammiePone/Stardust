package com.camellias.stardust.common.tileentities;

import com.camellias.stardust.core.energy.StardustForgeEnergyStorage;
import com.camellias.stardust.core.init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileMicroFissionReactor extends TileEntity implements ITickable
{
	public int capacity = 10240000;
	public int maxInput = 0;
	public StardustForgeEnergyStorage energyStorage = new StardustForgeEnergyStorage(capacity, maxInput);
	public int energy = energyStorage.getEnergyStored();
	private String customName;
	
	public ItemStackHandler handler = new ItemStackHandler(1);
	public int burnTime;
	
	@Override
	public void update()
	{
		if(!world.isRemote)
		{
			generateEnergy(256);
			outputEnergy(256);
		}
	}
	
	public void generateEnergy(int maxGeneration)
	{
		if(burnTime <= 0 && isItemFuel(handler.getStackInSlot(0)))
		{
			if(handler.getStackInSlot(0).getItem() == ModItems.URANIUM)
			{
				burnTime = 6000;
			}
			if(handler.getStackInSlot(0).getItem() == ModItems.REFINED_URANIUM)
			{
				burnTime = 12000;
			}
			
			handler.getStackInSlot(0).shrink(1);
		}
		if(burnTime > 0)
		{
			energyStorage.generateEnergy(maxGeneration);
			burnTime--;
		}
	}
	
	public void outputEnergy(int maxOutput)
	{
		if(energyStorage.getEnergyStored() > 0)
		{
            for(EnumFacing facing : EnumFacing.VALUES)
            {
                TileEntity tileEntity = world.getTileEntity(pos.offset(facing));
                
                if(tileEntity != null && tileEntity.hasCapability(CapabilityEnergy.ENERGY, facing.getOpposite()))
                {
                    IEnergyStorage handler = tileEntity.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite());
                    
                    if(handler != null && handler.canReceive())
                    {
                        int accepted = handler.receiveEnergy(maxOutput, false);
                        energyStorage.consumeEnergy(accepted);
                        
                        if(energyStorage.getEnergyStored() <= 0)
                        {
                            break;
                        }
                    }
                }
            }
            
            markDirty();
		}
	}
	
	@Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState)
    {
        return oldState.getBlock() != newState.getBlock();
    }
	
	public boolean isBurning()
	{
		return this.burnTime > 0;
	}
	
	private boolean isItemFuel(ItemStack stack)
	{
		return getFuelValue(stack) > 0;
	}

	private int getFuelValue(ItemStack stack)
	{
		if(stack.isEmpty())
		{
			return 0;
		}
		else
		{
			if(stack.getItem() == ModItems.URANIUM) return 1;
			if(stack.getItem() == ModItems.REFINED_URANIUM) return 1;
			
			return ForgeEventFactory.getItemBurnTime(stack);
		}
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing)
	{
		if(capability == CapabilityEnergy.ENERGY)
		{
			return CapabilityEnergy.ENERGY.cast(energyStorage);
		}
		
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return (T)this.handler;
		}
		
		return super.getCapability(capability, facing);
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing)
	{
		if(capability == CapabilityEnergy.ENERGY)
		{
			return true;
		}
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return true;
		}
		
		return super.hasCapability(capability, facing);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		
		compound.setTag("Inventory", this.handler.serializeNBT());
		compound.setInteger("BurnTime", this.burnTime);
		compound.setInteger("GUIEnergy", this.energy);
		compound.setString("Name", getDisplayName().toString());
		compound.setInteger("Energy", energyStorage.getEnergyStored());
		
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		
		this.handler.deserializeNBT(compound.getCompoundTag("Inventory"));
		this.burnTime = compound.getInteger("BurnTime");
		this.energy = compound.getInteger("GUIEnergy");
		this.customName = compound.getString("Name");
		energyStorage.setEnergy(compound.getInteger("Energy"));
	}
	
	@Override
	public ITextComponent getDisplayName()
	{
		return new TextComponentTranslation("container.microfission_reactor");
	}
	
	public int getEnergyStored()
	{
		return this.energyStorage.getEnergyStored();
	}
	
	public int getMaxEnergyStored()
	{
		return this.energyStorage.getMaxEnergyStored();
	}
	
	public int getField(int id)
	{
		switch(id)
		{
		case 0:
			return this.energyStorage.getEnergyStored();
		case 1:
			return this.burnTime;
		default:
			return 0;
		}
	}
	
	public void setField(int id, int value)
	{
		switch(id)
		{
		case 0:
			this.energy = value;
		case 1:
			this.burnTime = value;
		}
	}
	
	public boolean isUsableByPlayer(EntityPlayer player)
	{
		return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq(
				(double)this.pos.getX() + 0.5D, 
				(double)this.pos.getY() + 0.5D, 
				(double)this.pos.getZ() + 0.5D) <= 64.0D;
	}
}
