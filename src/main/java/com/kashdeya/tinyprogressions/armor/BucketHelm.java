package com.kashdeya.tinyprogressions.armor;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BucketHelm extends ItemArmor {
	
	public BucketHelm(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
		super(material, renderIndex, equipmentSlotIn);
		this.maxStackSize = 1;
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.IRON_INGOT);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
    	ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
    	if (((head != null) && (head.getItem() == TechArmor.bucket_helm)) || 
    	(entity.capabilities.isCreativeMode) || (entity.isSpectator())) {
    		entity.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 180, 0, false, false));
    	}
    }
}
