package com.kashdeya.tinyprogressions.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kashdeya.tinyprogressions.inits.ModNetwork;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.simple.SimpleChannel;

@Mod(Reference.MOD_ID)

public class TinyProgressions{

    private static final Logger LOGGER = LogManager.getLogger();
    
	public static TinyProgressions INSTANCE;
	
	//Not sure if needed atm.
    public static final SimpleChannel network = ModNetwork.getNetworkChannel();
    
    
	public static final ItemGroup TAB = (new ItemGroup(Reference.MOD_ID) {
	      @OnlyIn(Dist.CLIENT)
	      public ItemStack createIcon() {
	         return new ItemStack(Items.NETHER_STAR);
	      }
	   }).setTabPath("tiny_progression_items");
    
	
    public TinyProgressions() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
        INSTANCE = this;
    }


    private void setup(final FMLCommonSetupEvent event)
    {
    	
//		// Configs
//		TinyConfig.initMain();
//		TinyConfig.initArmor();
//		TinyConfig.initToolsWeapons();
//		TinyConfig.initFood();
//		TinyConfig.initExtra();
//		TinyConfig.initOres();
//		TinyConfig.initSupporters();
//		TinyConfig.initReborn();
//		ModFluids.init();
//		
//		TechBlocks.init();
//		TechItems.init();
//		TechTools.init();
//		TechArmor.init();
//		TechFoods.init();
//		register(TechBlocks.class);
//		register(TechItems.class);
//		register(TechTools.class);
//		register(TechArmor.class);
//		register(TechFoods.class);
//				
//		RemoveItems.initRemove();
//		
//		// Events
//		MinecraftForge.EVENT_BUS.register(instance);
//		MinecraftForge.EVENT_BUS.register(new IReachEvent());
//		MinecraftForge.EVENT_BUS.register(EventDrops.class);
//		MinecraftForge.EVENT_BUS.register(SpongeBlockPlacement.class);
//		MinecraftForge.EVENT_BUS.register(BucketUseEvent.class);
    	
//		proxy.onInitialization(e);
//		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
//		OreDict.init();
    	
    	
//    			proxy.onPostInitialization(e);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {  }

    private void enqueueIMC(final InterModEnqueueEvent event) {  }

    private void processIMC(final InterModProcessEvent event) { }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {  }

    
// was in the orginal file.. but prolly needs to be moved or just changed. 
//	@SubscribeEvent
//	public void itemCrafted(ItemCraftedEvent event)
//	{
//		if (event.crafting.getItem() == TechTools.birthday_pickaxe)
//			event.crafting.addEnchantment(Enchantments.MENDING, 0);
//	}
    
    
    
    
    /// We can move this into another folder.
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
    	
//		BlockRecipes.init();
//		ItemRecipes.init();
//		ToolsRecipes.init();
//		ArmorRecipes.init();
//		FoodRecipes.init();
//		OtherRecipes.init();
//		//OreDictRecipes.init();
//		register(BlockRecipes.class);
//		register(ItemRecipes.class);
//		register(ToolsRecipes.class);
//		register(ArmorRecipes.class);
//		register(FoodRecipes.class);
//		register(OtherRecipes.class);
//		//register(OreDictRecipes.class);
//		
//		IForgeRegistryModifiable<IRecipe> registry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
//
//		RemoveItems.recipes.forEach(rl -> {
//			System.out.println("Removing: " + rl);
//			registry.remove(rl);
//		});
    	
    	
//        @SubscribeEvent
//        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
//        }
    }
    
    
    
}
