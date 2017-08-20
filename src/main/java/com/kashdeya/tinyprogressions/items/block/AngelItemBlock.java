package com.kashdeya.tinyprogressions.items.block;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AngelItemBlock extends ItemBlock
{
	public AngelItemBlock(Block block)
	{
		super(block);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		if(world.isRemote)
			return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
		
		int x = (int)Math.floor(player.posX);
		int y = (int)Math.floor(player.posY + player.getEyeHeight());
		int z = (int)Math.floor(player.posZ);
		
		Vec3d look = player.getLookVec();
		
		EnumFacing side = EnumFacing.getFacingFromVector((float)look.x, (float)look.y, (float)look.z);
		switch(side)
		{
		case DOWN:
			y = (int)(Math.floor(player.getEntityBoundingBox().minY) - 1.0);
			break;
		case UP:
			y = (int)(Math.floor(player.getEntityBoundingBox().maxY) + 1.0);
			break;
		case NORTH:
			z = (int)(Math.floor(player.getEntityBoundingBox().minZ) - 1.0);
			break;
		case SOUTH:
			z = (int)(Math.floor(player.getEntityBoundingBox().maxZ) + 1.0);
			break;
		case WEST:
			x = (int)(Math.floor(player.getEntityBoundingBox().minX) - 1.0);
			break;
		case EAST:
			x = (int)(Math.floor(player.getEntityBoundingBox().maxX) + 1.0);
			break;
		}
		
		BlockPos pos = new BlockPos(x, y, z);
		if(world.mayPlace(block, pos, false, side, player))
			player.getHeldItem(hand).onItemUse(player, world, pos, hand, side, 0, 0, 0);
		
		return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}
}
