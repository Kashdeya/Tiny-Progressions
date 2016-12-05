package com.kashdeya.tinyprogressions.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.tinyprogressions.handlers.RenderHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        // Load Renders
        RenderHandler.initItems();
        RenderHandler.initBlocks();
        RenderHandler.initArmor();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }   
    
    @Override
	public void setCustomStateMap(Block block, StateMap stateMap) {
		ModelLoader.setCustomStateMapper(block, stateMap);
	}
}
