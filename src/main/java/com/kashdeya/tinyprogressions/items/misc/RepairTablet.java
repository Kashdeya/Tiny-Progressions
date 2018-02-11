package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.ItemBase;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class RepairTablet extends ItemBase
{
	public RepairTablet()
	{
		setMaxStackSize(1);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
		if(!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());
		
		if(worldIn.isRemote || !(entityIn instanceof EntityPlayer))
			return;
		
		stack.getTagCompound().setInteger("timer", stack.getTagCompound().getInteger("timer") + 1);
		
		if(stack.getTagCompound().getInteger("timer") < ConfigHandler.repair_tablet_cooldown)
			return;
		
		stack.getTagCompound().setInteger("timer", 0);
		
		repairAllItems((EntityPlayer)entityIn);
	}
	
	public int getMaxItemUseDuration(ItemStack stack)
    {
        return 0;
    }
	
	void repairAllItems(EntityPlayer player)
	{
		final IItemHandler inv = player.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

		for(int i = 0; i < inv.getSlots(); i++)
		{
			final ItemStack invStack = inv.getStackInSlot(i);

			if(invStack.isEmpty() || !invStack.getItem().isRepairable())
				continue;

			if(invStack != player.getItemStackFromSlot(EntityEquipmentSlot.MAINHAND) && invStack != player.getItemStackFromSlot(EntityEquipmentSlot.OFFHAND) || !player.isSwingInProgress)
			{
				if(!invStack.getHasSubtypes() && invStack.getMaxDamage() != 0 && invStack.getItemDamage() > 0)
					invStack.setItemDamage(invStack.getItemDamage() - 1);
			}
		}
	}
	
	  @Override
	  @SideOnly(Side.CLIENT)
	  public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		  tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.tablet_1").getFormattedText());
		  tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.tablet_2").getFormattedText());
	  }
}
