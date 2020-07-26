package com.kashdeya.tinyprogressions.items.materials;
import com.google.common.base.Supplier;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
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

	STONE   ("stone"   , 5 ,  new int[]{1, 3, 3, 2}  , 10,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.05F, () -> { return Ingredient.fromItems(Blocks.STONE); }),
	FLINT   ("flint"   , 4 ,  new int[]{1, 3, 3, 1}  , 10,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.01F, () -> { return Ingredient.fromItems(Items.FLINT);  }),
	BONE    ("bone"    , 3  ,  new int[]{1, 3, 2, 1}  , 8 ,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.02F, () -> { return Ingredient.fromItems(Items.BONE); }),
	WOOD    ("wood"    , 2  ,  new int[]{1, 2, 1, 1}  , 5 ,  SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.01F, () -> { return Ingredient.fromItems(Items.ACACIA_WOOD, Items.BIRCH_WOOD, Items.DARK_OAK_WOOD, Items.JUNGLE_WOOD, Items.OAK_WOOD, Items.SPRUCE_WOOD); }),
	LAVA    ("lava"    , 50 ,  new int[]{5, 8, 10, 5} , 35,   SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F,  () -> { return Ingredient.fromItems(TechBlocks.lava_block.get(), TechBlocks.nether_lava_block.get(),TechBlocks.lava_infused_stone.get()); }),
	WITHER  ("wither"  , 100,  new int[]{6, 9, 11, 6} , 40,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 15.0F, () -> { return Ingredient.fromItems(TechItems.wither_rib.get()); }),
	DRAGON  ("dragon"  , 200,  new int[]{7, 10, 12, 7}, 75,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 20.0F, () -> { return Ingredient.fromItems(TechItems.dragon_scale.get()); }),
	OBSIDIAN("obsidian", 33 ,  new int[]{3, 6, 8, 3}  , 10,   SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F,  () -> { return Ingredient.fromItems(Items.OBSIDIAN); }),
	REDSTONE("redstone", 20 ,  new int[]{1, 4, 5, 1}  , 20,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.25F, () -> { return Ingredient.fromItems(Items.REDSTONE); }),
	LAPIS   ("lapis"   , 19 ,  new int[]{1, 4, 5, 3}  , 20,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F,  () -> { return Ingredient.fromItems(Items.LAPIS_LAZULI); }),
	QUARTZ  ("quartz"  , 20 ,  new int[]{1, 4, 5, 2}  , 12,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.2F,  () -> { return Ingredient.fromItems(Items.QUARTZ); }),
	EMERALD ("emerald" , 43 ,  new int[]{4, 7, 9, 4}  , 25,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F,  () -> { return Ingredient.fromItems(Items.EMERALD); }),
	BAM     ("bam"     , 43 ,  new int[]{4, 7, 9, 4}  , 25,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5F,  () -> { return Ingredient.fromItems(Items.WHITE_WOOL); });	
	  
	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	private final int maxDamageFactor;
	private final int enchantability;
	private final float toughness;
	private final SoundEvent event;
	private final String name;
	private final int[] damageReducton;
	private Supplier<Ingredient> repairMaterial;
	
	ArmorMaterialTier(String name, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness, Supplier<Ingredient> ingredient){
		this.name = Reference.MOD_ID +":"+ name;
		this.maxDamageFactor = durability;
		this.damageReducton = reductionAmounts;
		this.enchantability = enchantability;
		this.event = soundOnEquip;
		this.toughness = toughness;
		this.repairMaterial = ingredient;
	}
	
	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		return this.damageReducton[slot.getSlotIndex()-1];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) {
		return ArmorMaterialTier.MAX_DAMAGE_ARRAY[slot.getIndex()] * this.maxDamageFactor;
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
