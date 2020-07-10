package com.kashdeya.tinyprogressions.items.materials;
import com.google.common.base.Supplier;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import  net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.util.Lazy;

public enum ArmorMaterialTier implements IArmorMaterial{

	STONE   ("stone"   , 15 ,  new int[]{1, 3, 3, 2}  , 10,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.05F),
	FLINT   ("flint"   , 12 ,  new int[]{1, 3, 3, 1}  , 10,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.01F),
	BONE    ("bone"    , 8  ,  new int[]{1, 3, 2, 1}  , 8 ,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.02F),
	WOOD    ("wood"    , 5  ,  new int[]{1, 2, 1, 1}  , 5 ,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.01F),
	LAVA    ("lava"    , 50 ,  new int[] {5, 8, 10, 5}, 35,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F),
	WITHER  ("wither"  , 100,  new int[]{6, 9, 11, 6} , 40,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 15.0F),
	DRAGON  ("dragon"  , 200,  new int[]{7, 10, 12, 7}, 75,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 20.0F),
	OBSIDIAN("obsidian", 33 ,  new int[] {3, 6, 8, 3} , 10,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F),
	REDSTONE("redstone", 20 ,  new int[]{1, 4, 5, 1}  , 20,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.25F),
	LAPIS   ("lapis"   , 20 ,  new int[]{1, 4, 5, 3}  , 20,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F),
	QUARTZ  ("quartz"  , 20 ,  new int[]{1, 4, 5, 2}  , 12,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.2F),
	EMERALD ("emerald" , 43 ,  new int[]{4, 7, 9, 4}  , 25,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F),
	BAM     ("bam"     , 43 ,  new int[]{4, 7, 9, 4}  , 25,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5F);	
	
	int[] durability;
	int enchantability;
	float toughness;
	SoundEvent event;
	String name;
	int[] damageReducton;
//	private LazyLoadBase<Ingredient> repairMaterial;
	private Lazy<Ingredient> repairMaterial;
	
	ArmorMaterialTier(String name, int[] durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness){
		this.name =	Reference.MOD_ID +":"+ name;
		this.durability = durability;
		this.damageReducton = reductionAmounts;
		this.enchantability = enchantability;
		this.event = soundOnEquip;
		this.toughness = toughness;
	}	
	
	ArmorMaterialTier(String name, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness){
		this.name = Reference.MOD_ID +":"+ name;
		this.durability = new int[] {durability, durability, durability, durability};
		this.damageReducton = reductionAmounts;
		this.enchantability = enchantability;
		this.event = soundOnEquip;
		this.toughness = toughness;
	}
	
	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		return this.damageReducton[slot.getSlotIndex()-1];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) {
		return this.durability[slot.getSlotIndex()-1];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.get();

	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.event;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

}
