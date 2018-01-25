package com.kashdeya.tinyprogressions.items.artifacts;

import java.util.List;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class FireRing extends Item{

	public FireRing() {
		super();
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	@SubscribeEvent
	public static void CheckImmuneToFire(LivingHurtEvent event) {
		if(event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntity();
			
			//you want to add lava ' || event.getSource() == DamageSource.LAVA'
			if(event.getSource() == DamageSource.ON_FIRE || event.getSource() == DamageSource.IN_FIRE) {
				if(player.inventory.hasItemStack(new ItemStack(TechItems.fire_ring))) {
					event.setCanceled(true);
					if(player.isBurning());
						player.extinguish();
				}
			}
		}
		
	}
	
//	public void onUpdate(ItemStack stack, World worldIn, Entity player, int itemSlot, boolean isSelected) {
//		if(player instanceof EntityLivingBase && worldIn.isRemote)
//			if(((EntityLivingBase) player).isBurning());
//				((EntityLivingBase) player).extinguish();
//				((EntityLivingBase) player).isImmuneToFire();
//				
//				((EntityLivingBase) player).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 0, 0, true, false));
//	}
//	
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
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.firering_1").getFormattedText());
	}
}
