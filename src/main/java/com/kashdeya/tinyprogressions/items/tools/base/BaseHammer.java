package com.kashdeya.tinyprogressions.items.tools.base;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.items.materials.ItemToolModTier;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class BaseHammer extends PickaxeItem {
	
	public BaseHammer(IItemTier tier, int maxDamage, float attackSpeed, Properties prop){
		super(tier, maxDamage, attackSpeed, prop.group(TinyProgressions.TAB)
				.addToolType(ToolType.PICKAXE, tier.getHarvestLevel()));
		
	}
	
	private int mineRadius = 1, mineDepth = 0;

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {

        if (entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            
            Vec3d vec3d = new Vec3d(entityLiving.getPosition().getX(), entityLiving.getPosition().getY() + (double)entityLiving.getEyeHeight(), entityLiving.getPosition().getZ());
            Vec3d vec3d1 = new Vec3d(pos);
            RayTraceResult raytrace =  worldIn.rayTraceBlocks(new RayTraceContext(vec3d, vec3d1, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, player)); 
            BlockRayTraceResult blockraytraceresult = (BlockRayTraceResult)raytrace;
            
	    if (blockraytraceresult.getFace() == null) return false;
            Direction sideHit = blockraytraceresult.getFace();

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

                for (int x = pos.getX() - xDist; x <= pos.getX() + xDist; x++) {
                    for (int y = pos.getY() - yDist; y <= pos.getY() + yDist; y++) {
                        for (int z = pos.getZ() - zDist; z <= pos.getZ() + zDist; z++) {
                            BlockPos targetPos = new BlockPos(x, y, z);
                            BlockState targetBlock = worldIn.getBlockState(targetPos);
                            if (canHarvestBlock(targetBlock)) {
                                if ((stack.getMaxDamage() - stack.getDamage()) >= 1 && targetBlock.getBlock() != Blocks.BEDROCK) {
                                    if (targetBlock.getBlock().getExpDrop(targetBlock, worldIn, targetPos, 0, 0) > 0) {
                                        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
                                        	worldIn.addEntity(new ExperienceOrbEntity(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, worldIn.getBlockState(pos).getBlock().getExpDrop(targetBlock, worldIn, targetPos, 0, 0)));
                                        }
                                    }
                                    worldIn.destroyBlock(new BlockPos(x, y, z), true);
                                }
                                stack.damageItem(1, player,  (p_220040_1_) -> { p_220040_1_.sendBreakAnimation(Hand.MAIN_HAND); });
                            }
                        }
                    }
                }
                stack.damageItem(1, player,  (p_220040_1_) -> { p_220040_1_.sendBreakAnimation(Hand.MAIN_HAND); });
            }
            return false;
        }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.wubhammer_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    }

}