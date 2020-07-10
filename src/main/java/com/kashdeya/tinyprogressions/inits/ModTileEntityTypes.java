package com.kashdeya.tinyprogressions.inits;

import java.util.function.Supplier;

import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;
import com.kashdeya.tinyprogressions.tiles.TileEntityOreDoubler;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTileEntityTypes {

	// We don't have a datafixer for our TileEntities, so we pass null into build.
	public static final RegistryObject<TileEntityType<TileEntityCobblegen>> CobbleGen = TinyProgressions.TILE_ENTITY_TYPES.register("cobblegen", () -> TileEntityType.Builder.create(TileEntityCobblegen::new, 
			TechBlocks.cobblegen_block.get(),
			TechBlocks.iron_cobblegen_block.get(),
			TechBlocks.emerald_cobblegen_block.get(),
			TechBlocks.diamond_cobblegen_block.get(),
			TechBlocks.blaze_cobblegen_block.get()
			).build(null));

	
	public static final RegistryObject<TileEntityType<TileEntityCobblegen>> GrowthCrystals = TinyProgressions.TILE_ENTITY_TYPES.register("growthcrystal", () -> TileEntityType.Builder.create(TileEntityCobblegen::new, 
			TechBlocks.growth_block.get(),
			TechBlocks.growth_upgrade.get(),
			TechBlocks.growth_upgrade_two.get()
			).build(null));
	
	
	public static final RegistryObject<TileEntityType<TileEntityOreDoubler>> DoubleFurnace = TinyProgressions.TILE_ENTITY_TYPES.register("doublefurnace", () -> TileEntityType.Builder.create(TileEntityOreDoubler::new, 
			TechBlocks.iron_furnace_block.get()
			).build(null));
	
}
