package com.kashdeya.tinyprogressions.blocks.compressed;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class NetherStarBlock extends StandardBlock {
	
	
	public NetherStarBlock()
	{
		super(Properties.create(Material.PORTAL)
				.hardnessAndResistance(3F, 2000F)
				.setLightLevel((p) -> 1)
				.sound(SoundType.STONE)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE));
		
	}

	public boolean isBeaconBase(BlockState state, IWorldReader world, BlockPos pos, BlockPos beacon)
    {
		return true;
    	
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return true;
    }
	
	@Override
	public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) 
    {
        entityIn.onLivingFall(fallDistance, 3.0F);
    }
	
	@Override
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
			tooltip.add(new TranslationTextComponent("tooltip.netherstar_1"));
	}

}
