package com.camellias.stardust.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes 
{
	public static void registerBiomes()
	{
		
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... type)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biomes Registered");
		BiomeDictionary.addTypes(biome, type);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 0));
		BiomeManager.addSpawnBiome(biome);
		
		/*if(ConfigHandler.spawnVoidBiomeOverworld)
		{
			BiomeManager.addSpawnBiome(biome);
		}*/
		
		return biome;
	}
}
