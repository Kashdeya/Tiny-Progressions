package com.kashdeya.tinyprogressions.items.materials;

import com.google.common.base.Supplier;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
public enum ItemToolModTier implements IItemTier
{
	// Tools
	BONE       (0, 49,    1.0F,   0.25F, 15,() -> { return Ingredient.of(Items.BONE); }),
	FLINT      (0, 89,    3.0F,   0.5F,  15,() -> { return Ingredient.of(Items.FLINT); }),
	BIRTHDAY   (4, 3061,  100.0F, 10.0F, 22,() -> { return Ingredient.of(TechItems.reinforced_obsidian_ingot.get()); }),
	OBSIDIAN   (4, 1721,  9.0F,   4.0F,  10,() -> { return Ingredient.of(Items.OBSIDIAN); }),
	EMERALD    (4, 2961,  10.0F,  5.0F,  22,() -> { return Ingredient.of(Items.EMERALD); }),
	KAPPA      (4, 31513, 18.0F,  40,    54,() -> { return Ingredient.of(TechItems.wub_ingot.get()); }),
	BSCIRON    (3, 2750,  12.0F,  8.0F,  14,() -> { return Ingredient.of(Items.IRON_INGOT); }),
	BSCDIAMOND (3, 4549,  16.0F,  5.0F,  10,() -> { return Ingredient.of(Items.DIAMOND); }),
	BSCGOLD    (0, 788,   16.0F,  2.0F,  22,() -> { return Ingredient.of(Items.GOLD_INGOT); }),
	WUBWUB     (4, 3261,  12.0F,  7.0F,  22,() -> { return Ingredient.of(TechItems.wub_ingot.get()); }),
	//Paxels
	PWOOD      (0, 59, 2.0F, 5.0F, 15,() -> { return Ingredient.of(Items.ACACIA_WOOD, Items.BIRCH_WOOD, Items.DARK_OAK_WOOD, Items.JUNGLE_WOOD, Items.OAK_WOOD, Items.SPRUCE_WOOD); }),
	PSTONE     (1, 131, 4.0F, 7.0F, 5,() -> { return Ingredient.of(Items.STONE); }),
	PIRON      (2, 250, 6.0F, 8.0F, 14,() -> { return Ingredient.of(Items.IRON_BARS); }),
	PDIAMOND   (3, 1561, 8.0F, 10.0F, 10,() -> { return Ingredient.of(Items.DIAMOND); }),
	PGOLD      (0, 32, 5.0F, 1.2F, 22,() -> { return Ingredient.of(Items.GOLD_INGOT); }),
	POBSIDIAN  (4, 2500, 9.0F, 11.0F, 10,() -> { return Ingredient.of(Items.OBSIDIAN); }),
	PEMERALD   (4, 4000, 10.0F, 12.0F, 22,() -> { return Ingredient.of(Items.EMERALD); }),
	PFLINT     (0, 89, 4.0F, 5.5F, 15,() -> { return Ingredient.of(Items.FLINT); }),
	PWUBWUB    (4, 4250, 12.0F, 14.0F, 22,() -> { return Ingredient.of(TechItems.wub_ingot.get());}),
	//SeaAxe
	SEAIRON    (3, 3500, 10.0F, 10.0F, 22,() -> { return Ingredient.of(Items.IRON_INGOT); });

    private int harvestLevel;
    private int maxUses;
    private float efficiency;
    private float attackDamage;
    private int enchantability;
    private Supplier<Ingredient> repairMaterial;

    private ItemToolModTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> ingredient)
    {
    	
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = ingredient;
    }

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage; 
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public int getLevel() {
		return this.harvestLevel;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial.get();
	}

	@Override
	public float getSpeed() {
		return this.efficiency;
	}

	@Override
	public int getUses() {
		return this.maxUses;
	}
}