package com.arclighttw.utilities.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Renderer
{
	public Block block;
	public Item item;
	public int metadata;
	public ResourceLocation model;
	
	public Renderer(Item item)
	{
		this(item, 0);
	}
	
	public Renderer(Item item, int metadata)
	{
		this(item, metadata, item.getRegistryName());
	}
	
	public Renderer(Item item, int metadata, ResourceLocation model)
	{
		this(null, item, metadata, model);
	}
	
	public Renderer(Block block)
	{
		this(block, 0);
	}
	
	public Renderer(Block block, int metadata)
	{
		this(block, metadata, block.getRegistryName());
	}
	
	public Renderer(Block block, int metadata, ResourceLocation model)
	{
		this(block, null, metadata, model);
	}
	
	Renderer(Block block, Item item, int metadata, ResourceLocation model)
	{
		this.block = block;
		this.item = item;
		this.metadata = metadata;
		this.model = model;
	}
	
	@SideOnly(Side.CLIENT)
	public void register()
	{
		Item localItem = item;
		
		if(localItem == null)
			localItem = Item.getItemFromBlock(block);
		
		if(localItem == null)
			return;
		
		ModelLoader.setCustomModelResourceLocation(localItem, metadata, new ModelResourceLocation(model, "inventory"));
	}
}
