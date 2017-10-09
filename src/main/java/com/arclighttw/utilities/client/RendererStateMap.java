package com.arclighttw.utilities.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RendererStateMap
{
	public Block block;
	
	@SideOnly(Side.CLIENT)
	public StateMap stateMap;
	
	public RendererStateMap(Block block, StateMap stateMap)
	{
		this.block = block;
		this.stateMap = stateMap;
	}
	
	@SideOnly(Side.CLIENT)
	public void register()
	{
		ModelLoader.setCustomStateMapper(block, stateMap);
	}
}
