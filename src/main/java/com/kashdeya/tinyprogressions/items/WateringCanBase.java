package com.kashdeya.tinyprogressions.items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

import com.kashdeya.tinyprogressions.handlers.CanHandler;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class WateringCanBase extends Item {
	
		private int range = 1;
		private int waterChance = 25;
		
		public WateringCanBase(){
			this.setMaxStackSize(1);
			this.setCreativeTab(tinyprogressions.tabTP);
		}
		
		protected void setWateringRange(int newRange)
		{
			this.range = newRange;
		}
		
		protected void setWateringChance(int newChance)
		{
			this.waterChance = newChance;
		}
		  
		public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		    if (!player.canPlayerEdit(pos.offset(facing), facing, stack)) {
		      return EnumActionResult.FAIL;
		    }
		    Random rand = new Random();
		    for (int x = -range; x <= range; x++) {
		      for (int z = -range; z <= range; z++)
		      {
		        double d0 = pos.add(x, 0, z).getX() + rand.nextFloat();
		        double d1 = pos.add(x, 0, z).getY() + 1.0D;
		        double d2 = pos.add(x, 0, z).getZ() + rand.nextFloat();
		        
		        IBlockState checkSolidState = world.getBlockState(pos);
		        Block checkSolid = checkSolidState.getBlock();
		        if ((checkSolid.isFullCube(checkSolidState)) || ((checkSolid instanceof BlockFarmland))) {
		          d1 += 1.0D;
		        }
		        
		        world.spawnParticle(EnumParticleTypes.WATER_DROP, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[5]);
		      }
		    }
		    if (!world.isRemote)
		    {
		    	int chance = CanHandler.randInt(1, 100);
		        if (chance <= waterChance)
		        {
		          for (int xAxis = -range; xAxis <= range; xAxis++) {
		            for (int zAxis = -range; zAxis <= range; zAxis++) {
		              for (int yAxis = -range; yAxis <= range; yAxis++)
		              {
		            	  Block checkBlock = world.getBlockState(pos.add(xAxis, yAxis, zAxis)).getBlock();
		            	  
		            	  if(checkBlock instanceof IGrowable || checkBlock == Blocks.MYCELIUM)
		            	  {
		            		  world.scheduleBlockUpdate(pos.add(xAxis, yAxis, zAxis), checkBlock, 0, 1);
		            	  }
		              }
		            }
		          }
		          return EnumActionResult.SUCCESS;
		        }
		        return EnumActionResult.PASS;
		      }
		      return EnumActionResult.PASS;
		    }
		
		public static boolean applyBonemeal(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player){
			
		        IBlockState iblockstate = worldIn.getBlockState(target);

		        int hook = ForgeEventFactory.onApplyBonemeal(player, worldIn, target, iblockstate, stack);
		        if (hook != 0) return hook > 0;

		        if ((iblockstate.getBlock() instanceof IGrowable && iblockstate.getBlock() != Blocks.GRASS))
		        {
		            IGrowable igrowable = (IGrowable)iblockstate.getBlock();

		            if (igrowable.canGrow(worldIn, target, iblockstate, worldIn.isRemote))
		            {
		                if (!worldIn.isRemote)
		                {
		                    if (igrowable.canUseBonemeal(worldIn, worldIn.rand, target, iblockstate))
		                    {
		                        igrowable.grow(worldIn, worldIn.rand, target, iblockstate);
		                    }

		                    stack.stackSize -= 1;
		                }

		                return true;
		            }
		        }

		        return false;
		    }
}
