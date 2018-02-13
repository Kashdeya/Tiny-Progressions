package com.kashdeya.tinyprogressions.items.artifacts;

import java.util.List;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RegenRing extends Item {
	
	public RegenRing() {
		super();
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	public void onUpdate(ItemStack stack, World worldIn, Entity entityln, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer)entityln;
		if (player.inventory.hasItemStack(new ItemStack(TechItems.regen_ring))){
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20, 0, false, false));
		}
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}
	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack){
        return true;
    }
    
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced)
	{
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.regenring_1").getFormattedText());
	}
}