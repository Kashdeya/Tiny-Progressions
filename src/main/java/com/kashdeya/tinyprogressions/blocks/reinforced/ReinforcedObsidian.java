package com.kashdeya.tinyprogressions.blocks.reinforced;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class ReinforcedObsidian extends Block implements IOreDictEntry {
	
	public ReinforcedObsidian()
    {
        super(Properties.create(Material.GLASS, MaterialColor.BLACK)
        		.hardnessAndResistance(30, 2000)
        		.harvestLevel(2)
        		.harvestTool(ToolType.PICKAXE)
        		.sound(SoundType.ANVIL));
    }
	
	@Override
	public String getOreDictName() {
		return "blockReinforcedObsidian";
	}

    @Override
    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {}
	  
	@Override
	public boolean canDropFromExplosion(Explosion explosionIn)
	{
		return false;	
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
    	tooltip.add(new TranslationTextComponent("tooltip.obsidian_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    }

}
