package com.camellias.stardust.network;

import com.camellias.stardust.Reference;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class NetworkHandler
{
public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);
	
	private static int nextId = 0;
	
	private NetworkHandler()
	{
		
	}
	
	public static void init()
	{
		
	}
	
	public static int next()
	{
		return nextId++;
	}
}
