package com.kashdeya.tinyprogressions.items.tools;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class KappaPick extends ItemPickaxe{
	
	private final Item.ToolMaterial material;
	
	public KappaPick(Item.ToolMaterial material)
	{
		super(material);
        this.setMaxDamage(ConfigHandler.kappa_damage);
        this.material = material;
        this.maxStackSize = 1;
        this.setHarvestLevel("pickaxe", ConfigHandler.kappa_level);
		this.setUnlocalizedName("kappa_pick");
	    this.setCreativeTab(TinyProgressions.tabTP);
	}
}
