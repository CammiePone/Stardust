package com.camellias.stardust.init;

import java.util.ArrayList;
import java.util.List;

import com.camellias.stardust.Reference;
import com.camellias.stardust.common.items.ItemUranium;
import com.camellias.stardust.common.items.armour.SpaceSuit;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//-----Item list-----//
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ArmorMaterial SPACE_SUIT = EnumHelper.addArmorMaterial("space suit", 
			Reference.MODID + ":space_suit", 15, new int[]{3,5,6,4}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static final Item SPACE_SUIT_HELMET = new SpaceSuit(SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet");
	public static final Item SPACE_SUIT_CHEST = new SpaceSuit(SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest");
	public static final Item SPACE_SUIT_LEGS = new SpaceSuit(SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings");
	public static final Item SPACE_SUIT_BOOTS = new SpaceSuit(SPACE_SUIT, 1, EntityEquipmentSlot.FEET, "space_boots");
	
	public static final Item URANIUM = new ItemUranium("uranium");
}
