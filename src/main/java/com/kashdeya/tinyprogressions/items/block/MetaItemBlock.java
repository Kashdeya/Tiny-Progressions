package com.kashdeya.tinyprogressions.items.block;

import com.kashdeya.tinyprogressions.util.IMetadata;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MetaItemBlock extends ItemBlock
{
	protected String[] unlocalNames;
	
	public MetaItemBlock(Block block)
	{
		super(block);
		setMaxDamage(0);
		setHasSubtypes(true);
		
		this.unlocalNames = ((IMetadata)block).getUnlocalizedNames();
	}
	
	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return "tile." + unlocalNames[stack.getItemDamage()];
	}
}
