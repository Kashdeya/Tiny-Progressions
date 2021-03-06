package com.kashdeya.tinyprogressions.blocks.reinforced;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.living.LivingDestroyBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
public class ReinforcedGlass extends AbstractGlassBlock implements IOreDictEntry
{
    public ReinforcedGlass()
    {
        super(Properties.create(Material.GLASS, MaterialColor.BLACK)
        		.hardnessAndResistance(40, 2000)
        		.harvestLevel(1)
        		.harvestTool(ToolType.PICKAXE)
        		.notSolid()
        		);

    }
    
    @Override
    public String getOreDictName() {
    	return "blockReinforcedGlass";
    }

    @Override
    public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {}
    
    @Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
      return false;
    }
    
    
    @SubscribeEvent
	public static void onWitherBlockDestory(LivingDestroyBlockEvent event) {
        if (((event.getEntity() instanceof WitherEntity) || (event.getEntity() instanceof WitherSkullEntity)))
        {
        	Block block = event.getEntity().world.getBlockState(event.getPos()).getBlock();
        	if(block == TechBlocks.reinforced_obsidian.get() || block == TechBlocks.reinforced_glass.get())
        	event.setCanceled(true);
        }
	}

    
}
