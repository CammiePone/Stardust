package com.camellias.stardust.init;

import com.camellias.stardust.Main;
import com.camellias.stardust.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	public static void registerEntities()
	{
		
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colour1, int colour2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), 
				entity, name, id, Main.instance, range, 1, true, colour1, colour2);
	}
	
	private static void registerEntityNoEgg(String name, Class<? extends Entity> entity, int id, int range)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), 
				entity, name, id, Main.instance, range, 1, true);
	}
}
