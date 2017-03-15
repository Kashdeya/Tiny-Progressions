package com.kashdeya.tinyprogressions.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class WoodenBucket extends ItemBucket {
	
	private Block isFull;
	
	public WoodenBucket(Block containedBlockIn)
    {
		super(containedBlockIn);
		this.maxStackSize = 1;
        this.setCreativeTab(tinyprogressions.tabTP);
        this.isFull = containedBlockIn;
    }
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
	  {
	    boolean flag = this.isFull == Blocks.AIR;
	    RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, flag);
	    ActionResult<ItemStack> ret = ForgeEventFactory.onBucketUse(playerIn, worldIn, itemStackIn, raytraceresult);
	    if (ret != null) return ret;
	    
	    if (raytraceresult == null) 
	    {
	      return new ActionResult(EnumActionResult.PASS, itemStackIn);
	    }
	    else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK) 
	    {
	      return new ActionResult(EnumActionResult.PASS, itemStackIn);
	    }
	    else
	    {
	    	BlockPos blockpos = raytraceresult.getBlockPos();
	    	
	    	if (!worldIn.isBlockModifiable(playerIn, blockpos)) 
	    	{
	    		return new ActionResult(EnumActionResult.FAIL, itemStackIn);
	    	}
	    	else if (flag)
	    	{
	    		if (!playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemStackIn)) 
	    		{
	    			return new ActionResult(EnumActionResult.FAIL, itemStackIn);
	    		}
	    		else
	    		{
	    			IBlockState iblockstate = worldIn.getBlockState(blockpos);
	    			Material material = iblockstate.getMaterial();
	    			
	    			if ((material == Material.WATER) && ((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0)
	    			{
	    				worldIn.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 11);
	    				playerIn.addStat(StatList.getObjectUseStats(this));
	    				playerIn.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
	    				return new ActionResult(EnumActionResult.SUCCESS, this.fillBucket(itemStackIn, playerIn, TechItems.WoodenBucketFull));
	    			}
	    			else
	    			{
	    				return new ActionResult(EnumActionResult.FAIL, itemStackIn);
	    			}
	    		}
	    	}
	    	else
	    	{
	    		boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos);
	    		BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos : blockpos.offset(raytraceresult.sideHit);
	    		
	    		if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemStackIn)) 
	    		{
	    			return new ActionResult(EnumActionResult.FAIL, itemStackIn);
	    		}
	    		else if (tryPlaceContainedLiquid(playerIn, worldIn, blockpos1)) 
	    		{
	    			playerIn.addStat(StatList.getObjectUseStats(this));
	    			return !playerIn.capabilities.isCreativeMode ? new ActionResult(EnumActionResult.SUCCESS, new ItemStack(TechItems.WoodenBucket)) : new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
	    		}
	    		else
	    		{
	    			return new ActionResult(EnumActionResult.FAIL, itemStackIn);
	    		}
	    	}
	    }
	  }
	  
	private ItemStack fillBucket(ItemStack emptyBuckets, EntityPlayer player, Item fullBucket)
	  {
	    if (player.capabilities.isCreativeMode) 
	    {
	      return emptyBuckets;
	    }
	    else if (--emptyBuckets.stackSize <= 0) 
	    {
	      return new ItemStack(fullBucket);
	    }
	    else
	    {
	    	if (!player.inventory.addItemStackToInventory(new ItemStack(fullBucket))) 
	    	{
	    		player.dropItem(new ItemStack(fullBucket), false);
	    	}
	    	return emptyBuckets;
	    }
	  }
	  
	@Override
	public boolean tryPlaceContainedLiquid(EntityPlayer playerIn, World worldIn, BlockPos posIn)
	  {
	    if (this.isFull == Blocks.AIR) 
	    {
	      return false;
	    }
	    else
	    {
	    	IBlockState iblockstate = worldIn.getBlockState(posIn);
	    	Material material = iblockstate.getMaterial();
	    	boolean flag = !material.isSolid();
	    	boolean flag1 = iblockstate.getBlock().isReplaceable(worldIn, posIn);
	    
	    	if (!worldIn.isAirBlock(posIn) && !flag && !flag1) 
	    	{
	    		return false;
	    	}
	    	else
	    	{
	    		if (worldIn.provider.doesWaterVaporize() && this.isFull == Blocks.FLOWING_WATER)
	    		{
	    			int l = posIn.getX();
	    			int i = posIn.getY();
	    			int j = posIn.getZ();
	    			worldIn.playSound(playerIn, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

                    for (int k = 0; k < 8; k++) 
                    {
                    	worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, l + Math.random(), i + Math.random(), j + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
                    }
	    		}
	    		else
                {
                    if (!worldIn.isRemote && (flag || flag1) && !material.isLiquid())
                    {
                    	worldIn.destroyBlock(posIn, true);
                    }

                    SoundEvent soundevent = this.isFull == Blocks.FLOWING_LAVA ? SoundEvents.ITEM_BUCKET_EMPTY_LAVA : SoundEvents.ITEM_BUCKET_EMPTY;
                    worldIn.playSound(playerIn, posIn, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    worldIn.setBlockState(posIn, this.isFull.getDefaultState(), 11);
                }
	    		return true;
	    	}
	    }
	  }
	
    @Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, net.minecraft.nbt.NBTTagCompound nbt) {
        if (this.getClass() == WoodenBucket.class)
        {
            if (net.minecraftforge.fluids.FluidRegistry.isUniversalBucketEnabled())
            {
                return new net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper(stack);
            }
            else
            {
                return new net.minecraftforge.fluids.capability.wrappers.FluidContainerRegistryWrapper(stack); // when fluid container registry is gone, just use FluidBucketWrapper
            }
        }
        else
        {
            return super.initCapabilities(stack, nbt);
        }
    }
}
