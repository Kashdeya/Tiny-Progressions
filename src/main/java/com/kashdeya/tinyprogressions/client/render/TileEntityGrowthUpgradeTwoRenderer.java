package com.kashdeya.tinyprogressions.client.render;

import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityGrowthUpgradeTwoRenderer extends TileEntitySpecialRenderer<TileEntityGrowthUpgradeTwo> {

	@Override
	public void render(TileEntityGrowthUpgradeTwo tile, double x, double y, double z, float partialTick, int destroyStage, float alpha) {
		
		if(tile == null || !tile.hasWorld())
			return;

		float ticks = tile.animationTicks + (tile.animationTicks - tile.prevAnimationTicks)  * partialTick;

		GlStateManager.pushMatrix();
		bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
		GlStateManager.translate(x + 0.5D, y + 0.175D, z + 0.5D);
		GlStateManager.scale(0.75D, 0.75D, 0.75D);
		GlStateManager.pushMatrix();
		GlStateManager.rotate(ticks, 0F, 1F, 0F);
		GlStateManager.pushMatrix();
		GlStateManager.translate(-0.5D, 0D, 0.5D);
		Minecraft.getMinecraft().getBlockRendererDispatcher().renderBlockBrightness(Blocks.DRAGON_EGG.getDefaultState(), 1.0F);
		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
		GlStateManager.popMatrix();
	}
}