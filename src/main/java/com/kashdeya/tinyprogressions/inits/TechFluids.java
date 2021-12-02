package com.kashdeya.tinyprogressions.inits;

import java.awt.Color;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.fluids.VasholineFluid;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidAttributes.Builder;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TechFluids {

	
	public static RegistryObject<FlowingFluid> vasholine_fluid =         TinyProgressions.FLUIDS.register("vasholine_still",   () -> new VasholineFluid.Source(TechFluids.vasholine_fluid_properties));
	public static RegistryObject<FlowingFluid> vasholine_fluid_flowing = TinyProgressions.FLUIDS.register("vasholine_flowing", () -> new VasholineFluid.Flowing(TechFluids.vasholine_fluid_properties));
	public static RegistryObject<Item> vasholine_bucket =                TinyProgressions.ITEMS.register ("vasholine_bucket",  () -> new BucketItem(vasholine_fluid,new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(TinyProgressions.ToolsGroup)));
	public static final ForgeFlowingFluid.Properties vasholine_fluid_properties = 
			new ForgeFlowingFluid
			.Properties(vasholine_fluid, vasholine_fluid_flowing, 
					fluidBuilderAttributes(
							new Color(182, 209, 0)
							.getRGB(), 5000, 5000, 300, 20))
			.bucket(() -> TechFluids.vasholine_bucket.get())
			.block(() -> TechFluids.vasholine.get());

	
	public static RegistryObject<FlowingFluidBlock> vasholine =	TinyProgressions.BLOCKS
				.register("vasholine", 
						() -> new FlowingFluidBlock(
								() -> TechFluids.vasholine_fluid.get(),  AbstractBlock.Properties.of(Material.WATER).noCollission().strength(100.0F).noDrops().lightLevel((p) -> 15).randomTicks())
						{
							   @Nullable
							   @OnlyIn(Dist.CLIENT)
							   public IParticleData getDripParticleData() {
							      return ParticleTypes.DRIPPING_WATER;
							   }
							   
							   @Override
							   public void entityInside(BlockState state, World world, BlockPos pos, Entity entity) {
									if (entity instanceof PlayerEntity) {
										if(world.getGameTime()%20 == 0 && ((PlayerEntity) entity).getHealth() < ((PlayerEntity) entity).getMaxHealth()) {// add whatever time you want here 20 = every 1 second
											System.out.println("heal");
											((PlayerEntity) entity).heal(ConfigHandler.vasholine_heal_amount);
										}
										if (ConfigHandler.wub_weakness){
											((PlayerEntity) entity).addEffect(new EffectInstance(Effects.WEAKNESS, 20, 0, false, false));
										}
										if (ConfigHandler.wub_blindness){
											((PlayerEntity) entity).addEffect(new EffectInstance(Effects.BLINDNESS, 20, 0, false, false));
										}
										if (ConfigHandler.wub_fatigue){	
											((PlayerEntity) entity).addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 20, 0, false, false));
										}
									}
									if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity) && ConfigHandler.vasholine_mobs){
										entity.hurt(DamageSource.MAGIC, ConfigHandler.vasholine_mobs_amount);
									}
									if (entity instanceof LivingEntity && !(entity instanceof PlayerEntity) && ConfigHandler.wub_heal_mobs){
										((LivingEntity) entity).heal(ConfigHandler.mob_heal_amount);
									}
							   }
							   
								@Override
								public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
									if (worldIn.isEmptyBlock(pos.above()) && worldIn.getGameTime() % 5 == 0) {
										float xx = (float) pos.getX() + 0.5F;
										float zz = (float) pos.getZ() + 0.5F;
										float fixedOffset = 0.25F;
										float randomOffset = rand.nextFloat() * 0.6F - 0.3F;
										
										worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx - fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
										worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx + fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
										worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz - fixedOffset), 0.0D, 0.0D, 0.0D);
										worldIn.addParticle(ParticleTypes.FIREWORK, true, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz + fixedOffset), 0.0D, 0.0D, 0.0D);
									}
								}
								
							    @Override
							    @OnlyIn(Dist.CLIENT)
							    public void appendHoverText(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
							    	tooltip.add(new TranslationTextComponent("tooltip.vasholine_1"));
							    }
							
						});

	
	
	public static Builder fluidBuilderAttributes(int fluidColor, int density, int viscosity, int temperature, int luminosity) {
		FluidAttributes.Builder fluidBuilder = FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"));
		fluidBuilder.color(fluidColor);
		fluidBuilder.density(density);
		fluidBuilder.viscosity(viscosity);
		fluidBuilder.temperature(temperature);
		fluidBuilder.luminosity(luminosity);
		return fluidBuilder;
	}
}
