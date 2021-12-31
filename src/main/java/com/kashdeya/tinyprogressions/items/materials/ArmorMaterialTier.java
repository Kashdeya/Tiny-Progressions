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

	STONE   ("stone"   , 5 ,  new int[]{1, 3, 3, 2}  , 10,  SoundEvents.ARMOR_EQUIP_GENERIC, 0.05F, () -> { return Ingredient.of(Blocks.STONE); }, 0F),
	FLINT   ("flint"   , 4 ,  new int[]{1, 3, 3, 1}  , 10,  SoundEvents.ARMOR_EQUIP_GENERIC, 0.01F, () -> { return Ingredient.of(Items.FLINT);  }, 0F),
	BONE    ("bone"    , 3  ,  new int[]{1, 3, 2, 1}  , 8 ,  SoundEvents.ARMOR_EQUIP_GENERIC, 0.02F, () -> { return Ingredient.of(Items.BONE); }, 0F),
	WOOD    ("wood"    , 2  ,  new int[]{1, 2, 1, 1}  , 5 ,  SoundEvents.ARMOR_EQUIP_GENERIC, 0.01F, () -> { return Ingredient.of(Items.ACACIA_WOOD, Items.BIRCH_WOOD, Items.DARK_OAK_WOOD, Items.JUNGLE_WOOD, Items.OAK_WOOD, Items.SPRUCE_WOOD); }, 0F),
	LAVA    ("lava"    , 50 ,  new int[]{5, 8, 10, 5} , 35,   SoundEvents.ARMOR_EQUIP_DIAMOND, 5.0F,  () -> { return Ingredient.of(TechBlocks.lava_block.get(), TechBlocks.nether_lava_block.get(),TechBlocks.lava_infused_stone.get()); }, 0.1F),
	WITHER  ("wither"  , 100,  new int[]{6, 9, 11, 6} , 40,  SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, () -> { return Ingredient.of(TechItems.wither_rib.get()); }, 0.6F),
	DRAGON  ("dragon"  , 200,  new int[]{7, 10, 12, 7}, 75,  SoundEvents.ARMOR_EQUIP_DIAMOND, 20.0F, () -> { return Ingredient.of(TechItems.dragon_scale.get()); }, 2F),
	OBSIDIAN("obsidian", 33 ,  new int[]{3, 6, 8, 3}  , 10,   SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F,  () -> { return Ingredient.of(Items.OBSIDIAN); }, 0.2F),
	REDSTONE("redstone", 20 ,  new int[]{1, 4, 5, 1}  , 20,  SoundEvents.ARMOR_EQUIP_DIAMOND, 2.25F, () -> { return Ingredient.of(Items.REDSTONE); }, 0F),
	LAPIS   ("lapis"   , 19 ,  new int[]{1, 4, 5, 3}  , 20,  SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5F,  () -> { return Ingredient.of(Items.LAPIS_LAZULI); }, 0F),
	QUARTZ  ("quartz"  , 20 ,  new int[]{1, 4, 5, 2}  , 12,  SoundEvents.ARMOR_EQUIP_DIAMOND, 1.2F,  () -> { return Ingredient.of(Items.QUARTZ); }, 0F),
	EMERALD ("emerald" , 43 ,  new int[]{4, 7, 9, 4}  , 25,  SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F,  () -> { return Ingredient.of(Items.EMERALD); }, 0F),
	BAM     ("bam"     , 43 ,  new int[]{4, 7, 9, 4}  , 25,  SoundEvents.ARMOR_EQUIP_DIAMOND, 4.5F,  () -> { return Ingredient.of(Items.WHITE_WOOL); }, 0F);
	  
	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	private final int maxDamageFactor;
	private final int enchantability;
	private final float toughness;
	private final SoundEvent event;
	private final String name;
	private final int[] damageReducton;
	private Supplier<Ingredient> repairMaterial;
	private final float knockbackResistance;
	
	ArmorMaterialTier(String name, int durability, int[] reductionAmounts, int enchantability, SoundEvent soundOnEquip, float toughness, Supplier<Ingredient> ingredient, float resistanceAmounts){
		this.name = Reference.MOD_ID +":"+ name;
		this.maxDamageFactor = durability;
		this.damageReducton = reductionAmounts;
		this.enchantability = enchantability;
		this.event = soundOnEquip;
		this.toughness = toughness;
		this.repairMaterial = ingredient;
		this.knockbackResistance = resistanceAmounts;
	}
	
	@Override
	public int getDefenseForSlot(EquipmentSlotType slot) {
		return this.damageReducton[slot.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		return ArmorMaterialTier.MAX_DAMAGE_ARRAY[slot.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial.get();
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.event;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

//	@Override
//	public int getDefenseForSlot(EquipmentSlotType arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int getDurabilityForSlot(EquipmentSlotType arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int getEnchantmentValue() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public SoundEvent getEquipSound() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Ingredient getRepairIngredient() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
