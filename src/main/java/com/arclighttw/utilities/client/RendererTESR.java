package com.arclighttw.utilities.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RendererTESR<T extends TileEntity>
{
	public Class<T> clazz;
	public TileEntitySpecialRenderer<? super T> renderer;
	
	public RendererTESR(Class<T> clazz, TileEntitySpecialRenderer<? super T> renderer)
	{
		this.clazz = clazz;
		this.renderer = renderer;
	}
	
	public void register(Block block)
	{
		ClientRegistry.bindTileEntitySpecialRenderer(clazz, renderer);
		
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
