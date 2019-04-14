package com.camellias.stardust.common.blocks.machines.consumers;

import com.camellias.stardust.Main;
import com.camellias.stardust.common.tileentities.TileRefinery;
import com.camellias.stardust.core.init.ModBlocks;
import com.camellias.stardust.core.init.ModItems;
import com.camellias.stardust.core.utils.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRefinery extends Block implements IHasModel
{
	public BlockRefinery(String name, Material material)
	{
		super(material);
		
		this.setTranslationKey(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.STARDUST_TAB);
		this.setHardness(3.0F);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	/*@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			player.openGui(Main.instance, Reference.GUI_MICROFISSION_REACTOR, world, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}*/
	
	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileRefinery();
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state)
	{
		TileRefinery reactor = (TileRefinery)world.getTileEntity(pos);
		
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
		return true;
	}
	
	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
