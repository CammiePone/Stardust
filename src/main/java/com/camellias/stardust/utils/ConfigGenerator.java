package com.camellias.stardust.utils;

import java.io.File;

import com.camellias.stardust.Main;
import com.camellias.stardust.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigGenerator
{
	public static Configuration config;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "IDs";
		config.addCustomCategoryComment(category, "Set IDs for each entity and GUI");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MODID + ".cfg"));
	}
}
