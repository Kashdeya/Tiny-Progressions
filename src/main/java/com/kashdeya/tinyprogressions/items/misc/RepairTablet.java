package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.items.ItemBase;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
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
		super(new Properties().stacksTo(1).tab(TinyProgressions.ToolsGroup));
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (!stack.hasTag())
			stack.setTag(new CompoundNBT());

		if (worldIn.isClientSide() || !(entityIn instanceof PlayerEntity))
			return;

		PlayerEntity player = (PlayerEntity) entityIn;
		boolean isHolding =false;

		if(player.getItemBySlot(EquipmentSlotType.OFFHAND).sameItem(stack) || player.getItemBySlot(EquipmentSlotType.MAINHAND).sameItem(stack))
			isHolding = true;

		if(!isHolding)
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
	
				if (invStack != player.getItemBySlot(EquipmentSlotType.MAINHAND) && invStack != player.getItemBySlot(EquipmentSlotType.OFFHAND) || !player.swinging) 
				{
					if (invStack.isDamageableItem() && invStack.isDamaged())
						invStack.setDamageValue(invStack.getDamageValue()-1);
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
