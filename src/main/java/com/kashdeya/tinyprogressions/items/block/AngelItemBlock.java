package com.kashdeya.tinyprogressions.items.block;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class AngelItemBlock extends BlockItem
{
	public AngelItemBlock(Block block)
	{
		super(block, new Properties().stacksTo(1).tab(TinyProgressions.TAB));
	}
	
	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) 
	{
		if(world.isClientSide)
			return new ActionResult<ItemStack>(ActionResultType.SUCCESS, player.getItemInHand(hand));
		
		int x = (int)Math.floor(player.getX());
		int y = (int)Math.floor(player.getY() + player.getEyeHeight());
		int z = (int)Math.floor(player.getZ());
		
		Vector3d look = player.getLookAngle();
		
		Direction side = Direction.getNearest((float)look.x, (float)look.y, (float)look.z);
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
		ItemUseContext context = new ItemUseContext(player, hand, new BlockRayTraceResult(Vector3d.ZERO,side, pos, false));
		BlockItemUseContext blockContext = new BlockItemUseContext(context);
		if(canPlace(blockContext, this.getBlock().defaultBlockState()))
			player.getItemInHand(hand).useOn(context);

		return new ActionResult<ItemStack>(ActionResultType.SUCCESS, player.getItemInHand(hand));
	}
}
