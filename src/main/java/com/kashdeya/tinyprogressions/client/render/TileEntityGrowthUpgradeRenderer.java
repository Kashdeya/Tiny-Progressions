package com.kashdeya.tinyprogressions.client.render;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelEnderCrystal;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileEntityGrowthUpgradeRenderer extends TileEntitySpecialRenderer<TileEntityGrowthUpgrade> {

	private static final ResourceLocation ENDER_CRYSTAL_TEXTURES = new ResourceLocation("textures/entity/endercrystal/endercrystal.png");
	private final ModelBase modelEnderCrystalNoBase = new ModelEnderCrystal(0.0F, false);
	private final Entity entity = EntityList.createEntityByIDFromName(new ResourceLocation("minecraft:EnderCrystal"), (World)null);

	@Override
	public void renderTileEntityAt(TileEntityGrowthUpgrade tile, double x, double y, double z, float partialTick, int destroyStage) {
		IBlockState state = tile.getWorld().getBlockState(tile.getPos());

		if(state == null || state.getBlock() != TechBlocks.growth_upgrade)
			return;

		float ticks = tile.animationTicks + (tile.animationTicks - tile.prevAnimationTicks) * partialTick;
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5D, y + 0.45D, z + 0.5D);
		GlStateManager.scale(0.4D, 0.35D, 0.4D);
		bindTexture(ENDER_CRYSTAL_TEXTURES);
		modelEnderCrystalNoBase.render(entity, 0.0F, ticks * 3.0F, 0F, 0.0F, 0.0F, 0.0625F);
		GlStateManager.popMatrix();
	}
}