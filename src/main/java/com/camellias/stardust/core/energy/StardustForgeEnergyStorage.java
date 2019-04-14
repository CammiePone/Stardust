package com.camellias.stardust.core.energy;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.energy.EnergyStorage;

public class StardustForgeEnergyStorage extends EnergyStorage
{
    public StardustForgeEnergyStorage(int capacity, int maxRecieve)
    {
        super(capacity, maxRecieve, 0);
    }
	
    public void setEnergy(int energy)
    {
        this.energy = energy;
    }
    
    public void generateEnergy(int energy)
    {
    	this.energy += energy;
    	
    	if(this.energy > capacity)
    	{
    		this.energy = capacity;
    	}
    }
    
    public void consumeEnergy(int energy)
    {
    	this.energy -= energy;
    	
    	if(this.energy < 0)
    	{
    		this.energy = 0;
    	}
    }
}