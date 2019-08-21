package com.camellias.stardust.core.init;

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
	
	//-----Space Suits-----//
	public static final Item WHITE_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.WHITE_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_white");
	public static final Item WHITE_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.WHITE_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_white");
	public static final Item WHITE_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.WHITE_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_white");
	
	public static final Item ORANGE_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.ORANGE_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_orange");
	public static final Item ORANGE_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.ORANGE_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_orange");
	public static final Item ORANGE_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.ORANGE_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_orange");
	
	public static final Item MAGENTA_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.MAGENTA_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_magenta");
	public static final Item MAGENTA_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.MAGENTA_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_magenta");
	public static final Item MAGENTA_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.MAGENTA_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_magenta");
	
	public static final Item LIGHT_BLUE_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.LIGHT_BLUE_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_light_blue");
	public static final Item LIGHT_BLUE_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.LIGHT_BLUE_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_light_blue");
	public static final Item LIGHT_BLUE_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.LIGHT_BLUE_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_light_blue");
	
	public static final Item YELLOW_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.YELLOW_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_yellow");
	public static final Item YELLOW_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.YELLOW_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_yellow");
	public static final Item YELLOW_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.YELLOW_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_yellow");
	
	public static final Item LIME_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.LIME_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_lime");
	public static final Item LIME_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.LIME_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_lime");
	public static final Item LIME_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.LIME_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_lime");
	
	public static final Item PINK_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.PINK_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_pink");
	public static final Item PINK_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.PINK_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_pink");
	public static final Item PINK_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.PINK_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_pink");
	
	public static final Item GREY_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.GREY_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_grey");
	public static final Item GREY_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.GREY_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_grey");
	public static final Item GREY_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.GREY_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_grey");
	
	public static final Item LIGHT_GREY_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.LIGHT_GREY_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_light_grey");
	public static final Item LIGHT_GREY_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.LIGHT_GREY_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_light_grey");
	public static final Item LIGHT_GREY_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.LIGHT_GREY_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_light_grey");
	
	public static final Item CYAN_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.CYAN_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_cyan");
	public static final Item CYAN_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.CYAN_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_cyan");
	public static final Item CYAN_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.CYAN_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_cyan");
	
	public static final Item PURPLE_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.PURPLE_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_purple");
	public static final Item PURPLE_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.PURPLE_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_purple");
	public static final Item PURPLE_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.PURPLE_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_purple");
	
	public static final Item BLUE_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.BLUE_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_blue");
	public static final Item BLUE_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.BLUE_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_blue");
	public static final Item BLUE_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.BLUE_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_blue");
	
	public static final Item BROWN_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.BROWN_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_brown");
	public static final Item BROWN_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.BROWN_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_brown");
	public static final Item BROWN_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.BROWN_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_brown");
	
	public static final Item GREEN_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.GREEN_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_green");
	public static final Item GREEN_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.GREEN_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_green");
	public static final Item GREEN_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.GREEN_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_green");
	
	public static final Item RED_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.RED_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_red");
	public static final Item RED_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.RED_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_red");
	public static final Item RED_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.RED_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_red");
	
	public static final Item BLACK_SPACE_SUIT_HELMET = new SpaceSuit(ModMaterials.BLACK_SPACE_SUIT, 1, EntityEquipmentSlot.HEAD, "space_helmet_black");
	public static final Item BLACK_SPACE_SUIT_CHEST = new SpaceSuit(ModMaterials.BLACK_SPACE_SUIT, 1, EntityEquipmentSlot.CHEST, "space_chest_black");
	public static final Item BLACK_SPACE_SUIT_LEGS = new SpaceSuit(ModMaterials.BLACK_SPACE_SUIT, 2, EntityEquipmentSlot.LEGS, "space_leggings_black");
	
	public static final Item SPACE_SUIT_BOOTS = new SpaceSuit(ModMaterials.WHITE_SPACE_SUIT, 1, EntityEquipmentSlot.FEET, "space_boots");
	
	//-----Materials-----//
	public static final Item URANIUM = new ItemUranium("uranium");
	public static final Item REFINED_URANIUM = new ItemUranium("refined_uranium");
}
