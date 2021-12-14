package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class RepairTablet extends ItemBase {
	public RepairTablet() {
		super(new Properties().maxStackSize(1).group(TinyProgressions.ToolsGroup));

	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (!stack.hasTag())
			stack.setTag(new CompoundNBT());

		if (worldIn.isRemote || !(entityIn instanceof PlayerEntity))
			return;

		stack.getTag().putInt("timer", stack.getTag().getInt("timer") + 1);

		if (stack.getTag().getInt("timer") < ConfigHandler.repair_tablet_cooldown)
			return;

		stack.getTag().putInt("timer", 0);

		repairAllItems((PlayerEntity) entityIn);
	}

	public int getMaxItemUseDuration(ItemStack stack) {
		return 0;
	}

	void repairAllItems(PlayerEntity player) {
		final IItemHandler inv = player.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).orElse(null);
		if(inv != null)
			for (int i = 0; i < inv.getSlots(); i++) {
				final ItemStack invStack = inv.getStackInSlot(i);
	
				if (invStack.isEmpty() || !invStack.isRepairable())
					continue;
	
				if (invStack != player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)	&& invStack != player.getItemStackFromSlot(EquipmentSlotType.OFFHAND)
						|| !player.isSwingInProgress) 
				{
					if (invStack.isDamageable() && invStack.isDamaged())
						invStack.setDamage(invStack.getDamage() - 1);
				}
			}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.tablet_1"));
		tooltip.add(new TranslationTextComponent("tooltip.tablet_2"));
	}
}
