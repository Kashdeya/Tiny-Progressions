package com.kashdeya.tinyprogressions.items.tools;

import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.collect.Sets;
import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.items.tools.base.BasePickaxe;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class BirthdayPickaxe extends BasePickaxe {
	
	private static final Set<Block> effective_against = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.STONE_SLAB, Blocks.DETECTOR_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);
    
	public BirthdayPickaxe(Properties prop)
	{
		super(ItemToolModTier.BIRTHDAY, 0, 0, prop);
		prop.defaultDurability(6521);
		prop.addToolType(ToolType.PICKAXE, 4);
	}
	 
   

	@Override
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
       	tooltip.add(new TranslationTextComponent("tooltip.birthday_1"));
       	tooltip.add(new TranslationTextComponent("tooltip.birthday_2"));
	}
    
   
	@Override
	public ActionResultType useOn(ItemUseContext context) {
		if (!context.getLevel().isClientSide()) {
			BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
			if (!context.getPlayer().mayUseItemAt(pos, context.getClickedFace(), context.getPlayer().getItemInHand(context.getHand()))) {
				return ActionResultType.FAIL;
			} else if (context.getLevel().isEmptyBlock(pos)) {
				if (context.getPlayer().getName().getContents().equalsIgnoreCase("dark" + "osto")) {
					context.getPlayer().sendMessage(new TranslationTextComponent("HAPPY BIRTHDAY DARKOSTO"), context.getPlayer().getUUID());
					FireworkRocketEntity firework = new FireworkRocketEntity(context.getLevel(), context.getItemInHand(), context.getPlayer());
					firework.setPos(context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
					context.getPlayer().level.addFreshEntity(firework);
				}
				context.getLevel().setBlockAndUpdate(pos, Blocks.CAKE.defaultBlockState());
				context.getPlayer().getItemInHand(context.getHand()).hurtAndBreak(854, context.getPlayer(), (p_220040_1_) -> {
	                  p_220040_1_.broadcastBreakEvent(context.getHand());
	               });
				return ActionResultType.SUCCESS;
			}
		}
		return ActionResultType.PASS;
	}

}
