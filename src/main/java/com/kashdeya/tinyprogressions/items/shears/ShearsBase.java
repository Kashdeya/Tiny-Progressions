package com.kashdeya.tinyprogressions.items.shears;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.ItemShears;

public class ShearsBase extends ItemShears {
	
    public ShearsBase()
    {
    		this.maxStackSize = 1;
    		this.setCreativeTab(TinyProgressions.tabTP);
    }
}
