package com.camellias.stardust.common.tabs;

import com.camellias.stardust.core.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StardustTab extends CreativeTabs
{
	public StardustTab(String name)
	{
		super(name);
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ModItems.SPACE_SUIT_HELMET);
	}
}
