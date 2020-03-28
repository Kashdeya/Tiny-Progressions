package com.kashdeya.tinyprogressions.blocks.ores;

import java.util.Random;

import com.google.common.base.Predicate;
import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import javafx.geometry.Side;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EnderOre extends StandardBlock implements IOreDictEntry {
	
    public EnderOre()
    {
        super(Properties
        		.create(Material.ROCK)
        		.hardnessAndResistance(8, 10)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE));
    }
    
	@Override
	public String getOreDictName() {
		return "oreEnderOre";
	}
    
//    @Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
//    {
//        return false;
//    }
	
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
    	if (ConfigHandler.ender_mite && !worldIn.isRemote){
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            int rand = worldIn.rand.nextInt(100);

            if (rand <= ConfigHandler.endermite_spawn) {
                Entity entity = new EndermiteEntity(EntityType.ENDERMITE, worldIn);
                if (!worldIn.isRemote) {
                    entity.setLocationAndAngles(x + (0.5), y + (1), z + (0.5), worldIn.rand.nextFloat() * 360F, 0.0F);
                    worldIn.addEntity(entity);
                    ((LivingEntity) entity).playSound(SoundEvents.ENTITY_ENDERMITE_AMBIENT, 1, 1);
                }
            }
    	}
    }
    
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        for (int i = 0; i < 4; ++i)
        {
            double d0 = (double)((float)pos.getX() + rand.nextFloat());
            double d1 = (double)((float)pos.getY() + rand.nextFloat());
            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
            double d3 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            double d4 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            double d5 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            int j = rand.nextInt(2) * 2 - 1;

            if (worldIn.getBlockState(pos.west()).getBlock() != this && worldIn.getBlockState(pos.east()).getBlock() != this)
            {
                d0 = (double)pos.getX() + 0.5D + 0.25D * (double)j;
                d3 = (double)(rand.nextFloat() * 2.0F * (float)j);
            }
            else
            {
                d2 = (double)pos.getZ() + 0.5D + 0.25D * (double)j;
                d5 = (double)(rand.nextFloat() * 2.0F * (float)j);
            }

            worldIn.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
        }
    }
    
//	
//	@Override
//    @SideOnly(Side.CLIENT)
//    public BlockRenderLayer getRenderLayer()
//    {
//        return BlockRenderLayer.CUTOUT;
//    }
//    
//    @Override
//    public int quantityDropped(Random rand) {
//        return 1 + rand.nextInt(5);
//    }
//    
//    @Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
//        return TechItems.ender_dust;
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
