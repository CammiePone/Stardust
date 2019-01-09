package com.camellias.stardust.utils.handlers;

import com.camellias.stardust.Reference;
import com.camellias.stardust.common.tileentities.TileMicroFissionReactor;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileMicroFissionReactor.class, new ResourceLocation(Reference.MODID + ":microfission_reactor"));
	}
}
