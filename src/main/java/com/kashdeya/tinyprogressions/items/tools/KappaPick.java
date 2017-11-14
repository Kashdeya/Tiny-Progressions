package com.kashdeya.tinyprogressions.items.tools;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class KappaPick extends ItemPickaxe{
	
	private final Item.ToolMaterial material;
	
	public KappaPick(Item.ToolMaterial material)
	{
		super(material);
        this.setMaxDamage(51313);
        this.material = material;
        this.maxStackSize = 1;
        this.setHarvestLevel("pickaxe", 1);
		this.setUnlocalizedName("kappa_pick");
	    this.setCreativeTab(TinyProgressions.tabTP);
	}
}
