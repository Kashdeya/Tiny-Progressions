package com.kashdeya.tinyprogressions.items.block;

import com.kashdeya.tinyprogressions.registry.utils.IMetadata;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class MetaItemBlock extends BlockItem
{
	protected String[] unlocalNames;
	
	public MetaItemBlock(Block block)
	{
		super(block, new Properties());
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
	public String getTranslationKey(ItemStack stack)
	{
		return "tile." + unlocalNames[stack.getItemDamage()];
	}
}
