package com.kashdeya.tinyprogressions.proxy;

import com.kashdeya.tinyprogressions.handlers.RenderHandler;

public class ClientProxy extends CommonProxy {

    @Override
	public void registerRenderers() {
        RenderHandler.preInitBlocks();
        RenderHandler.initBlocks();
        RenderHandler.initItems();
        RenderHandler.initArmor();
        RenderHandler.initTools();
	}
}
