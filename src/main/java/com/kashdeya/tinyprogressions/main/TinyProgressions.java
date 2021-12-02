package com.kashdeya.tinyprogressions.main;

import java.io.File;

import com.kashdeya.tinyprogressions.world.WorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kashdeya.tinyprogressions.blocks.decorations.QuickSand;
import com.kashdeya.tinyprogressions.config.TinyConfig;
import com.kashdeya.tinyprogressions.inits.ModNetwork;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
// import com.kashdeya.tinyprogressions.inits.TechFeatures;
import com.kashdeya.tinyprogressions.inits.TechFoods;
import com.kashdeya.tinyprogressions.inits.TechTools;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
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
    
//	public static TinyProgressions INSTANCE;
	
	//Not sure if needed atm.
    public static final SimpleChannel network = ModNetwork.getNetworkChannel();
    
    
	public static final ItemGroup TAB = (new ItemGroup(Reference.MOD_ID +".general") {
	      @OnlyIn(Dist.CLIENT)
	      public ItemStack makeIcon() {
	         return new ItemStack(Items.NETHER_STAR);
	      }
	   }).setRecipeFolderName("tiny_progression_items");
    
	
	
	public static final ItemGroup FoodGroup = (new ItemGroup(Reference.MOD_ID+".food") {
	      @OnlyIn(Dist.CLIENT)
	      public ItemStack makeIcon() {
	    	  return new ItemStack(Items.APPLE);
//TODO
//	         return new ItemStack(TechFoods.diamond_apple.get());
	      }
	   }).setRecipeFolderName("tiny_progression_foods");
//	
//	public static final ItemGroup combatGroup = (new ItemGroup(Reference.MOD_ID+".combat") {
//	      @OnlyIn(Dist.CLIENT)
//	      public ItemStack makeIcon() {
//	         return new ItemStack(TechTools.obsidian_sword.get());
//	      }
//	   }).setRecipeFolderName("tiny_progression_combat");
//	
	   public static final ItemGroup ToolsGroup = (new ItemGroup(Reference.MOD_ID+".tools") {
	      @OnlyIn(Dist.CLIENT)
	      public ItemStack makeIcon() {
	    	  return new ItemStack(Items.DIAMOND_PICKAXE);
//	         return new ItemStack(TechTools.wub_pickaxe.get());
	      }
	   }).setRecipeFolderName("tiny_progression_tools");
//	   
	   
	   public static final ItemGroup BlocksGroup = (new ItemGroup(Reference.MOD_ID+".blocks") {
		      @OnlyIn(Dist.CLIENT)
		      public ItemStack makeIcon() {
//		         return new ItemStack(TechBlocks.hardened_stone_bricks.get());
		         return new ItemStack(TechBlocks.cobblegen_block.get());
		      }
		   }).setRecipeFolderName("tiny_progression_blocks");

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,	Reference.MOD_ID);
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,	Reference.MOD_ID);
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);
	public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Reference.MOD_ID);
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Reference.MOD_ID);
	public static final DeferredRegister<IRecipeSerializer<?>> RECIPEHANDLER = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Reference.MOD_ID);

	
    public TinyProgressions() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	bus.addListener(this::setup);
    	bus.addListener(this::enqueueIMC);
    	bus.addListener(this::processIMC);
    	bus.addListener(this::doClientStuff);
		
//    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, WorldGen::generateOres);

        ModLoadingContext.get().registerConfig(Type.COMMON, TinyConfig.commonSpec);
//        ModLoadingContext.get().registerConfig(Type.CLIENT, TinyConfig.clientSpec);
        bus.register(TinyConfig.class);
        
		ITEMS.register(bus);
		BLOCKS.register(bus);
		FLUIDS.register(bus);
		TILE_ENTITY_TYPES.register(bus);
//		CONTAINERS.register(bus);
//		FEATURES.register(bus);
//		SOUNDS.register(bus);
//		RECIPEHANDLER.register(bus);
    }


    private void setup(final FMLCommonSetupEvent event)
    {
//    	TechFeatures.registerAllFeatures();
//    	exportJson.init();
//    	exportDrops.init();
    }

    
    @SuppressWarnings("deprecation")
	private void doClientStuff(final FMLClientSetupEvent event) {
    	
    	RenderType solid = RenderType.solid();
    	RenderType cutout_mipped = RenderType.cutoutMipped();
    	RenderType cutout = RenderType.cutout();
    	RenderType translucent = RenderType.translucent();
    	RenderType translucent_no_crumbling = RenderType.translucentNoCrumbling();

    	RenderTypeLookup.setRenderLayer(TechBlocks.cobblegen_block.get(),        cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.iron_cobblegen_block.get(),   cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.emerald_cobblegen_block.get(),cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.diamond_cobblegen_block.get(),cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.blaze_cobblegen_block.get(),  cutout_mipped);
//    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.blackberry_bush.get(),cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.blueberry_bush.get(), cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.maloberry_bush.get(), cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.raspberry_bush.get(), cutout);
//    	    	
//    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.reinforced_glass.get(), cutout_mipped);
//    	
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
    	RenderTypeLookup.setRenderLayer(TechBlocks.red_lamp.get(),      translucent);
    	RenderTypeLookup.setRenderLayer(TechBlocks.white_lamp.get(),    cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.yellow_lamp.get(),   cutout_mipped);
//    	
//    	RenderTypeLookup.setRenderLayer(TechBlocks.fmf_block.get(), cutout);
//    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.growth_block.get(),      cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.growth_upgrade.get(),    cutout_mipped);
    	RenderTypeLookup.setRenderLayer(TechBlocks.growth_upgrade_two.get(),cutout_mipped);
//
    	RenderTypeLookup.setRenderLayer(TechBlocks.lava_infused_stone.get(), cutout);
//    	
    	RenderTypeLookup.setRenderLayer(TechBlocks.ender_ore.get(), cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.water_block.get(), cutout);	
    	RenderTypeLookup.setRenderLayer(TechBlocks.lava_block.get(), cutout);	
    	RenderTypeLookup.setRenderLayer(TechBlocks.wub_ore.get(), cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.nether_lava_block.get(), cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.nether_wub_ore.get(), cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.netherstar_block.get(), cutout);
    	RenderTypeLookup.setRenderLayer(TechBlocks.old_reed.get(), cutout);
		
//		FMLJavaModLoadingContext.get().getModEventBus().addListener(QuickSand::onHeadSubmerged);
		
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {  }

    private void processIMC(final InterModProcessEvent event) { }
    
    private File drops_DIR;

    
// was in the orginal file.. but prolly needs to be moved or just changed. 
//	@SubscribeEvent
//	public void itemCrafted(ItemCraftedEvent event)
//	{
//		if (event.crafting.getItem() == TechTools.birthday_pickaxe)
//			event.crafting.addEnchantment(Enchantments.MENDING, 0);
//	}
    
    /// We can move this into another folder.
//    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
//		IForgeRegistryModifiable<IRecipe> registry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
//
//		RemoveItems.recipes.forEach(rl -> {
//			System.out.println("Removing: " + rl);
//			registry.remove(rl);
//		});
    }
    
    
    
}
