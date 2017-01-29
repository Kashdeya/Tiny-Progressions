package com.kashdeya.tinyprogressions.client.render;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityGrowthUpgradeRenderer extends TileEntitySpecialRenderer<TileEntityGrowthUpgrade> {

	@Override
	public void renderTileEntityAt(TileEntityGrowthUpgrade tile, double x, double y, double z, float partialTick, int destroyStage) {
		IBlockState state = tile.getWorld().getBlockState(tile.getPos());

		if(state == null || state.getBlock() != TechBlocks.growth_upgrade)
			return;

		Entity entity = EntityList.createEntityByName("EnderCrystal", (World)null);
		((EntityEnderCrystal) entity).setShowBottom(false);
		((EntityEnderCrystal) entity).innerRotation = tile.animationTicks;
		Render renderer = Minecraft.getMinecraft().getRenderManager().getEntityRenderObject(entity);

		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5D, y + 0.31D, z + 0.5D);
		GlStateManager.scale(0.3, 0.3, 0.3);
		GlStateManager.pushAttrib();
		renderer.doRender(entity, 0, 0, 0, 0, 0);
		GlStateManager.popAttrib();
		GlStateManager.popMatrix();
	}

}