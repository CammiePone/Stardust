package com.camellias.stardust.core.init;

import java.util.ArrayList;
import java.util.List;

import com.camellias.stardust.common.blocks.BlockAlienBeacon;
import com.camellias.stardust.common.blocks.machines.consumers.BlockRefinery;
import com.camellias.stardust.common.blocks.machines.generators.BlockMicroFissionReactor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	//-----Block list-----//
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ALIEN_BEACON = new BlockAlienBeacon("alien_beacon", Material.ROCK);
	public static final Block MICROFISSION = new BlockMicroFissionReactor("microfission_reactor", Material.IRON);
	public static final Block REFINERY = new BlockRefinery("refinery", Material.IRON);
}
