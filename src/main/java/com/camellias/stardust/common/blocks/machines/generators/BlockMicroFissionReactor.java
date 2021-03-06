package com.camellias.stardust.common.blocks.machines.generators;

import java.util.Random;

import com.camellias.stardust.Main;
import com.camellias.stardust.Reference;
import com.camellias.stardust.common.tileentities.TileMicroFissionReactor;
import com.camellias.stardust.core.init.ModBlocks;
import com.camellias.stardust.core.init.ModItems;
import com.camellias.stardust.core.utils.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMicroFissionReactor extends Block implements IHasModel
{
	public BlockMicroFissionReactor(String name, Material material)
	{
		super(material);
		
		this.setTranslationKey(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.STARDUST_TAB);
		this.setHardness(3.0F);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			player.openGui(Main.instance, Reference.GUI_MICROFISSION_REACTOR, world, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand)
	{
		TileMicroFissionReactor reactor = (TileMicroFissionReactor) world.getTileEntity(pos);
		
		if(reactor.isBurning())
		{
			double x = rand.nextGaussian() * 0.01D;
            double z = rand.nextGaussian() * 0.01D;
			
			world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, pos.getX() + 0.5, pos.getY() + 1.25, pos.getZ() + 0.5, x, 0.02D, z);
			world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, pos.getX() + 0.5, pos.getY() + 1.25, pos.getZ() + 0.5, x, 0.02D, z);
		}
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileMicroFissionReactor();
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state)
	{
		TileMicroFissionReactor reactor = (TileMicroFissionReactor) world.getTileEntity(pos);
		
		world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), reactor.handler.getStackInSlot(0)));
		
		super.breakBlock(world, pos, state);
	}
	
	
	
	
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
	{
		return EnumBlockRenderType.MODEL;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
	
	@Override
	public boolean isTranslucent(IBlockState state)
	{
		return false;
	}
	
	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.SOLID;
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
