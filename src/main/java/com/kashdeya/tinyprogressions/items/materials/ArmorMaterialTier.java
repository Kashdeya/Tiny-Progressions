package com.kashdeya.tinyprogressions.items.materials;
import net.minecraft.inventory.EquipmentSlotType;
import  net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum ArmorMaterialTier implements IArmorMaterial{

	STONE   ("stoneArmourMaterial"   , 15 , new int[]{1, 3, 3, 2}  , 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.05F),
	FLINT   ("flintArmourMaterial"   , 12 , new int[]{1, 3, 3, 1}  , 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.01F),
	BONE    ("boneArmourMaterial"    , 8  , new int[]{1, 3, 2, 1}  , 8 , SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.02F),
	WOOD    ("woodArmourMaterial"    , 5  , new int[]{1, 2, 1, 1}  , 5 , SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.01F),
	LAVA    ("lavaArmorMaterial"     , 50 , new int[] {5, 8, 10, 5}, 35, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F),
	WITHER  ("witherArmorMaterial"   , 100, new int[]{6, 9, 11, 6} , 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 15.0F),
	DRAGON  ("dragonArmorMaterial"   , 200, new int[]{7, 10, 12, 7}, 75, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 20.0F),
	OBSIDIAN("obsidianArmorMaterial" , 33 , new int[] {3, 6, 8, 3} , 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F),
	REDSTONE("redstoneArmourMaterial", 20 , new int[]{1, 4, 5, 1}  , 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.25F),
	LAPIS   ("lapisArmourMaterial"   , 20 , new int[]{1, 4, 5, 3}  , 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F),
	QUARTZ  ("quartzArmourMaterial"  , 20 , new int[]{1, 4, 5, 2}  , 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.2F),
	EMERALD ("emeraldArmourMaterial" , 43 , new int[]{4, 7, 9, 4}  , 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F),
	BAM     ("bamArmourMaterial"     , 43 , new int[]{4, 7, 9, 4}  , 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5F);
	
	
	int[] durability;
	int enchantability;
	float toughness;
	SoundEvent event;
	String name;
	int[] damageReducton;
	private LazyLoadBase<Ingredient> repairMaterial;
	
	ArmorMaterialTier(String name, int[] durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness){
		this.name = name;
		this.durability = durability;
		this.damageReducton = reductionAmounts;
		this.enchantability = enchantability;
		this.event = soundOnEquip;
		this.toughness = toughness;
	}	
	
	ArmorMaterialTier(String name, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness){
		this.name = name;
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
		return this.damageReducton[slot.getSlotIndex()-1];
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
		return this.repairMaterial.getValue(); 
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
