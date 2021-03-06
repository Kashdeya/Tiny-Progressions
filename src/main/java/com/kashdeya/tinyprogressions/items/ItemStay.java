package com.kashdeya.tinyprogressions.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemStay extends ItemBase {
	
	public ItemStay(Properties prop) {
		super(prop);
	}
	
    @Override
    public void setDamage(ItemStack stack, int damage){}

    @Override
    public boolean isRepairable(ItemStack stack) {
        return super.isRepairable(stack);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return super.getIsRepairable(toRepair, repair);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack){return true;}

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        return new ItemStack(getItem());
    }
	   
	@Override
	 public boolean isDamageable() {
		 return false;
	 }
	
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,	ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.stay_1"));
    }
}