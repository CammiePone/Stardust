package com.camellias.stardust.common.items.armour;

import com.camellias.stardust.Main;
import com.camellias.stardust.client.models.armour.ModelSpaceSuit;
import com.camellias.stardust.core.init.ModDamageTypes;
import com.camellias.stardust.core.init.ModItems;
import com.camellias.stardust.core.utils.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class SpaceSuit extends ItemArmor implements IHasModel
{
	public SpaceSuit(ArmorMaterial material, int index, EntityEquipmentSlot slot, String name)
	{
		super(material, index, slot);
		
		this.setTranslationKey(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.STARDUST_TAB);
		this.setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entity, ItemStack stack, EntityEquipmentSlot slot, ModelBiped biped)
	{
		if(stack != ItemStack.EMPTY)
		{
			if(stack.getItem() instanceof ItemArmor)
			{
				ModelSpaceSuit armourModel = new ModelSpaceSuit(slot);
				
				armourModel.isSneak = biped.isSneak;
				armourModel.isRiding = biped.isRiding;
				armourModel.isChild = biped.isChild;
				armourModel.rightArmPose = biped.rightArmPose;
				armourModel.leftArmPose = biped.leftArmPose;
				
				return armourModel;
			}
		}
		
		return null; 
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if(!player.capabilities.isCreativeMode && player.ticksExisted % 20 == 0)
		{
			if(player.getHealth() > 2)
			{
				player.setHealth(player.getHealth() - 0.5F);
			}
			else
			{
				player.attackEntityFrom(ModDamageTypes.SPACE_VACUUM, Float.MAX_VALUE);
			}
		}
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
