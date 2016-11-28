package com.kashdeya.tinyprogressions.events;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;

public class LeafDrops {
	
	float a = 0.25F;
	float b = 1.0F;
	float c = 0.15F;
	double d = 0.5D;

	@SubscribeEvent
	public void onDrops(BlockEvent.BreakEvent event) {

		if (ConfigHandler.LeafDrops == true){
			Block theblock = event.getState().getBlock();
				if (  theblock == Blocks.LEAVES || theblock == Blocks.LEAVES2||OreDictionary.getOres("treeLeaves").contains(new ItemStack(theblock)))
					{
						BlockLeaves leaves = (BlockLeaves)theblock;

							if(((Boolean)event.getState().getValue(PropertyBool.create("decayable"))).booleanValue()){
								if (event.getWorld().rand.nextInt(ConfigHandler.LeafDropsChance) == 0)
								{	 
									double d0 = event.getWorld().rand.nextFloat() * a + (b - c) * d;
									double d1 = event.getWorld().rand.nextFloat() * a + (b - c) * d;
									double d2 = event.getWorld().rand.nextFloat() * a + (b - c) * d;
									EntityItem entityitem = new EntityItem(event.getWorld(),event.getPos().getX()+d0,event.getPos().getY()+d1,event.getPos().getZ()+d2, new ItemStack(Items.STICK, 1, 0));
									event.getWorld().spawnEntityInWorld(entityitem);
								}
							}
					}
			}
		}

}
