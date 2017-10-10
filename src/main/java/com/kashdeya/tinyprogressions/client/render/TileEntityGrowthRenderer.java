package com.kashdeya.tinyprogressions.client.render;

import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityGrowthRenderer extends TileEntitySpecialRenderer<TileEntityGrowth> {

	@Override
	public void renderTileEntityAt(TileEntityGrowth tile, double x, double y, double z, float partialTick, int destroyStage) {
		if(tile == null || !tile.hasWorldObj())
			return;

		float ticks = tile.animationTicks + (tile.animationTicks - tile.prevAnimationTicks)  * partialTick;

		GlStateManager.pushMatrix();
		bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
		GlStateManager.translate(x + 0.5D, y + 0.175D, z + 0.5D);
		GlStateManager.scale(0.65D, 0.65D, 0.65D);
		GlStateManager.pushMatrix();
		GlStateManager.rotate(ticks, 0F, 1F, 0F);
		GlStateManager.pushMatrix();
		GlStateManager.translate(-0.5D, 0D, 0.5D);
		Minecraft.getMinecraft().getBlockRendererDispatcher().renderBlockBrightness(Blocks.SEA_LANTERN.getDefaultState(), 1.0F);
		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
	}
}