package com.kashdeya.tinyprogressions.items.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class MetaItemBlock extends BlockItem
{
	protected String[] unlocalNames;
	
	public MetaItemBlock(Block block)
	{
		super(block, new Properties().maxDamage(0));
		
//		this.unlocalNames = ((IMetadata)block).getUnlocalizedNames();
	}
	
//	@Override
//	public int getMetadata(int damage)
//	{
//		return damage;
//	}
//	
//	@Override
//	public String getTranslationKey(ItemStack stack)
//	{
//		return "tile." + unlocalNames[stack.getItemDamage()];
//	}
}
