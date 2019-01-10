package com.camellias.stardust.common.items;

import com.camellias.stardust.Main;
import com.camellias.stardust.init.ModItems;
import com.camellias.stardust.utils.IHasModel;

import net.minecraft.item.Item;

public class ItemUranium extends Item implements IHasModel
{
	public ItemUranium(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.STARDUST_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
