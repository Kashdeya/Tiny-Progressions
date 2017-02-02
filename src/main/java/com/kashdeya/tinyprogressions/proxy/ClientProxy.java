package com.kashdeya.tinyprogressions.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.tinyprogressions.handlers.RenderHandler;

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
        RenderHandler.initTools();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }   
    

}
