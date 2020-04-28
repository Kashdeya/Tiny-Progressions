package com.kashdeya.tinyprogressions.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.kashdeya.tinyprogressions.blocks.StandardBlock;

import net.minecraftforge.registries.ForgeRegistries;

public class exportDrops {

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private static File drops_DIR = null;
	private static final Set<String> USED_OD_NAMES = new TreeSet<>();
	
	public static void init() {
    	
		if (drops_DIR == null) {
			drops_DIR = new File("E:/Minecraft Modding/1.14.x Workspace All Mods/TinyProgressions/Tiny-Progressions/run/config/tp/drops/");
			System.out.println(drops_DIR.toPath().toString());
		}

		if (!drops_DIR.exists()) {
			drops_DIR.mkdir();
		}
    	
	    ForgeRegistries.BLOCKS.forEach((block) -> {
	    	System.out.println(block.getRegistryName().toString());
	    	if(block.getRegistryName().toString().startsWith("tp")) {
		    	JsonObject json = new JsonObject();
		    	
		    	json.addProperty("type", "minecraft:block");
		    	JsonArray pools = new JsonArray();
		    		JsonObject pool = new JsonObject();
		    			pool.addProperty("rolls", 1);
		    				JsonArray entires = new JsonArray();
		    					JsonObject entire = new JsonObject();
		    					entire.addProperty("type", "minecraft:block");
		    					entire.addProperty("name", block.getRegistryName().toString());
		    				entires.add(entire);
		    				pool.add("entries", entire);
		    			pools.add(pool);
		    	
		    	json.add("pools", pools);
		    	
				File f = new File(drops_DIR, block.getRegistryName().getPath() + ".json");
	
				try (FileWriter w = new FileWriter(f)) {
					GSON.toJson(json, w);
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	}
	    });
	}
	
}
