package com.kashdeya.tinyprogressions.items.block;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
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
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
	{
		if(world.isRemote)
			return ActionResult.newResult(ActionResultType.SUCCESS, player.getHeldItem(hand));
		
		int x = (int)Math.floor(player.posX);
		int y = (int)Math.floor(player.posY + player.getEyeHeight());
		int z = (int)Math.floor(player.posZ);
		
		Vec3d look = player.getLookVec();
		
		Direction side = Direction.getFacingFromVector((float)look.x, (float)look.y, (float)look.z);
		switch(side)
		{
		case DOWN:
			y = (int)(Math.floor(player.getBoundingBox().minY) - 1.0);
			break;
		case UP:
			y = (int)(Math.floor(player.getBoundingBox().maxY) + 1.0);
			break;
		case NORTH:
			z = (int)(Math.floor(player.getBoundingBox().minZ) - 1.0);
			break;
		case SOUTH:
			z = (int)(Math.floor(player.getBoundingBox().maxZ) + 1.0);
			break;
		case WEST:
			x = (int)(Math.floor(player.getBoundingBox().minX) - 1.0);
			break;
		case EAST:
			x = (int)(Math.floor(player.getBoundingBox().maxX) + 1.0);
			break;
		}
		
		BlockPos pos = new BlockPos(x, y, z);
		if(world.mayPlace(block, pos, false, side, player))
			player.getHeldItem(hand).onItemUse(player, world, pos, hand, side, 0, 0, 0);
		
		return ActionResult.newResult(ActionResultType.SUCCESS, player.getHeldItem(hand));
	}
}
