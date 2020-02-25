package com.kashdeya.tinyprogressions.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.items.materials.ArmorMaterialTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class BaseArmor extends ArmorItem {
	 
	//TODO move into registration later mostly place holders for the time being
	static {
		BaseArmor bamShirt =     new BaseArmor(ArmorMaterialTier.BAM, EquipmentSlotType.CHEST, "tooltip.bamsarmor_1", new Properties());
		
		BaseArmor boneArmorHead =  new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.HEAD, new Properties());
		BaseArmor boneArmorChest = new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.CHEST, new Properties());
		BaseArmor boneArmorLegs =  new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.LEGS, new Properties());
		BaseArmor boneArmorFeet =  new BaseArmor(ArmorMaterialTier.BONE, EquipmentSlotType.FEET, new Properties());
		
		BaseArmor emeraldArmorHead =  new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.HEAD, new Properties());
		BaseArmor emeraldArmorChest = new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.CHEST, new Properties());
		BaseArmor emeraldArmorLegs =  new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.LEGS, new Properties());
		BaseArmor emeraldArmorFeet =  new BaseArmor(ArmorMaterialTier.EMERALD, EquipmentSlotType.FEET, new Properties());
		
		BaseArmor flintArmorHead =  new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.HEAD, new Properties());
		BaseArmor flintArmorChest = new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.CHEST, new Properties());
		BaseArmor flintArmorLegs =  new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.LEGS, new Properties());
		BaseArmor flintArmorFeet =  new BaseArmor(ArmorMaterialTier.FLINT, EquipmentSlotType.FEET, new Properties());
		
		BaseArmor woodArmorHead =  new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.HEAD, new Properties());
		BaseArmor woodArmorChest = new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.CHEST, new Properties());
		BaseArmor woodArmorLegs =  new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.LEGS, new Properties());
		BaseArmor woodArmorFeet =  new BaseArmor(ArmorMaterialTier.WOOD, EquipmentSlotType.FEET, new Properties());
		
		BaseArmor stoneArmorHead =  new StoneArmor(EquipmentSlotType.HEAD, new Properties());
		BaseArmor stoneArmorChest = new StoneArmor(EquipmentSlotType.CHEST, new Properties());
		BaseArmor stoneArmorLegs =  new StoneArmor(EquipmentSlotType.LEGS, new Properties());
		BaseArmor stoneArmorFeet =  new StoneArmor(EquipmentSlotType.FEET, new Properties());
		
		BaseArmor redstoneArmorHead =  new RedstoneArmor(EquipmentSlotType.HEAD, new Properties());
		BaseArmor redstoneArmorChest = new RedstoneArmor(EquipmentSlotType.CHEST, new Properties());
		BaseArmor redstoneArmorLegs =  new RedstoneArmor(EquipmentSlotType.LEGS, new Properties());
		BaseArmor redstoneArmorFeet =  new RedstoneArmor(EquipmentSlotType.FEET, new Properties());
		
		BaseArmor quartzArmorHead =  new QuartzArmor(EquipmentSlotType.HEAD, new Properties());
		BaseArmor quartzArmorChest = new QuartzArmor(EquipmentSlotType.CHEST, new Properties());
		BaseArmor quartzArmorLegs =  new QuartzArmor(EquipmentSlotType.LEGS, new Properties());
		BaseArmor quartzArmorFeet =  new QuartzArmor(EquipmentSlotType.FEET, new Properties());
		
		BaseArmor obsidianArmorHead =  new ObsidianArmor(EquipmentSlotType.HEAD, new Properties());
		BaseArmor obsidianArmorChest = new ObsidianArmor(EquipmentSlotType.CHEST, new Properties());
		BaseArmor obsidianArmorLegs =  new ObsidianArmor(EquipmentSlotType.LEGS, new Properties());
		BaseArmor obsidianArmorFeet =  new ObsidianArmor(EquipmentSlotType.FEET, new Properties());
		
		BaseArmor witherArmorHead =  new WitherArmour(EquipmentSlotType.HEAD, new Properties());
		BaseArmor witherArmorChest = new WitherArmour(EquipmentSlotType.CHEST, new Properties());
		BaseArmor witherArmorLegs =  new WitherArmour(EquipmentSlotType.LEGS, new Properties());
		BaseArmor witherArmorFeet =  new WitherArmour(EquipmentSlotType.FEET, new Properties());
		
		BaseArmor lavaArmorHead =  new LavaArmour(EquipmentSlotType.HEAD, new Properties());
		BaseArmor lavaArmorChest = new LavaArmour(EquipmentSlotType.CHEST, new Properties());
		BaseArmor lavaArmorLegs =  new LavaArmour(EquipmentSlotType.LEGS, new Properties());
		BaseArmor lavaArmorFeet =  new LavaArmour(EquipmentSlotType.FEET, new Properties());
		
		BaseArmor lapisArmorHead =  new LapisArmor(EquipmentSlotType.HEAD, new Properties());
		BaseArmor lapisArmorChest = new LapisArmor(EquipmentSlotType.CHEST, new Properties());
		BaseArmor lapisArmorLegs =  new LapisArmor(EquipmentSlotType.LEGS, new Properties());
		BaseArmor lapisArmorFeet =  new LapisArmor(EquipmentSlotType.FEET, new Properties());
		
		BaseArmor dragonArmorHead =  new LapisArmor(EquipmentSlotType.HEAD, new Properties());
		BaseArmor dragonArmorChest = new LapisArmor(EquipmentSlotType.CHEST, new Properties());
		BaseArmor dragonArmorLegs =  new LapisArmor(EquipmentSlotType.LEGS, new Properties());
		BaseArmor dragonArmorFeet =  new LapisArmor(EquipmentSlotType.FEET, new Properties());
	
	}
	
	private String tooltipString = null;
	
	
	public BaseArmor(ArmorMaterialTier tier, EquipmentSlotType slot, Properties prop) {
		this(tier, slot, null, prop);
	}
	
	public BaseArmor(ArmorMaterialTier tier, EquipmentSlotType slot, String tooltipTranslation, Properties prop) {
		super(tier, slot, prop);
		
		this.tooltipString = tooltipTranslation;
		
		prop.maxStackSize(1)
			.group(TinyProgressions.TAB);
	}
	

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(tooltipString != null)
			tooltip.add(new TranslationTextComponent(this.tooltipString).setStyle(new Style().setColor(TextFormatting.YELLOW)));
    }
}
