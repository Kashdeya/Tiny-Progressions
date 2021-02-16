package com.kashdeya.tinyprogressions.blocks.ores;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WubOre extends StandardBlock implements IOreDictEntry {
	
	private final String oredic;
	
    public WubOre(String oredic)
    {
        super(Properties.create(Material.ROCK)
        		.hardnessAndResistance(2, 10)
        		.harvestTool(ToolType.PICKAXE)
        		.harvestLevel(3)
        		.sound(SoundType.STONE));
        this.oredic = oredic;
    }
    
	@Override
	public String getOreDictName() {
		return this.oredic;
	}
    
//    @Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
//    {
//        return false;
//    }
    
//	@Override
//    @SideOnly(Side.CLIENT)
//    public BlockRenderLayer getRenderLayer()
//    {
//        return BlockRenderLayer.CUTOUT;
//    }
//    
//    @Override
//    public int quantityDropped(Random rand) {
//        return 1 + rand.nextInt(2);
//    }
//    
//    @Override
//    public Item getItemDropped(BlockState state, Random rand, int fortune) {
//        return TechItems.wub_gem;
//    }
//    
//    @Override
//    public int quantityDroppedWithBonus(int fortune, Random rand) {
//    	return MathHelper.clamp(this.quantityDropped(rand) + rand.nextInt(fortune + 1), 1, 6);
//    }
//    
//
//    @Override
//    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
//        return (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) ? (1 + RANDOM.nextInt(5)) : 0;
//    }
//    
//    @Override
//    public boolean isReplaceableOreGen(IBlockState state, IBlockAccess world, BlockPos pos, Predicate<IBlockState> target)
//    {
//        return false;
//    }
}
