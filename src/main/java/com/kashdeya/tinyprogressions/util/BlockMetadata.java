package com.kashdeya.tinyprogressions.util;

import com.kashdeya.tinyprogressions.items.block.MetaItemBlock;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.models.IModelRegistrar;
import com.kashdeya.tinyprogressions.registry.utils.IItemProvider;
import com.kashdeya.tinyprogressions.registry.utils.IMetadata;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMetadata extends Block implements IModelRegistrar, IMetadata, IItemProvider
{
	protected String[] unlocalNames;
	
	public BlockMetadata(Material material, String[] unlocalNames)
	{
		super(material);
        setCreativeTab(TinyProgressions.tabTP);
		this.unlocalNames = unlocalNames;
	}
	
	@Override
	public ItemBlock createItemBlock()
	{
		return new MetaItemBlock(this);
	}
	
	@Override
	public String[] getUnlocalizedNames()
	{
		return unlocalNames;
	}
	
	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if(tab == TinyProgressions.tabTP) {
			for(int i = 0; i < unlocalNames.length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels() {
		for(int i = 0; i < unlocalNames.length; i++) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), i, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, unlocalNames[i]), "inventory"));
		}
	}
}
