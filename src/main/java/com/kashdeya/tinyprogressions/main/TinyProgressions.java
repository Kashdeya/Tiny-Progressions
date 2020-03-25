package com.kashdeya.tinyprogressions.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kashdeya.tinyprogressions.inits.ModNetwork;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
    
	
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS,	Reference.MOD_ID);
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);
	
    public TinyProgressions() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	bus.addListener(this::setup);
    	bus.addListener(this::enqueueIMC);
    	bus.addListener(this::processIMC);
    	bus.addListener(this::doClientStuff);
		bus.addListener(this::onServerStarting);
        MinecraftForge.EVENT_BUS.register(this);
		ITEMS.register(bus);
		BLOCKS.register(bus);
		FLUIDS.register(bus);
		TILE_ENTITY_TYPES.register(bus);
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

    private void doClientStuff(final FMLClientSetupEvent event) {
    	
    	RenderType solid = RenderType.func_228639_c_();
    	RenderType cutout_mipped = RenderType.func_228641_d_();
    	RenderType cutout = RenderType.func_228643_e_();
    	RenderType translucent = RenderType.func_228645_f_();
    	RenderType translucent_no_crumbling = RenderType.func_228647_g_();

    	RenderTypeLookup.setRenderLayer(TechBlocks.cobblegen_block.get(),        cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.iron_cobblegen_block.get(),   cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.emerald_cobblegen_block.get(),cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.diamond_cobblegen_block.get(),cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.blaze_cobblegen_block.get(),  cutout_mipped);
    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.reinforced_glass.get(), cutout_mipped);
    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.lamp.get(),          cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.black_lamp.get(),    cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.blue_lamp.get(),     cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.brown_lamp.get(),    cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.cyan_lamp.get(),     cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.gray_lamp.get(),     cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.green_lamp.get(),    cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.lightblue_lamp.get(),cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.lime_lamp.get(),     cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.magenta_lamp.get(),  cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.orange_lamp.get(),   cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.pink_lamp.get(),     cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.purple_lamp.get(),   cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.red_lamp.get(),      cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.white_lamp.get(),    cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.yellow_lamp.get(),   cutout_mipped);
    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.growth_block.get(),      cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.growth_upgrade.get(),    cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.growth_upgrade_two.get(),cutout_mipped);
    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.stone_torch.get(), cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.stone_torch_wall.get(), cutout_mipped);
    	
    }

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
