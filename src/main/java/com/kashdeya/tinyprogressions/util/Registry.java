package com.kashdeya.tinyprogressions.util;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import com.google.common.collect.Lists;
import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registry
{
	private List<Block> blocks;
	private List<Item> items;
	private List<Consumer<Integer>> tiles;
	
	private List<Renderer> renderers;
	private List<Consumer<Integer>> tileRenderers;
	private List<Consumer<Integer>> customStates;
	
	public Registry()
	{
		blocks = Lists.newArrayList();
		items = Lists.newArrayList();
		tiles = Lists.newArrayList();
		
		renderers = Lists.newArrayList();
		tileRenderers = Lists.newArrayList();
		customStates = Lists.newArrayList();
	}
	
	public void setCustomStateMap(Block block, StateMap stateMap)
	{
		customStates.add((unusedInteger) -> { ModelLoader.setCustomStateMapper(block, stateMap); });
	}
	
	public void register(Block block)
	{
		blocks.add(block);
	}
	
	public void register(Item item)
	{
		items.add(item);
	}
	
	public void register(Class<? extends TileEntity> clazz, String name)
	{
		tiles.add((unusedInteger) -> { GameRegistry.registerTileEntity(clazz, name); });
	}
	
	public void render(Block block)
	{
		render(block, block == null ? "" : block.getRegistryName().toString());
	}
	
	public void render(Block block, String name)
	{
		render(block, 0, name);
	}
	
	public void render(Block block, int metadata, String name)
	{
		if(block == null)
			return;
		
		if(!name.contains(":"))
			name = Reference.MOD_ID + ":" + name;
		
		renderers.add(new Renderer(block, metadata, new ResourceLocation(name)));
	}
	
	public void render(Item item)
	{
		render(item, item == null ? "" : item.getRegistryName().toString());
	}
	
	public void render(Item item, String name)
	{
		render(item, 0, name);
	}
	
	public void render(Item item, int metadata, String name)
	{
		if(item == null)
			return;
		
		if(!name.contains(":"))
			name = Reference.MOD_ID + ":" + name;
		
		renderers.add(new Renderer(item, metadata, new ResourceLocation(name)));
	}
	
	public <T extends TileEntity> void render(Class<T> clazz, TileEntitySpecialRenderer<? super T> renderer)
	{
		tileRenderers.add((unusedInteger) -> { ClientRegistry.bindTileEntitySpecialRenderer(clazz, renderer); });
	}
	
	public void preInit()
	{
		Iterator<Renderer> r = renderers.iterator();
		
		while(r.hasNext())
		{
			Renderer renderer = r.next();
			
			Item item = null;
			
			if(renderer.object instanceof Item)
				item = (Item)renderer.object;
			else if(renderer.object instanceof Block)
				item = Item.getItemFromBlock((Block)renderer.object);
			else
				continue;
			
			ModelLoader.setCustomModelResourceLocation(item, renderer.metadata, new ModelResourceLocation(renderer.location, "inventory"));
		}
	}
	
	public void init()
	{
		Iterator<Renderer> r = renderers.iterator();
		
		while(r.hasNext())
		{
			Renderer renderer = r.next();
			
			Item item = null;
			
			if(renderer.object instanceof Item)
				item = (Item)renderer.object;
			else if(renderer.object instanceof Block)
				item = Item.getItemFromBlock((Block)renderer.object);
			else
				continue;
			
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, renderer.metadata, new ModelResourceLocation(renderer.location, "inventory"));
		}
		
		Iterator<Consumer<Integer>> t;
		
		t = tiles.iterator();
		while(t.hasNext())
			t.next().accept(0);
		
		t = tileRenderers.iterator();
		while(t.hasNext())
			t.next().accept(0);
		
		t = customStates.iterator();
		while(t.hasNext())
			t.next().accept(0);
	}
	
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
		Iterator<Block> b = blocks.iterator();

		while(b.hasNext())
			event.getRegistry().register(b.next());
	}
	
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event)
	{
		Iterator<Item> i = items.iterator();

		while(i.hasNext())
			event.getRegistry().register(i.next());
	}
	
	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
	}
	
	private static class Renderer
	{
		public Object object;
		public int metadata;
		public ResourceLocation location;
		
		private Renderer(Object object, int metadata, ResourceLocation location)
		{
			this.object = object;
			this.metadata = metadata;
			this.location = location;
		}
	}
}
