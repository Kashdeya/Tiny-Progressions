package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.items.*;
import com.kashdeya.tinyprogressions.main.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TechItems {

    // Tech Items
    public static Item WateringCan;
    public static Item WateringCanUpgrade;
    public static Item QuartzKnife;
    public static Item QuartzDust;
    public static Item BirthdayPickaxe;

    public static final Item.ToolMaterial BIRTHDAY = EnumHelper.addToolMaterial("birthdayToolMaterial", 3, 3061, 45.0F, 12.0F, 25);

    public static void init() {

        // Tech Items
        if (ConfigHandler.WateringCan) {
            WateringCan = new WateringCan();
            registerItem(WateringCan, "WateringCan");

            // Increase the performance on the loading
            if (ConfigHandler.WateringCanUpgrade) {
                WateringCanUpgrade = new WateringCanUpgrade();
                registerItem(WateringCanUpgrade, "WateringCanUpgrade");
            }
        }

        if (ConfigHandler.QuartzKnife) {
            QuartzKnife = new QuartzKnife();
            registerItem(QuartzKnife, "QuartzKnife");
        }
        if (ConfigHandler.QuartzDust) {
            QuartzDust = new QuartzDust();
            registerItem(QuartzDust, "QuartzDust");
        }
        if (ConfigHandler.BirthdayPickaxe) {
            BirthdayPickaxe = new BirthdayPickaxe(BIRTHDAY);
            registerItem(BirthdayPickaxe, "BirthdayPickaxe");
        }
    }

    static void registerItem(Item item, String name) {
        GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
    }

}
