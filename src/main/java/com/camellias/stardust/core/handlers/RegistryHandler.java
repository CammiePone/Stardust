package com.camellias.stardust.core.handlers;

import java.lang.reflect.Field;

import com.camellias.stardust.Main;
import com.camellias.stardust.client.renders.entities.misc.RenderSpaceShip;
import com.camellias.stardust.common.entities.misc.EntitySpaceShip;
import com.camellias.stardust.core.init.ConfigGenerator;
import com.camellias.stardust.core.init.ModBlocks;
import com.camellias.stardust.core.init.ModEntities;
import com.camellias.stardust.core.init.ModItems;
import com.camellias.stardust.core.init.ModSmelting;
import com.camellias.stardust.core.utils.IHasModel;
import com.camellias.stardust.core.utils.OreDictionaryCompatibility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.relauncher.Side;

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
	
	@SubscribeEvent
	public static void registerEntities(Register<EntityEntry> event)
	{
		try
		{
			for(Field f : ModEntities.class.getFields())
			{
				Object obj = f.get(null);
				
				if(obj instanceof EntityEntry)
					event.getRegistry().register((EntityEntry) obj);
			}
		}
		catch(Exception ignored)
		{
			
		}
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		if(event.getSide() == Side.CLIENT)
		{
			RenderingRegistry.registerEntityRenderingHandler(EntitySpaceShip.class, RenderSpaceShip::new);
		}
		
		ConfigGenerator.registerConfig(event);
	}
	
	public static void initRegistries()
	{
		OreDictionaryCompatibility.registerOres();
		
		SoundsHandler.registerSounds();
		
		ModSmelting.init();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
}
