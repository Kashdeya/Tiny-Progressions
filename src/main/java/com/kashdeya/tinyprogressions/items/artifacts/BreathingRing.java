package com.kashdeya.tinyprogressions.items.artifacts;

import java.util.List;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class BreathingRing extends Item {

	public BreathingRing() {
		super();
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	@SubscribeEvent
	public static void noMore(LivingAttackEvent event){
		if(event.getEntity() instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) event.getEntity();
			
			if(event.getSource() == DamageSource.DROWN) {
				if(player.inventory.hasItemStack(new ItemStack(TechItems.breathing_ring))) {
					event.setCanceled(true);
				}
			}
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
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.breathingring_1").getFormattedText());
	}
}