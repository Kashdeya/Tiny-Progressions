package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * This class handles the migration to MC 1.11 naming conventions.
 * This ensures worlds from MC 1.10 are still compatible.
 * @author Ellpeck
 */
public class TPMigration {
    private static final Map<String, String> UNDERSCORELESS_TO_UNDERSCORED_NAMES = new HashMap<String, String>();

    public static void addUnderscoreNameToMapUnderscorelessName(String name) {
        String underscoreless = name.replaceAll("_", "");

        UNDERSCORELESS_TO_UNDERSCORED_NAMES.put(Reference.MOD_ID + ":" + underscoreless, Reference.MOD_ID + ":" + name);
    }

    public static boolean remapName(FMLMissingMappingsEvent.MissingMapping mapping) {
        if (mapping != null && mapping.name != null) {
            if (UNDERSCORELESS_TO_UNDERSCORED_NAMES.containsKey(mapping.name)) {
                String newName = UNDERSCORELESS_TO_UNDERSCORED_NAMES.get(mapping.name);
                ResourceLocation newResLoc = new ResourceLocation(newName);

                if (Block.REGISTRY.containsKey(newResLoc) && mapping.type == GameRegistry.Type.BLOCK) {
                    mapping.remap(Block.REGISTRY.getObject(newResLoc));
                    return true;
                } else if (Item.REGISTRY.containsKey(newResLoc) && mapping.type == GameRegistry.Type.ITEM) {
                    mapping.remap(Item.REGISTRY.getObject(newResLoc));
                    return true;
                }
            }
        }

        return false;
    }
}
