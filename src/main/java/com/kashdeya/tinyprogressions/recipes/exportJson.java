package com.kashdeya.tinyprogressions.recipes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class exportJson {

	
	// Replace calls to GameRegistry.addShapeless/ShapedRecipe with these methods, which will dump it to a json in your dir of choice
	// Also works with OD, replace GameRegistry.addRecipe(new ShapedOreRecipe/ShapelessOreRecipe with the same calls

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	private static File RECIPE_DIR = null;
	private static final Set<String> USED_OD_NAMES = new TreeSet<>();

	
	public static void init() {
		ArmorRecipes.init();
		BlockRecipes.init();
		FoodRecipes.init();
		ItemRecipes.init();
		OtherRecipes.init();
		ToolsRecipes.init();
		
		
//		ArrayList<String> allOreDicts = new ArrayList<String>();
//		ForgeRegistries.ITEMS.forEach((item) -> {
//			if(item instanceof IOreDictEntry)
//				allOreDicts.add(item.getRegistryName() +" -> "+ ((IOreDictEntry)item).getOreDictName());
//		});
//		
//		File f = new File(RECIPE_DIR,"old_ore_dict.json");
//
//		try (FileWriter w = new FileWriter(f)) {
//			allOreDicts.forEach((line) -> {
//				line.toString();
//			});
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	
	private static void setupDir() {
		if (RECIPE_DIR == null) {
			RECIPE_DIR = new File("E:/Minecraft Modding/1.14.x Workspace All Mods/TinyProgressions/Tiny-Progressions/run/config/tp/recipes/");
		}

		if (!RECIPE_DIR.exists()) {
			RECIPE_DIR.mkdir();
		}
	}

	public static void addShapedRecipe(ItemStack result, Object... components) {
		setupDir();

		// GameRegistry.addShapedRecipe(result, components);

		Map<String, Object> json = new LinkedHashMap<>();

		List<String> pattern = new ArrayList<>();
		int i = 0;
		while (i < components.length && components[i] instanceof String) {
			pattern.add(((String) components[i]).toUpperCase());
			i++;
		}
		boolean isOreDict = false;
		Map<String, Map<String, Object>> key = new HashMap<>();
		Character curKey = null;
		for (; i < components.length; i++) {
			Object o = components[i];
			if (o instanceof Character) {
				if (curKey != null)
					throw new IllegalArgumentException("Provided two char keys in a row");
				curKey = (Character) o;
			} else {
				if (curKey == null)
					throw new IllegalArgumentException("Providing object without a char key");
				if (o instanceof String)
					isOreDict = true;
				key.put(Character.toString(Character.toUpperCase(curKey)), serializeItem(o));
				curKey = null;
			}
		}
		json.put("type", "minecraft:crafting_shaped");
		json.put("pattern", pattern);
		json.put("key", key);
		json.put("result", serializeItem(result));

		// names the json the same name as the output's registry name
		// repeatedly adds _alt if a file already exists
		// janky I know but it works
		String suffix = "";
		File f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath() + suffix + ".json");

		while (f.exists()) {
			suffix += "_alt";
			f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath() + suffix + ".json");
		}

		try (FileWriter w = new FileWriter(f)) {
			GSON.toJson(json, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void addShapedNBTRecipe(ItemStack result, Object... components) {
		setupDir();

		// GameRegistry.addShapedRecipe(result, components);

		Map<String, Object> json = new LinkedHashMap<>();

		List<String> pattern = new ArrayList<>();
		int i = 0;
		while (i < components.length && components[i] instanceof String) {
			pattern.add(((String) components[i]).toUpperCase());
			i++;
		}
		boolean isOreDict = false;
		Map<String, Map<String, Object>> key = new HashMap<>();
		Character curKey = null;
		for (; i < components.length; i++) {
			Object o = components[i];
			if (o instanceof Character) {
				if (curKey != null)
					throw new IllegalArgumentException("Provided two char keys in a row");
				curKey = (Character) o;
			} else {
				if (curKey == null)
					throw new IllegalArgumentException("Providing object without a char key");
				if (o instanceof String)
					isOreDict = true;
				key.put(Character.toString(Character.toUpperCase(curKey)), serializeItem(o, true));
				curKey = null;
			}
		}
		json.put("type", "tp:crafting_shaped_nbt");
		json.put("pattern", pattern);
		json.put("key", key);
		json.put("result", serializeItem(result, true));

		// names the json the same name as the output's registry name
		// repeatedly adds _alt if a file already exists
		// janky I know but it works
		String suffix = "";
		File f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath() + suffix + ".json");

		while (f.exists()) {
			suffix += "_alt";
			f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath() + suffix + ".json");
		}

		try (FileWriter w = new FileWriter(f)) {
			GSON.toJson(json, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
//	public static void addSmeltingRecipe(ItemStack result, Object... components) {
//		addSmeltingRecipe(result, 0, components);
//	}
//	
//	public static void addSmeltingRecipe(ItemStack result, int experience, Object... components) {
//		addSmeltingRecipe(result, experience, 200, components);
//	}
	
	public static void addSmeltingRecipe(ItemStack result, int experience, int cookingtime ,Object... components) {
		setupDir();

		// addShapelessRecipe(result, components);

		Map<String, Object> json = new LinkedHashMap<>();

		boolean isOreDict = false;
		List<Map<String, Object>> ingredients = new ArrayList<>();
		for (Object o : components) {
			if (o instanceof String)
				isOreDict = true;
			ingredients.add(serializeItem(o));
		}
		json.put("type", "minecraft:smelting");
		json.put("ingredient", ingredients);
		json.put("result", serializeItem(result));
		json.put("experience", experience);
		
		if(cookingtime != 200)
			json.put("cookingtime", "minecraft:smelting");
		
		
		

		// names the json the same name as the output's registry name
		// repeatedly adds _alt if a file already exists
		// janky I know but it works
		String suffix = "";
		File f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath()+"_smelting.json");

		while (f.exists()) {
			suffix += "_alt";
			f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath() +"_smelting" + suffix + ".json");
		}


		try (FileWriter w = new FileWriter(f)) {
			GSON.toJson(json, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void addShapelessRecipe(ItemStack result, Object... components)
	{
		setupDir();

		// addShapelessRecipe(result, components);

		Map<String, Object> json = new LinkedHashMap<>();

		boolean isOreDict = false;
		List<Map<String, Object>> ingredients = new ArrayList<>();
		for (Object o : components) {
			if (o instanceof String)
				isOreDict = true;
			ingredients.add(serializeItem(o));
		}
		json.put("type", "minecraft:crafting_shapeless");
		json.put("ingredients", ingredients);
		json.put("result", serializeItem(result));

		// names the json the same name as the output's registry name
		// repeatedly adds _alt if a file already exists
		// janky I know but it works
		String suffix = "";
		File f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath()+".json");

		while (f.exists()) {
			suffix += "_alt";
			f = new File(RECIPE_DIR, result.getItem().getRegistryName().getPath() + suffix + ".json");
		}


		try (FileWriter w = new FileWriter(f)) {
			GSON.toJson(json, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Map<String, Object> serializeItem(Object thing) {
		return serializeItem(thing, false);
	}
	
	
	private static Map<String, Object> serializeItem(Object thing, boolean isNBT) {
		if (thing instanceof Item) {
			return serializeItem(new ItemStack((Item) thing));
		}
		if (thing instanceof Block) {
			return serializeItem(new ItemStack((Block) thing));
		}
		if (thing instanceof ItemStack) {
			ItemStack stack = (ItemStack) thing;
			Map<String, Object> ret = new LinkedHashMap<>();

			ret.put("item", stack.getItem().getRegistryName().toString());
			
			if(isNBT)
			{
		        if (stack.hasTag() && !stack.getTag().isEmpty()) {
					ret.put("nbt", stack.getTag().toString());
				}
			}
			

			if (stack.getCount() > 1) {
				ret.put("count", stack.getCount());
			}

			return ret;
		}
		if (thing instanceof String) {
			Map<String, Object> ret = new HashMap<>();
			USED_OD_NAMES.add((String) thing);
			ret.put("tag", ((String) thing));
			return ret;
		}

		throw new IllegalArgumentException("Not a block, item, stack, or od name");
	}

	private static void generateConstants() {
		List<Map<String, Object>> json = new ArrayList<>();
		for (String s : USED_OD_NAMES) {
			Map<String, Object> entry = new HashMap<>();
			entry.put("name", s.toUpperCase(Locale.ROOT));
			entry.put("ingredient", ImmutableMap.of("type", "forge:ore_dict", "ore", s));
			json.add(entry);
		}

		try (FileWriter w = new FileWriter(new File(RECIPE_DIR, "_constants.json"))) {
			GSON.toJson(json, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
