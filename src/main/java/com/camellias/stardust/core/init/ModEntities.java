package com.camellias.stardust.core.init;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.camellias.stardust.Reference;
import com.camellias.stardust.common.entities.misc.EntitySpaceShip;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

public class ModEntities 
{
	public static int entity_id = 0;
	
	public static final EntityEntry SPACESHIP = createEntityEntry(EntitySpaceShip.class, "spaceship");
	
	private static EntityEntry createEntityEntry(Class<? extends Entity> clazz, String name)
	{
		return EntityEntryBuilder.create().entity(clazz).id(new ResourceLocation(Reference.MODID, name), entity_id++).name(Reference.MODID + "." + name).tracker(128, 1, true).build();
	}
	
	private static EntityEntry createEntityEntry(Class<? extends Entity> clazz, String name, int solidColor, int spotColor)
	{
		return EntityEntryBuilder.create().entity(clazz).id(new ResourceLocation(Reference.MODID, name), entity_id++).name(Reference.MODID + "." + name).tracker(64, 1, true).egg(solidColor, spotColor).build();
	}
	
	private static EntityEntry createEntityEntry(Class<? extends Entity> clazz, String name, int solidColor, int spotColor, EnumCreatureType type, int weight, int min, int max, List<String> types)
	{
		Set<Biome> biomes = new HashSet<>();
		for(String typeName : types) biomes.addAll(BiomeDictionary.getBiomes(Type.getType(typeName)));
		return EntityEntryBuilder.create().entity(clazz).id(new ResourceLocation(Reference.MODID, name), entity_id++).name(Reference.MODID + "." + name).tracker(64, 1, true).egg(solidColor, spotColor).spawn(type, weight, min, max, biomes).build();
	}
}
