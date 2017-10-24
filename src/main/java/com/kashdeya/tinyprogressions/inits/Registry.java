package com.kashdeya.tinyprogressions.inits;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.kashdeya.tinyprogressions.crafting.ArmorRecipes;
import com.kashdeya.tinyprogressions.crafting.BlockRecipes;
import com.kashdeya.tinyprogressions.crafting.FoodRecipes;
import com.kashdeya.tinyprogressions.crafting.ItemRecipes;
import com.kashdeya.tinyprogressions.crafting.OtherRecipes;
import com.kashdeya.tinyprogressions.crafting.ToolsRecipes;
import com.kashdeya.tinyprogressions.handlers.OreDictHandler;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.util.IMetadata;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class Registry
{
	static Map<ResourceLocation, Block> BLOCKS = Maps.newHashMap();
	static Map<ResourceLocation, Item> ITEMS = Maps.newHashMap();
	static Map<ResourceLocation, Class<? extends TileEntity>> TILES = Maps.newHashMap();
	
	public static Map<ResourceLocation, IRecipe> RECIPES = Maps.newHashMap();
	static Map<String, List<ItemStack>> OREDICT = Maps.newHashMap();
	
	public static void registerBlock(Block block, String name)
	{
		block.setRegistryName(Reference.MOD_ID, name);
		
		if(block.getUnlocalizedName() == null || block.getUnlocalizedName().isEmpty())
			block.setUnlocalizedName(Reference.MOD_ID + ":" + name);
		
		BLOCKS.put(block.getRegistryName(), block);
		
		if(block instanceof IOreDictEntry)
		{
			String entry = ((IOreDictEntry)block).getOreDictName();
			
			if(entry != null)
			{
				List<ItemStack> entryList;
				
				if(OREDICT.containsKey(entry))
					entryList = OREDICT.get(entry);
				else
					entryList = Lists.newArrayList();
				
				entryList.add(new ItemStack(block));
				OREDICT.put(entry, entryList);
			}
		}
		
		Item item = null;
		
		if(block instanceof IItemProvider)
			item = ((IItemProvider)block).getItemBlock();
		
		if(item == null)
			item = new ItemBlock(block);
		
		registerItem(item, name);
		
		if(block instanceof ITileEntityProvider)
		{
			TileEntity tile = ((ITileEntityProvider)block).createNewTileEntity(null, -1);
		
			if(tile != null && !TILES.containsValue(tile.getClass()))
				TILES.put(block.getRegistryName(), tile.getClass());
		}
	}
	
	public static void registerItem(Item item, String name)
	{
		item.setRegistryName(Reference.MOD_ID, name);
		
		if(item.getUnlocalizedName() == null || item.getUnlocalizedName().isEmpty())
			item.setUnlocalizedName(Reference.MOD_ID + ":" + name);
		
		ITEMS.put(item.getRegistryName(), item);
		
		if(item instanceof IOreDictEntry)
		{
			String entry = ((IOreDictEntry)item).getOreDictName();
			
			if(entry != null)
			{
				List<ItemStack> entryList;
				
				if(OREDICT.containsKey(entry))
					entryList = OREDICT.get(entry);
				else
					entryList = Lists.newArrayList();
				
				entryList.add(new ItemStack(item));
				OREDICT.put(entry, entryList);
			}
		}
	}
	
	public static void registerRecipe(IRecipe recipe, String name)
	{
		int recipeIndex = 0;
		ResourceLocation resName = new ResourceLocation(name);
		ResourceLocation tmpName = resName;
		
		while(RECIPES.containsKey(resName))
			resName = new ResourceLocation(tmpName.getResourceDomain(), String.format("%s.%d", tmpName.getResourcePath(), recipeIndex++));
		
		recipe.setRegistryName(resName);
		RECIPES.put(recipe.getRegistryName(), recipe);
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		TechBlocks.onRegister();
		
		for(Map.Entry<ResourceLocation, Block> block : BLOCKS.entrySet())
			event.getRegistry().register(block.getValue());
		
		for(Map.Entry<ResourceLocation, Class<? extends TileEntity>> tile : TILES.entrySet())
			GameRegistry.registerTileEntity(tile.getValue(), tile.getKey().toString());
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		TechItems.onRegister();
		TechArmor.onRegister();
		TechTools.onRegister();
		TechFoods.onRegister();
		
		for(Map.Entry<ResourceLocation, Item> item : ITEMS.entrySet())
			event.getRegistry().register(item.getValue());
		
		for(Map.Entry<String, List<ItemStack>> oredict : OREDICT.entrySet())
		{
			for(ItemStack entry : oredict.getValue())
				OreDictionary.registerOre(oredict.getKey(), entry);
		}
	}
	
	@SubscribeEvent
	public static void onRecipeRegister(RegistryEvent.Register<IRecipe> event)
	{
		OtherRecipes.init();
		ArmorRecipes.init();
		BlockRecipes.init();
		ItemRecipes.init();
		ToolsRecipes.init();
		FoodRecipes.init();

		// TODO: The plan is to remove this entirely.
		OreDictHandler.init();
		
		for(Map.Entry<ResourceLocation, IRecipe> recipe : RECIPES.entrySet())
			event.getRegistry().register(recipe.getValue());
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Map.Entry<ResourceLocation, Block> block : BLOCKS.entrySet())
		{
			if(block.getValue() instanceof IMetadata)
			{
				IMetadata meta = (IMetadata)block.getValue();
				
				for(int i = 0; i < meta.getCount(); i++)
					ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block.getValue()), i, new ModelResourceLocation(Reference.MOD_ID + ":" + meta.getTexture(i), "inventory"));
			}
			else
				ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block.getValue()), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getKey().getResourcePath(), "inventory"));
		}
		
		for(Map.Entry<ResourceLocation, Item> item : ITEMS.entrySet())
		{
			if(item.getValue() instanceof IMetadata)
			{
				IMetadata meta = (IMetadata)item.getValue();
				
				for(int i = 0; i < meta.getCount(); i++)
					ModelLoader.setCustomModelResourceLocation(item.getValue(), i, new ModelResourceLocation(Reference.MOD_ID + ":" +  meta.getTexture(i), "inventory"));
			}
			else
				ModelLoader.setCustomModelResourceLocation(item.getValue(), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getKey().getResourcePath(), "inventory"));
		}
	}
	
	public static interface IItemProvider
	{
		ItemBlock getItemBlock();
	}
	
	public static interface IOreDictEntry
	{
		String getOreDictName();
	}
}
