package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Reference.MOD_ID);

	// We don't have a datafixer for our TileEntities, so we pass null into build.
	public static final RegistryObject<TileEntityType<TileEntityCobblegen>> CobbleGen = TILE_ENTITY_TYPES.register("cobblegen", () ->
			TileEntityType.Builder.create(TileEntityCobblegen::new, TechBlocks.cobblegen_block)
					.build(null)
	);

}
