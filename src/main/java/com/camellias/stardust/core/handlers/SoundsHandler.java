package com.camellias.stardust.core.handlers;

import com.camellias.stardust.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class SoundsHandler
{
	public static void registerSounds()
	{
		
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		
		ForgeRegistries.SOUND_EVENTS.register(event);
		
		return event;
	}
} 
