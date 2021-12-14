package com.kashdeya.tinyprogressions.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemStay extends ItemBase {
	
	
	private Item repairItem;
	private ResourceLocation repairTag;
	
	public ItemStay(Properties prop) {
		
		super(prop);
	}
    
    public ItemStay setRepairItem(Item repair) {
    	this.repairItem = repair;
    	return this;
    }
    
    public Item getRepairItem() {
    	return this.repairItem;
    }
    
    
    public ItemStay setRepairTag(ResourceLocation repair) {
    	this.repairTag = repair;
    	return this;
    }


    @Override
    public boolean isRepairable(ItemStack stack) {
        return super.isRepairable(stack);
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
    	
    	if(this.repairItem != null && repair.getItem() == this.getRepairItem())
    		return true;
    	else if(this.repairTag != null && ItemTags.getAllTags().getTagOrEmpty(this.repairTag).contains(this.getItem()))
    		return true;
    	
    	return super.isValidRepairItem(toRepair, repair);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack){return true;}

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	ItemStack returnItem = new ItemStack(getItem());
    	returnItem.hurt(1, Item.random, null);
        return returnItem;
    }
	   
	@Override
	 public boolean canBeDepleted() {
		 return super.canBeDepleted();
	}
	
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,	ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.stay_1"));
    }
}