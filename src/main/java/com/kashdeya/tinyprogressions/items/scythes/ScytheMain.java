package com.kashdeya.tinyprogressions.items.scythes;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class ScytheMain extends ItemSword {
	
	public ScytheMain(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	  {
		ItemStack itemstack = playerIn.getHeldItem(hand);

        if (!playerIn.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = ForgeEventFactory.onHoeUse(itemstack, playerIn, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
        	
            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                    return EnumActionResult.SUCCESS;
                }
                
                if (block == Blocks.MYCELIUM)
                {
                    this.setBlock(itemstack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT));
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch (iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                        case PODZOL:
                        	this.setBlock(itemstack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT));
                            return EnumActionResult.SUCCESS;
                        default:
                        	break;
                    }
                }
            }

    	    for (int k = -1; k < 2; k++) {
    		      for (int l = -1; l < 2; l++)
    		      {
    		        BlockPos blockState = new BlockPos(pos.add(k, 0, l));
    		        if (!worldIn.isRemote && (worldIn.getBlockState(blockState).getBlock() instanceof IGrowable))
    		        {
    		          IGrowable cropBlock = (IGrowable)worldIn.getBlockState(blockState).getBlock();
    		          IBlockState cropState = worldIn.getBlockState(blockState);
    		          if (!cropBlock.canGrow(worldIn, blockState, cropState, false))
    		          {
    		            worldIn.destroyBlock(blockState, true);
    		            worldIn.setBlockState(blockState, cropState.getBlock().getDefaultState());
    		            itemstack.setItemDamage(itemstack.getItemDamage() + 1);
    		            if (itemstack.getItemDamage() >= itemstack.getMaxDamage() && !itemstack.isEmpty())
    		            {
    		              playerIn.setHeldItem(hand, ItemStack.EMPTY);
    		              return super.onItemUse(playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    		            }
    		          }
    		        }
    		      }
    		    }
    		    return super.onItemUse(playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    		  }
        }
	
	protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }
}