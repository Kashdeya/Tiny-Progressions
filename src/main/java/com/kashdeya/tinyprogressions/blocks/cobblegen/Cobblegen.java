package com.kashdeya.tinyprogressions.blocks.cobblegen;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;

import net.minecraft.block.Block.Properties;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.ToolType;

public class Cobblegen extends StandardBlock{

	int cycleUpdate;
	int stackSize;
	
	public Cobblegen(int cycleUpdate, int stackSize, Properties properties)
	{
		super(properties
				.hardnessAndResistance(1.0F, 1000.0F)
				.lightValue(1)
				.sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1));
		
		this.cycleUpdate = cycleUpdate;
		this.stackSize = stackSize;
	}
	
	

	@Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

	@Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
     }

//TODO
//	@Override
//    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
//    {
//        return false;
//    }
//	
	@Override
    public boolean onBlockActivated(final BlockState state, final World worldIn, final BlockPos pos, final PlayerEntity player, final Hand handIn, final BlockRayTraceResult hit)
    {
    	if(worldIn.isRemote)
    	{
    		return true;
    	}
    	
    	TileEntity tile = worldIn.getTileEntity(pos);
    	
    	if(tile != null && tile instanceof TileEntityCobblegen)
    	{
    		TileEntityCobblegen ttest = (TileEntityCobblegen)tile;
    		
    		if(!player.isSneaking())
    		{
        		ItemStack stack = ttest.getInventory().getAndRemoveSlot(0);
        		
	    		if(stack != null)
	    		{
		    		if(!player.inventory.addItemStackToInventory(stack))
		    		{		    			
		    			//player.dropItem(stack, false);
		    			ForgeHooks.onPlayerTossEvent(player, stack, false);
		    		}
	    		}
    		} else
    		{
        		ItemStack stack = ttest.getInventory().getStackInSlot(0);
    			player.sendMessage(new TranslationTextComponent(Blocks.COBBLESTONE.getNameTextComponent() + " x " + (stack.isEmpty()? 0 : stack.getCount())));
    		}
    	}
    	
        return true;
    }

	@Override
	public void onReplaced(BlockState oldState, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
		if (oldState.getBlock() != newState.getBlock()) {
			TileEntity tile =worldIn.getTileEntity(pos);
			
			if (tile != null && tile instanceof TileEntityCobblegen)
			{
				((TileEntityCobblegen) tile).getInventory().dropInventory(worldIn, pos);
			}
        
		}
		super.onReplaced(oldState, worldIn, pos, newState, isMoving);
    }
    
	@Nullable
	@Override
	public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
		
		return new TileEntityCobblegen().setGenStats(cycleUpdate, cycleUpdate);
	}
    
    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_2").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_3").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_4").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    }

}
