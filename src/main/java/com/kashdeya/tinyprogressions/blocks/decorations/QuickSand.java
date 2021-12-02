package com.kashdeya.tinyprogressions.blocks.decorations;

import java.nio.ByteOrder;
import java.util.UUID;

import org.lwjgl.opengl.GL11;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

//@Mod.EventBusSubscriber(modid = "tp", bus = Bus.FORGE, value = Dist.CLIENT)
public class QuickSand extends StandardBlock {

	public QuickSand() {
		super(Properties.of(Material.SAND).strength(0.4F).sound(SoundType.SAND).harvestLevel(0)
				.harvestTool(ToolType.SHOVEL).noCollission().requiresCorrectToolForDrops().speedFactor(0.25F)
				.jumpFactor(0.01F).isRedstoneConductor(QuickSand::never).isViewBlocking(QuickSand::always));

	}

   private static Boolean always(BlockState p_235427_0_, IBlockReader p_235427_1_, BlockPos p_235427_2_, EntityType<?> p_235427_3_) {
	      return (boolean)true;
	   }
   
   private static boolean always(BlockState p_235426_0_, IBlockReader p_235426_1_, BlockPos p_235426_2_) {
	      return true;
	   }
   

   private static boolean never(BlockState p_235436_0_, IBlockReader p_235436_1_, BlockPos p_235436_2_) {
      return false;
   }
   
   private static Boolean never(BlockState p_235427_0_, IBlockReader p_235427_1_, BlockPos p_235427_2_, EntityType<?> p_235427_3_) {
	      return (boolean)false;
	   }
																	// we get the
	@Override																							// vanilla default
	public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
		return false;
	}																						// of 0.01

	@Override
	public void entityInside(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {

		entityIn.setOnGround(true);

		if (entityIn.getZ() != entityIn.zOld || entityIn.getX() != entityIn.xOld) {
			entityIn.makeStuckInBlock(state, new Vector3d(0.25D, (double) 0.2F, 0.25D));
		} else {
			entityIn.makeStuckInBlock(state, new Vector3d(0.25D, (double) 0.01F, 0.25D));
		}

		if (entityIn instanceof PlayerEntity)
			if (!((PlayerEntity) entityIn).hasEffect(Effects.DIG_SLOWDOWN))
				((PlayerEntity) entityIn).addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 180, 1, false, false));

		if (worldIn.isClientSide())
			super.entityInside(state, worldIn, pos, entityIn);

		Vector3d eyeHeight = entityIn.position().add(0, entityIn.getEyeHeight(), 0);
		if (entityIn instanceof LivingEntity) {
			if (Math.floor(entityIn.getEyeY()) == pos.getY()) {
				if (entityIn.getAirSupply() > 0) {
					entityIn.setAirSupply(entityIn.getAirSupply() - 4);
				} else {
					entityIn.hurt(DamageSource.IN_WALL, 2);
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityJump(LivingJumpEvent e) {

		System.out.println("jump");
		if (e.getEntity().getCommandSenderWorld()
				.getBlockState(new BlockPos((int) Math.floor(e.getEntity().getX()),
						(int) Math.floor(e.getEntity().getY()) - 1, (int) Math.floor(e.getEntity().getZ())))
				.getBlock() == this)
			e.getEntityLiving().setDeltaMovement(e.getEntityLiving().getDeltaMovement().x, .0001,
					e.getEntityLiving().getDeltaMovement().y);
	}

	private static ResourceLocation SandTexture = new ResourceLocation("minecraft:textures/sand");

//	// New Option was found.. 
//	@SubscribeEvent
//	public static void onHeadSubmerged(RenderGameOverlayEvent.Post event) {
//		if (event.getType() == ElementType.HELMET) {
//			BlockPos pos = new BlockPos(Minecraft.getInstance().player.position().add(0, Minecraft.getInstance().player.getEyeHeight(), 0));
//			if (Minecraft.getInstance().level.getBlockState(pos).getBlock() instanceof SandBlock) {
//				
//				if (Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
//					Minecraft.getInstance().textureManager.bind(new ResourceLocation("minecraft", "textures/block/sand.png"));
//					int par5 = getColorFromRGBA(255, 255, 255, 255);
//					// Draw gasMask Overlay
//					float f = (float) (par5 >> 24 & 255) / 255.0F;
//					float f1 = (float) (par5 >> 16 & 255) / 255.0F;
//					float f2 = (float) (par5 >> 8 & 255) / 255.0F;
//					float f3 = (float) (par5 & 255) / 255.0F;
//					GL11.glEnable(GL11.GL_BLEND);
//					GL11.glDisable(GL11.GL_DEPTH_TEST);
//					GL11.glDepthMask(false);
//					GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
//					GL11.glColor4f(f1, f2, f3, f);
//					GL11.glDisable(GL11.GL_ALPHA_TEST);
//					RenderSystem.enableLighting();
//
//					int width = Minecraft.getInstance().getWindow().getGuiScaledWidth();
//					int height = Minecraft.getInstance().getWindow().getGuiScaledHeight();
//
//					Tessellator tessellator = Tessellator.getInstance();
//					BufferBuilder wr = tessellator.getBuilder();
//					wr.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
//					wr.vertex(0, height, 0).uv(0, 1).endVertex();
//					wr.vertex(width, height, 0).uv(1, 1).endVertex();
//					wr.vertex(width, 0, 0).uv(1, 0).endVertex();
//					wr.vertex(0, 0, 0).uv(0, 0).endVertex();
//
//					tessellator.end();
//
//					GL11.glDepthMask(true);
//					GL11.glEnable(GL11.GL_DEPTH_TEST);
//					GL11.glEnable(GL11.GL_ALPHA_TEST);
//					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//				}
//			}
//		}
//	}
//
//	public static int getColorFromRGBA(int R, int G, int B, int A) {
//		if (R > 255) {
//			R = 255;
//		}
//
//		if (G > 255) {
//			G = 255;
//		}
//
//		if (B > 255) {
//			B = 255;
//		}
//
//		if (A > 255) {
//			A = 255;
//		}
//
//		if (R < 0) {
//			R = 0;
//		}
//
//		if (G < 0) {
//			G = 0;
//		}
//
//		if (B < 0) {
//			B = 0;
//		}
//
//		if (A < 0) {
//			A = 0;
//		}
//
//		if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
//			return A << 24 | R << 16 | G << 8 | B;
//		} else {
//			return B << 24 | G << 16 | R << 8 | A;
//		}
//	}

}