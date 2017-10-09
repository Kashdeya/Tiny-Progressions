package com.arclighttw.utilities;

import java.util.List;
import java.util.Map;

import com.arclighttw.utilities.client.Renderer;
import com.arclighttw.utilities.client.RendererStateMap;
import com.arclighttw.utilities.client.RendererTESR;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Registry
{
	Map<String, Block> blocks = Maps.newHashMap();
	Map<String, Item> items = Maps.newHashMap();
	Map<String, Class<? extends TileEntity>> tiles = Maps.newHashMap();
	
	Map<Class<? extends TileEntity>, Block> tesrBlocks = Maps.newHashMap();
	
	List<Renderer> renderers = Lists.newArrayList();
	List<RendererStateMap> stateMaps = Lists.newArrayList();
	List<RendererTESR<?>> tesrs = Lists.newArrayList();
	
	public Registry()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void register(Block block)
	{
		String key = block.getRegistryName().toString();
		
		if(blocks.containsKey(key))
			blocks.remove(key);
		
		blocks.put(key, block);
		register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		
		if(block instanceof ITileEntityProvider)
			tesrBlocks.put(((ITileEntityProvider)block).createNewTileEntity(null, -1).getClass(), block);
	}
	
	public void register(Item item)
	{
		String key = item.getRegistryName().toString();
		
		if(items.containsKey(key))
			items.remove(key);
		
		items.put(key, item);
	}
	
	public void register(Class<? extends TileEntity> clazz, Block block)
	{
		tiles.put(block.getRegistryName().toString() + "TILE", clazz);
	}
	
	@SideOnly(Side.CLIENT)
	public void render(Renderer renderer)
	{
		renderers.add(renderer);
	}
	
	@SideOnly(Side.CLIENT)
	public void renderStateMap(Block block, StateMap stateMap)
	{
		stateMaps.add(new RendererStateMap(block, stateMap));
	}
	
	@SideOnly(Side.CLIENT)
	public <T extends TileEntity> void renderTESR(Class<T> clazz, TileEntitySpecialRenderer<? super T> renderer)
	{
		tesrs.add(new RendererTESR<T>(clazz, renderer));
	}
		
	@SubscribeEvent
	public void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		for(Map.Entry<String, Block> block : blocks.entrySet())
			event.getRegistry().register(block.getValue());
		
		for(Map.Entry<String, Class<? extends TileEntity>> tile : tiles.entrySet())
			GameRegistry.registerTileEntity(tile.getValue(), tile.getKey());
	}
	
	@SubscribeEvent
	public void onItemRegister(RegistryEvent.Register<Item> event)
	{
		for(Map.Entry<String, Item >item : items.entrySet())
			event.getRegistry().register(item.getValue());
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onModelRegister(ModelRegistryEvent event)
	{
		for(Renderer renderer : renderers)
			renderer.register();
		
		for(RendererStateMap stateMap : stateMaps)
			stateMap.register();
		
		for(RendererTESR<?> tesr : tesrs)
			tesr.register(tesrBlocks.get(tesr.clazz));
	}
}
