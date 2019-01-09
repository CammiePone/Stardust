package com.camellias.stardust.utils.handlers;

import com.camellias.stardust.Reference;
import com.camellias.stardust.client.gui.GuiMicroFissionReactor;
import com.camellias.stardust.common.container.ContainerMicroFissionReactor;
import com.camellias.stardust.common.tileentities.TileMicroFissionReactor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_MICROFISSION_REACTOR)
		{
			return new ContainerMicroFissionReactor(player.inventory, 
					(TileMicroFissionReactor)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_MICROFISSION_REACTOR)
		{
			return new GuiMicroFissionReactor(player.inventory, 
					(TileMicroFissionReactor)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
	}
}
