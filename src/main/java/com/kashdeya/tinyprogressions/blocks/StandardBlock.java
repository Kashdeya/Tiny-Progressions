package com.kashdeya.tinyprogressions.blocks;

import com.kashdeya.tinyprogressions.registry.utils.IItemProvider;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class StandardBlock extends Block implements IItemProvider
{
	private BlockItem itemBlock;
	
	public StandardBlock(Properties propery)
	{
		super(propery);
	}

	@Override
	public BlockItem createItemBlock() {
		return itemBlock;
	}
	
//	public StandardBlock setBlockRenderLayer(BlockRenderLayer renderLayer)
//	{
//		this.renderLayer = renderLayer;
//		return this;
//	}
//	
	public StandardBlock setItemBlock(Class<? extends BlockItem> itemBlock)
	{
		try
		{
			this.itemBlock = itemBlock.getDeclaredConstructor(Block.class).newInstance(this);
		}
		catch (Exception ignored)
		{
		}
		
		return this;
	}
	
//	@Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return itemBlock;
//    }
	
//	@Override
//	public ItemBlock createItemBlock()
//	{
//		return ;
//	}
	
	
//	@Override
//    public BlockRenderLayer getRenderLayer()
//    {
//        return renderLayer;
//    }
    
	
//	@Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
//    {
//        return false;
//    }
//	
//	@Override
//    public boolean isFullCube(IBlockState state)
//    {
//        return false;
//    }
//    
//    @Override
//    public boolean isOpaqueCube(IBlockState state)
//    {
//        return false;
//    }
}
