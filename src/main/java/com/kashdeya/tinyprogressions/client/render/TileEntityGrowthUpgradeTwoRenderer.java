package com.kashdeya.tinyprogressions.client.render;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityGrowthUpgradeTwoRenderer extends TileEntitySpecialRenderer<TileEntityGrowthUpgradeTwo> {

	private final ItemStack stack = new ItemStack(Item.getItemFromBlock(Blocks.DRAGON_EGG));

	@Override
	public void renderTileEntityAt(TileEntityGrowthUpgradeTwo tile, double x, double y, double z, float partialTick, int destroyStage) {
		IBlockState state = tile.getWorld().getBlockState(tile.getPos());

		if(state == null || state.getBlock() != TechBlocks.growth_upgrade_two)
			return;

		float ticks = tile.animationTicks + (tile.animationTicks - tile.prevAnimationTicks)  * partialTick;
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5D, y + 0.65D, z + 0.5D);
		GlStateManager.scale(0.6, 0.6, 0.6);
		GlStateManager.rotate(ticks, 0F, 1F, 0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
		Minecraft.getMinecraft().getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(false, false);
		if (stack != null)
			Minecraft.getMinecraft().getRenderItem().renderItem(stack, Minecraft.getMinecraft().getRenderItem().getItemModelMesher().getItemModel(stack));
		GlStateManager.popMatrix();
	}
}
