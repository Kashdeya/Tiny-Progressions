package com.kashdeya.tinyprogressions.items.tools.wub;

import java.util.List;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.items.multi.MultiMain;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class WubMulti extends MultiMain{
	
	public WubMulti(ToolMaterial material){
		super(material);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setMaxStackSize(1);
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(TechItems.wub_ingot);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
	
	private int mineRadius = 1, mineDepth = 0;

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;
            RayTraceResult result = rayTrace(world, player, false);
            EnumFacing sideHit = result.sideHit;

            int xDist, yDist, zDist;
            yDist = xDist = zDist = mineRadius;

            switch (sideHit) {
                case UP:
                case DOWN: yDist = mineDepth; break;
                case NORTH:
                case SOUTH: zDist = mineDepth; break;
                case EAST:
                case WEST: xDist = mineDepth; break;
            }

            if (!player.isSneaking()) {
                for (int x = pos.getX() - xDist; x <= pos.getX() + xDist; x++) {
                    for (int y = pos.getY() - yDist; y <= pos.getY() + yDist; y++) {
                        for (int z = pos.getZ() - zDist; z <= pos.getZ() + zDist; z++) {
                            BlockPos targetPos = new BlockPos(x, y, z);
                            IBlockState targetBlock = world.getBlockState(targetPos);
                            if (canHarvestBlock(targetBlock, player.getHeldItem(EnumHand.MAIN_HAND))) {
                                if ((stack.getMaxDamage() - stack.getItemDamage()) >= 1 && targetBlock.getBlock() != Blocks.BEDROCK) {
                                    if (targetBlock.getBlock().getExpDrop(targetBlock, world, targetPos, 0) > 0) {
                                        if (!world.isRemote && world.getGameRules().getBoolean("doTileDrops")) {
                                            world.spawnEntity(new EntityXPOrb(world, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, world.getBlockState(pos).getBlock().getExpDrop(targetBlock, world, targetPos, 0)));
                                        }
                                    }
                                    world.destroyBlock(new BlockPos(x, y, z), true);
                                }
                                stack.damageItem(1, player);
                            }
                        }
                    }
                }
            } else {
                stack.damageItem(1, player);
            }
            return false;
        } else {
            return false;
        }
    }
    
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
            tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.wubpaxel_1").getFormattedText());
    }

}
