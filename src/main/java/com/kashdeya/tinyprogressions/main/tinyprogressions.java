package com.kashdeya.tinyprogressions.main;

import com.kashdeya.tinyprogressions.configs.TinyConfig;
import com.kashdeya.tinyprogressions.events.BucketUseEvent;
import com.kashdeya.tinyprogressions.events.EventDrops;
import com.kashdeya.tinyprogressions.events.SpongeBlockPlacement;
import com.kashdeya.tinyprogressions.handlers.OreDictHandler;
import com.kashdeya.tinyprogressions.inits.*;
import com.kashdeya.tinyprogressions.proxy.CommonProxy;
import com.kashdeya.tinyprogressions.tabs.TabTP;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class tinyprogressions {

	@Instance(Reference.MOD_ID)
    public static tinyprogressions instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
	public static final CreativeTabs tabTP = new TabTP("tiny_progressions");
	
    public static org.apache.logging.log4j.Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	logger = e.getModLog();
    	
		// Configs
		TinyConfig.initMainConfigs();
		
    	// Load everything else
		TechItems.init();
		TechBlocks.init();
		TechArmor.init();
		TechTools.init();
		OreDictHandler.init();
		
		// Renders
		PROXY.registerTileEntities();
    	PROXY.registerRenderers();
    	
    	// Events
    	MinecraftForge.EVENT_BUS.register(instance);
    	MinecraftForge.EVENT_BUS.register(EventDrops.class);
    	MinecraftForge.EVENT_BUS.register(SpongeBlockPlacement.class);
    	MinecraftForge.EVENT_BUS.register(BucketUseEvent.class);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {}

	/**
	 * @author Ellpeck
	 */
	@EventHandler
	public void missingMapping(FMLMissingMappingsEvent event){
		int totalRemaps = 0;
		int workedRemaps = 0;

		for(FMLMissingMappingsEvent.MissingMapping mapping : event.getAll()) {
			totalRemaps++;

			if(TPMigration.remapName(mapping)) {
				workedRemaps++;
			}
		}

		if(totalRemaps > 0) {
			logger.info("Successfully remapped " + workedRemaps + " out of " + totalRemaps + " blocks and items to match the 1.11 naming conventions.");
		}
	}
}
