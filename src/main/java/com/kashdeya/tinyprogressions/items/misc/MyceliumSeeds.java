package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.util.InventoryHelper;

import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MyceliumSeeds extends ItemBase {

	public MyceliumSeeds() {
		super(new Properties().group(TinyProgressions.FoodGroup));
//		this.setTranslationKey("mycelium_seeds");
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {

		if (context.getWorld().getBlockState(context.getPos()).getBlock() == Blocks.DIRT) {
			context.getWorld().setBlockState(context.getPos(), Blocks.MYCELIUM.getDefaultState(), 2);
			context.getWorld().playSound(null, context.getPos(), SoundEvents.BLOCK_GRASS_HIT, SoundCategory.BLOCKS, 0.3f, 1.5f);
			InventoryHelper.consumeItem(context.getPlayer(), context.getPlayer().getHeldItem(context.getHand()));
			return ActionResultType.SUCCESS;
		}

		return ActionResultType.PASS;
	}


	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {
		tooltip.add(	new TranslationTextComponent("tooltip.seeds").setStyle(new Style().setColor(TextFormatting.YELLOW)));
	}

}
