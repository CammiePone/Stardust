package com.camellias.stardust.core.handlers;

import com.camellias.stardust.Main;
import com.camellias.stardust.core.init.ConfigGenerator;
import com.camellias.stardust.core.init.ModBlocks;
import com.camellias.stardust.core.init.ModItems;
import com.camellias.stardust.core.init.ModSmelting;
import com.camellias.stardust.core.utils.IHasModel;
import com.camellias.stardust.core.utils.OreDictionaryCompatibility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler 
{	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[1]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
	
	public static void otherRegistries()
	{
		//ModBiomes.registerBiomes();
		//GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		//ModDimensions.registerDimension();
		//ModEntities.registerEntities();
		
		/*if(event.getSide() == Side.CLIENT)
		{
			RenderHandler.registerEntityRenders();
		}*/
		
		ConfigGenerator.registerConfig(event);
		
		//GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
	}
	
	public static void initRegistries()
	{
		OreDictionaryCompatibility.registerOres();
		
		SoundsHandler.registerSounds();
		
		ModSmelting.init();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
}
