package com.kashdeya.tinyprogressions.blocks.decorations;

import java.nio.ByteOrder;

import org.lwjgl.opengl.GL11;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class QuickSand extends StandardBlock {

	public QuickSand() {
		super(Properties
				.create(Material.SAND)
				.hardnessAndResistance(0.4F)
				.sound(SoundType.SAND)
				.harvestLevel(0)
				.harvestTool(ToolType.SHOVEL)
				.doesNotBlockMovement()
				);

	}

	
	
	@Override
	public VoxelShape getRenderShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return VoxelShapes.fullCube();
	}

//	@Override
//	public VoxelShape getCollisionBoundingBox(BlockState state, BlockAccess worldIn, BlockPos pos) {
//		return VoxelShapes.empty();
//	}

	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		entityIn.isAirBorne = false;
		entityIn.setMotionMultiplier(state, new Vec3d(0.25D, (double)0.05F, 0.25D));
		
		if(entityIn instanceof PlayerEntity)
			if(!((PlayerEntity)entityIn).isPotionActive(Effects.MINING_FATIGUE))
				((PlayerEntity)entityIn).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 180, 1, false, false));
		
		
		BlockPos eyeHeight = entityIn.getPosition().add(0, entityIn.getEyeHeight(), 0);
		if(eyeHeight.getY() == pos.getY()) {
			if(entityIn.getAir() > 0 ) entityIn.setAir(entityIn.getAir() - 5);
			else {
				entityIn.attackEntityFrom(DamageSource.IN_WALL, 2);
			}
		}
	}
	

	@SubscribeEvent
	public void onEntityJump(LivingJumpEvent e) {
		if (e.getEntity().getEntityWorld().getBlockState(new BlockPos((int) Math.floor(e.getEntity().getPosition().getX()), (int) Math.floor(e.getEntity().getPosition().getY()) - 1, (int) Math.floor(e.getEntity().getPosition().getZ()))).getBlock() == this)
			e.getEntityLiving().setMotion(e.getEntityLiving().getMotion().getX(), .001, e.getEntityLiving().getMotion().getY());
	}
	
	private static ResourceLocation SandTexture = new ResourceLocation("minecraft:textures/sand");
	
	
	public static void onHeadSubmerged(RenderGameOverlayEvent.Post event) {
        		if(event.getType() == ElementType.HELMET)
		{
			BlockPos pos = Minecraft.getInstance().player.getPosition().add(0, Minecraft.getInstance().player.getEyeHeight(), 0);
			if(Minecraft.getInstance().world.getBlockState(pos).getBlock() instanceof QuickSand) {
				if(Minecraft.getInstance().gameSettings.thirdPersonView == 0)
				{
					Minecraft.getInstance().textureManager.bindTexture(new ResourceLocation("minecraft","textures/block/sand.png"));
					int par5 = getColorFromRGBA(255, 255, 255, 255);
					//Draw gasMask Overlay
					float f = (float)(par5 >> 24 & 255) / 255.0F;
					float f1 = (float)(par5 >> 16 & 255) / 255.0F;
					float f2 = (float)(par5 >> 8 & 255) / 255.0F;
					float f3 = (float)(par5 & 255) / 255.0F;
					GL11.glEnable(GL11.GL_BLEND);
					GL11.glDisable(GL11.GL_DEPTH_TEST);
					GL11.glDepthMask(false);
					GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
					GL11.glColor4f(f1, f2, f3, f);
					GL11.glDisable(GL11.GL_ALPHA_TEST);
					RenderSystem.enableLighting();

					int width = Minecraft.getInstance().func_228018_at_().getScaledWidth();
					int height = Minecraft.getInstance().func_228018_at_().getScaledHeight();
					
			        Tessellator tessellator = Tessellator.getInstance();
			        BufferBuilder wr = tessellator.getBuffer();
			        wr.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
			        wr.func_225582_a_(0, height, 0).func_225583_a_(0, 1).endVertex();
			        wr.func_225582_a_(width, height, 0).func_225583_a_(1,1).endVertex();
			        wr.func_225582_a_(width, 0, 0).func_225583_a_(1,0).endVertex();
			        wr.func_225582_a_(0,0,0).func_225583_a_(0,0).endVertex();

			        
			        tessellator.draw();
					
					GL11.glDepthMask(true);
					GL11.glEnable(GL11.GL_DEPTH_TEST);
					GL11.glEnable(GL11.GL_ALPHA_TEST);
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
			}
		}
	}
	
	public static int getColorFromRGBA(int R, int G, int B, int A)
	{
		if(R > 255)
		{
			R = 255;
		}
		
		if(G > 255)
		{
			G = 255;
		}
		
		if(B > 255)
		{
			B = 255;
		}
		
		if(A > 255)
		{
			A = 255;
		}
		
		if(R < 0)
		{
			R = 0;
		}
		
		if(G < 0)
		{
			G = 0;
		}
		
		if(B < 0)
		{
			B = 0;
		}
		
		if(A < 0)
		{
			A = 0;
		}
		
		if(ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
		{
			return A << 24 | R << 16 | G << 8 | B;
		} else
		{
			return B << 24 | G << 16 | R << 8 | A;
		}
	}

	
}