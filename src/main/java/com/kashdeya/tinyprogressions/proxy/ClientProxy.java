package com.kashdeya.tinyprogressions.proxy;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.tinyprogressions.handlers.RenderHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
        
        RenderHandler.preInitBlocks();
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
    

}
