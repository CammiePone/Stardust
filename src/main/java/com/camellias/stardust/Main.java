package com.camellias.stardust;

import java.io.File;

import com.camellias.stardust.common.tabs.StardustTab;
import com.camellias.stardust.core.handlers.RegistryHandler;
import com.camellias.stardust.core.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(
	modid = Reference.MODID, 
	name = Reference.NAME, 
	version = Reference.VERSION, 
	acceptedMinecraftVersions = Reference.ACCEPTEDVERSIONS, 
	dependencies = Reference.DEPENDENCIES)
public class Main 
{
	public static File config;
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs STARDUST_TAB = new StardustTab("stardustTab");
	
	//Proxy
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.otherRegistries();
		RegistryHandler.preInitRegistries(event);
		
		System.out.println("Double checking the Pre-Launch Checklist...");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries();
		
		System.out.println("Ready for Launch in t-minus 20... 19... 18...");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("One small step for man... one giant leap for mankind!");
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
		
		System.out.println("One small step for man... one giant leap for mankind!");
	}
}
