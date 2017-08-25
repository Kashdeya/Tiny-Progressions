package com.kashdeya.tinyprogressions.items.block;

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
		
		this.unlocalNames = ((IBlockMetadata)block).getUnlocalizedNames();
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
	/*
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		for(int i = 0; i < unlocalNames.length; i++)
			items.add(new ItemStack(this, 1, i));
	}
	*/
	public interface IBlockMetadata
	{
		public String[] getUnlocalizedNames();
	}
}
