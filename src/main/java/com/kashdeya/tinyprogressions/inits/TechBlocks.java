package com.kashdeya.tinyprogressions.inits;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.blocks.bushes.BlockBerryBush;
import com.kashdeya.tinyprogressions.blocks.cobblegen.Cobblegen;
import com.kashdeya.tinyprogressions.blocks.compressed.CharcoalBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.FleshBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.FlintBlock;
import com.kashdeya.tinyprogressions.blocks.compressed.NetherStarBlock;
import com.kashdeya.tinyprogressions.blocks.decorations.AndesiteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.Asphalt;
import com.kashdeya.tinyprogressions.blocks.decorations.DioriteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.DirtyGlass;
// import com.kashdeya.tinyprogressions.blocks.decorations.GlowstoneColored;
// import com.kashdeya.tinyprogressions.blocks.decorations.GlowstoneGlass;
import com.kashdeya.tinyprogressions.blocks.decorations.GraniteBrick;
import com.kashdeya.tinyprogressions.blocks.decorations.HardenedBlocks;
import com.kashdeya.tinyprogressions.blocks.decorations.Lamp;
import com.kashdeya.tinyprogressions.blocks.decorations.OldReed;
import com.kashdeya.tinyprogressions.blocks.decorations.QuickSand;
import com.kashdeya.tinyprogressions.blocks.decorations.UnhardenedBlock;
import com.kashdeya.tinyprogressions.blocks.decorations.WitheredBlock;
import com.kashdeya.tinyprogressions.blocks.growthblock.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.misc.DecoMain;
import com.kashdeya.tinyprogressions.blocks.misc.GhostBlock;
import com.kashdeya.tinyprogressions.blocks.misc.Infused;
import com.kashdeya.tinyprogressions.blocks.ores.EnderOre;
import com.kashdeya.tinyprogressions.blocks.ores.LavaBlock;
import com.kashdeya.tinyprogressions.blocks.ores.WaterBlock;
import com.kashdeya.tinyprogressions.blocks.ores.WubOre;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.reinforced.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechBlocks {

//
//	// Tech Blocks
	public static RegistryObject<Block> growth_block       = register("growth_block",      () -> new BlockGrowth(Properties.of(Material.METAL), 1,  4,  2), TinyProgressions.TAB);
	public static RegistryObject<Block> growth_upgrade     = register("growth_upgrade",    () -> new BlockGrowth(Properties.of(Material.METAL), 2,  6,  5), TinyProgressions.TAB);
	public static RegistryObject<Block> growth_upgrade_two = register("growth_upgrade_two",() -> new BlockGrowth(Properties.of(Material.METAL), 3,  8, 10), TinyProgressions.TAB);

	public static RegistryObject<Block> cobblegen_block         = register("cobblegen_block",        () -> new Cobblegen(30, 32, Properties.of(Material.METAL)), TinyProgressions.TAB);
	public static RegistryObject<Block> iron_cobblegen_block    = register("cobblegen_iron_block",   () -> new Cobblegen(20, 64, Properties.of(Material.METAL)), TinyProgressions.TAB);
	public static RegistryObject<Block> diamond_cobblegen_block = register("cobblegen_diamond_block",() -> new Cobblegen(10, 64, Properties.of(Material.METAL)), TinyProgressions.TAB);
    public static RegistryObject<Block> blaze_cobblegen_block   = register("cobblegen_blaze_block",  () -> new Cobblegen(5, 64,  Properties.of(Material.METAL)), TinyProgressions.TAB);
	public static RegistryObject<Block> emerald_cobblegen_block = register("cobblegen_emerald_block",() -> new Cobblegen(1, 64,  Properties.of(Material.METAL)), TinyProgressions.TAB);
//
//	// Deco Blocks
	public static RegistryObject<Block> charcoal_block  = register("charcoal_block", () -> new CharcoalBlock());
//
	public static RegistryObject<Block> reinforced_glass    = register("reinforced_glass", () -> new ReinforcedGlass(), TinyProgressions.TAB);
	public static RegistryObject<Block> reinforced_obsidian = register("reinforced_obsidian", () -> new ReinforcedObsidian(), TinyProgressions.TAB);
//
	public static RegistryObject<Block> dirty_glass    = register("dirty_glass", () -> new DirtyGlass());
	public static RegistryObject<Block> diorite_brick  = register("diorite_brick", () -> new DioriteBrick());
	public static RegistryObject<Block> granite_brick  = register("granite_brick", () -> new GraniteBrick());
	public static RegistryObject<Block> andesite_brick = register("andesite_brick", () -> new AndesiteBrick());
	public static RegistryObject<Block> old_reed       = register("old_reed", () -> new OldReed());
	// Compressed Blocks
	public static RegistryObject<Block> flesh_block      = register("flesh_block", () -> new FleshBlock());
	public static RegistryObject<Block> bone_block       = register("bone_block", () -> new NetherStarBlock());
	public static RegistryObject<Block> netherstar_block = register("netherstar_block", () -> new NetherStarBlock());
	public static RegistryObject<Block> flint_block      = register("flint_block", () -> new FlintBlock());

	// EnderOre //TODO
	public static RegistryObject<Block> ender_ore = register("ender_ore", () -> new EnderOre());
//	// wub ore
	public static RegistryObject<Block> wub_ore        = register("wub_ore", () -> new WubOre("oreWubOre"));;
	public static RegistryObject<Block> nether_wub_ore = register("nether_wub_ore", () -> new WubOre("oreNetherWubOre"));
//	// Lava Block
	public static RegistryObject<Block> lava_block        = register("lava_block", () -> new LavaBlock("oreLavaBlock"));
	public static RegistryObject<Block> nether_lava_block = register("nether_lava_block", () -> new LavaBlock("oreNetherLavaBlock"));;
//	// Water Block
	public static RegistryObject<Block> water_block = register("water_block", () -> new WaterBlock());
    public static RegistryObject<Block> lava_infused_stone = register("lava_infused_stone", () -> new Infused());

	// Hardened Stone
	public static RegistryObject<Block> unhardened_stone            = register("unhardened_stone", () -> new UnhardenedBlock());
	public static RegistryObject<Block> hardened_stone              = register("hardened_stone", () -> new HardenedBlocks(Properties.of(Material.STONE), 1, 1));;
	public static RegistryObject<Block> hardened_stone_bricks       = register("hardened_stone_bricks", () -> new HardenedBlocks(Properties.of(Material.STONE), 1, 1));;
	public static RegistryObject<Block> hardened_stone_smallbricks  = register("hardened_stone_smallbricks", () -> new HardenedBlocks(Properties.of(Material.STONE), 1, 1));;

	public static RegistryObject<Block> hardened_stone_stairs =             register("hardened_stone_stairs",             ()->new StairsBlock(()-> hardened_stone.get().defaultBlockState(), Block.Properties.of(Material.STONE).strength(50F, 1750F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
	public static RegistryObject<Block> hardened_stone_bricks_stairs =      register("hardened_stone_bricks_stairs",      ()->new StairsBlock(()-> hardened_stone_bricks.get().defaultBlockState(), Block.Properties.of(Material.STONE).strength(50F, 1750F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
	public static RegistryObject<Block> hardened_stone_smallbricks_stairs = register("hardened_stone_smallbricks_stairs", ()->new StairsBlock(()-> hardened_stone_smallbricks.get().defaultBlockState(), Block.Properties.of(Material.STONE).strength(50F, 1750F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));

	public static RegistryObject<Block> hardened_stone_slab =             register("hardened_stone_slab",            ()->new SlabBlock(Block.Properties.of(Material.STONE).strength(50F, 1500F)));
	public static RegistryObject<Block> hardened_stone_bricks_slab  =     register("hardened_stone_bricks_slab",     ()->new SlabBlock(Block.Properties.of(Material.STONE).strength(50F, 1500F)));
	public static RegistryObject<Block> hardened_stone_smallbricks_slab = register("hardened_stone_smallbricks_slab",()->new SlabBlock(Block.Properties.of(Material.STONE).strength(50F, 1500F)));

	// Angel 
	//TODO
    public static RegistryObject<Block> fmf_block    = registerNoItem("fmf_block",	()->new StandardBlock(Block.Properties.of(Material.STONE).strength(1.5F, 1000F).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE).air()));
//    public static RegistryObject<Item> fmf_BlockItem = TinyProgressions.ITEMS.register ("fmf_block",  () -> new AngelItemBlock(fmf_block.get()));

    // Lamp Blocks
    public static RegistryObject<Block> lamp =          register("lamp",          () -> new Lamp(Properties.of(Material.GLASS)));
    public static RegistryObject<Block> yellow_lamp =   register("lamp_yellow",   () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)));
    public static RegistryObject<Block> white_lamp =    register("lamp_white",    () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.TERRACOTTA_WHITE)));
    public static RegistryObject<Block> red_lamp =      register("lamp_red",      () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_RED)));
    public static RegistryObject<Block> purple_lamp =   register("lamp_purple",   () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)));
    public static RegistryObject<Block> pink_lamp =     register("lamp_pink",     () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)));
    public static RegistryObject<Block> orange_lamp =   register("lamp_orange",   () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.TERRACOTTA_ORANGE)));
    public static RegistryObject<Block> magenta_lamp=   register("lamp_magenta",  () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)));
    public static RegistryObject<Block> lime_lamp =     register("lamp_lime",     () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)));
    public static RegistryObject<Block> lightblue_lamp= register("lamp_lightblue",() -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)));
    public static RegistryObject<Block> green_lamp =    register("lamp_green",    () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)));
    public static RegistryObject<Block> gray_lamp =     register("lamp_gray",     () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)));
    public static RegistryObject<Block> cyan_lamp =     register("lamp_cyan",     () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)));
    public static RegistryObject<Block> brown_lamp =    register("lamp_brown",    () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)));
    public static RegistryObject<Block> blue_lamp =     register("lamp_blue",     () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)));
    public static RegistryObject<Block> black_lamp =    register("lamp_black",    () -> new Lamp(Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)));
//	// Glowstone Blocks (Bugged)
//    public static RegistryObject<Block> glowstone_glass = register("glowstone_glass", () -> new GlowstoneGlass());
//    public static RegistryObject<Block> white_glowstone=     register("white_glowstone",    () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.WHITE_TERRACOTTA)));
//    public static RegistryObject<Block> silver_glowstone =   register("silver_glowstone",   () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.GRAY)));
//    public static RegistryObject<Block> red_glowstone=       register("red_glowstone",      () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.RED)));
//    public static RegistryObject<Block> purple_glowstone =   register("purple_glowstone",   () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.PURPLE)));
//    public static RegistryObject<Block> pink_glowstone =     register("pink_glowstone",     () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.PINK)));
//    public static RegistryObject<Block> orange_glowstone =   register("orange_glowstone",   () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.ORANGE_TERRACOTTA)));
//    public static RegistryObject<Block> magenta_glowstone=   register("magenta_glowstone",  () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.MAGENTA)));
//    public static RegistryObject<Block> lime_glowstone =     register("lime_glowstone",     () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.LIME)));
//    public static RegistryObject<Block> lightblue_glowstone= register("lightblue_glowstone",() -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.LIGHT_BLUE)));
//    public static RegistryObject<Block> green_glowstone =    register("green_glowstone",    () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.GREEN)));
//    public static RegistryObject<Block> gray_glowstone =     register("gray_glowstone",     () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.GRAY)));
//    public static RegistryObject<Block> cyan_glowstone =     register("cyan_glowstone",     () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.CYAN)));
//    public static RegistryObject<Block> brown_glowstone =    register("brown_glowstone",    () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.BROWN)));
//    public static RegistryObject<Block> blue_glowstone =     register("blue_glowstone",     () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.BLUE)));
//    public static RegistryObject<Block> black_glowstone =    register("black_glowstone",    () -> new GlowstoneColored(Properties.of(Material.GLASS, MaterialColor.BLACK)));
//    // Withered Block
    public static RegistryObject<Block> withered_block = register("withered_block",    () -> new WitheredBlock(Properties.of(Material.STONE)));;
//    // berries
    public static RegistryObject<Block> blueberry_bush =  register("blueberry_bush",  () -> new BlockBerryBush(Properties.of(Material.PLANT, MaterialColor.COLOR_BLACK).sound(SoundType.SWEET_BERRY_BUSH).strength(0)), TinyProgressions.FoodGroup);
    public static RegistryObject<Block> blackberry_bush = register("blackberry_bush", () -> new BlockBerryBush(Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE).sound(SoundType.SWEET_BERRY_BUSH).strength(0)), TinyProgressions.FoodGroup);
    public static RegistryObject<Block> maloberry_bush =  register("maloberry_bush",  () -> new BlockBerryBush(Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.SWEET_BERRY_BUSH).strength(0)), TinyProgressions.FoodGroup);
    public static RegistryObject<Block> raspberry_bush =  register("raspberry_bush",  () -> new BlockBerryBush(Properties.of(Material.PLANT, MaterialColor.COLOR_RED).sound(SoundType.SWEET_BERRY_BUSH).strength(0)), TinyProgressions.FoodGroup);
    // bsc sugar blocks
    public static RegistryObject<Block> compressed_sugar         = register("compressed_sugar", ()-> new StandardBlock(Block.Properties.of(Material.CLAY).strength(0.6F, 0.6F).sound(SoundType.SNOW).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> double_compressed_sugar  = register("double_compressed_sugar", ()-> new StandardBlock(Block.Properties.of(Material.CLAY).strength(0.6F, 0.6F).sound(SoundType.SNOW).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    // bsc sugar cane blocks
    public static RegistryObject<Block> compressed_sugar_cane           = register("compressed_sugar_cane",          ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(1.0F, 1.0F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> double_compressed_sugar_cane    = register("double_compressed_sugar_cane",   ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(1.2F, 1.2F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> triple_compressed_sugar_cane    = register("triple_compressed_sugar_cane",   ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(1.4F, 1.4F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> quadruple_compressed_sugar_cane = register("quadruple_compressed_sugar_cane",()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(1.6F, 1.6F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> quintuple_compressed_sugar_cane = register("quintuple_compressed_sugar_cane",()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(1.8F, 1.8F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> sextuple_compressed_sugar_cane  = register("sextuple_compressed_sugar_cane", ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(2.0F, 2.0F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> septuple_compressed_sugar_cane  = register("septuple_compressed_sugar_cane", ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(2.2F, 2.2F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> octuple_compressed_sugar_cane   = register("octuple_compressed_sugar_cane",  ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(2.4F, 2.4F).sound(SoundType.BAMBOO).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    // nether blocks
    public static RegistryObject<Block> compressed_nether_block           = register("compressed_nether_block",          ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(0.4F, 10F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> double_compressed_nether_block    = register("double_compressed_nether_block",   ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(0.8F, 20F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> triple_compressed_nether_block    = register("triple_compressed_nether_block",   ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(1.2F, 30F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> quadruple_compressed_nether_block = register("quadruple_compressed_nether_block",()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(1.6F, 40F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> quintuple_compressed_nether_block = register("quintuple_compressed_nether_block",()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(2.0F, 50F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> sextuple_compressed_nether_block  = register("sextuple_compressed_nether_block", ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(2.4F, 60F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> septuple_compressed_nether_block  = register("septuple_compressed_nether_block", ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(2.8F, 70F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> octuple_compressed_nether_block   = register("octuple_compressed_nether_block",  ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(3.2F, 80F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static RegistryObject<Block> soul_sandstone  = register("soul_sandstone", ()-> new StandardBlock(Block.Properties.of(Material.STONE).strength(0.4F, 10F).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    // water harvester
    public static Block water_harvester;
    // bridge
    public static Block bridge_builder;
    public static Block tower_builder;
    // vasholine
//    public static Block VASHOLINE;

//    // asphalt
    public static RegistryObject<Block> asphalt_block = register("asphalt_block", () -> new Asphalt());
    // Steel Block
    public static RegistryObject<Block> steel_block = register("steel_block", () -> new DecoMain());
    // Ghost Block
    public static RegistryObject<Block> ghost_block = register("ghost_block", () -> new GhostBlock());
    // quicksand
    public static RegistryObject<Block> quick_sand = register("quick_sand",   () -> new QuickSand());
    // Glowstone Glass

//    


    // Registers a block and blockItem if needed.
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup)
    {
        return register(name, sup, TechBlocks::itemDefault);
    }

//    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
//        return register(name, sup, block -> item(block, renderMethod));
//    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, ItemGroup tab) {
        return register(name, sup, block -> item(block, tab));
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        TinyProgressions.ITEMS.register(name, itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {

        return TinyProgressions.BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(final RegistryObject<? extends Block> block) {
        return item(block, TinyProgressions.BlocksGroup);
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final Supplier<Callable<ItemStackTileEntityRenderer>> renderMethod) {
        return () -> new BlockItem(block.get(), new Item.Properties().tab(TinyProgressions.BlocksGroup).setISTER(renderMethod));
    }

    private static Supplier<BlockItem> item(final RegistryObject<? extends Block> block, final ItemGroup itemGroup) {
        return () -> new BlockItem(block.get(), new Item.Properties().tab(itemGroup));
    }



}
