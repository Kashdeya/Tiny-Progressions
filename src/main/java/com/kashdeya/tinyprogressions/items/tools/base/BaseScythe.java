package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class BaseScythe extends SwordItem {
	
	
	static {
		BaseScythe emeraldScythe=  new BaseScythe(ItemToolModTier.EMERALD, 0, 0, new Properties());
		BaseScythe obsidianScythe = new BaseScythe(ItemToolModTier.OBSIDIAN, 0, 0, new Properties());
	}

	public BaseScythe(IItemTier tier,  int p_i48460_2_, float p_i48460_3_, Properties properties) {
		super(tier,p_i48460_2_,p_i48460_3_, properties);

	}
	
	@Override
	public ActionResultType onItemUse(ItemUseContext context)
	  {
		ItemStack itemstack = context.getPlayer().getHeldItem(context.getHand());

        if (!context.getPlayer().canPlayerEdit(context.getPos().offset(context.getFace()), context.getFace(), itemstack))
        {
            return ActionResultType.PASS;
        }
        else
        {
            int hook = ForgeEventFactory.onHoeUse(context);
            if (hook != 0) return hook > 0 ? ActionResultType.SUCCESS : ActionResultType.FAIL;
        	
            BlockState iblockstate = context.getWorld().getBlockState(context.getPos());
            Block block = iblockstate.getBlock();

            if (context.getFace() != Direction.DOWN && context.getWorld().isAirBlock(context.getPos().up()))
            {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(), Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                    return ActionResultType.SUCCESS;
                }
                
                if (block == Blocks.MYCELIUM)
                {
                    this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(), Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT));
                    return ActionResultType.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch (iblockstate..getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(), Blocks.FARMLAND.getDefaultState());
                            return ActionResultType.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(), Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return ActionResultType.SUCCESS;
                        case PODZOL:
                        	this.setBlock(itemstack, context.getPlayer(), context.getWorld(), context.getPos(), Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT));
                            return ActionResultType.SUCCESS;
                        default:
                        	break;
                    }
                }
            }

    	    for (int k = -1; k < 2; k++) {
    		      for (int l = -1; l < 2; l++)
    		      {
    		        BlockPos blockState = new BlockPos(context.getPos().add(k, 0, l));
    		        if (!context.getWorld().isRemote && (context.getWorld().getBlockState(blockState).getBlock() instanceof IGrowable))
    		        {
    		          IGrowable cropBlock = (IGrowable)context.getWorld().getBlockState(blockState).getBlock();
    		          BlockState cropState = context.getWorld().getBlockState(blockState);
    		          if (!cropBlock.canGrow(context.getWorld(), blockState, cropState, false))
    		          {
    		        	  context.getWorld().destroyBlock(blockState, true);
    		        	  context.getWorld().setBlockState(blockState, cropState.getBlock().getDefaultState());
    		            itemstack.setItemDamage(itemstack.getItemDamage() + 1);
    		            if (itemstack.getItemDamage() >= itemstack.getMaxDamage() && !itemstack.isEmpty())
    		            {
    		            	context.getPlayer().setHeldItem(context.getHand(), ItemStack.EMPTY);
    		              return super.onItemUse(context);
    		            }
    		          }
    		        }
    		      }
    		    }
    		    return super.onItemUse(context);
    		  }
        }
	
	protected void setBlock(ItemStack stack, PlayerEntity player, World worldIn, BlockPos pos, BlockState state)
    {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }
}