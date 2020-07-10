package com.kashdeya.tinyprogressions.blocks.cobblegen;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;
import com.kashdeya.tinyprogressions.tiles.TileEntityCobblegen;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
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
	public boolean func_229869_c_(BlockState p_229869_1_, IBlockReader p_229869_2_, BlockPos p_229869_3_) {
	   return false;
	}

	@Override
	public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
      return false;
	}
//	@Override
//    public BlockRenderLayer getRenderLayer()
//    {
//        return BlockRenderLayer.CUTOUT_MIPPED;
//    }

	@Override
    public BlockRenderType getRenderType(BlockState state) {
		
        return BlockRenderType.MODEL;
     }

	@Override	
	public ActionResultType func_225533_a_(BlockState p_225533_1_, World worldIn, BlockPos pos, PlayerEntity player, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {


		if(worldIn.isRemote)
    	{
    		return ActionResultType.SUCCESS;
    	}

    	TileEntity tile = worldIn.getTileEntity(pos);
    	
    	if(tile != null && tile instanceof TileEntityCobblegen)
    	{

    		TileEntityCobblegen ttest = (TileEntityCobblegen)tile;
    		
    		if(!player.isCrouching())
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
        		
        		if(worldIn.isRemote())
        			player.sendMessage(new TranslationTextComponent(Blocks.COBBLESTONE.getNameTextComponent().getString() + " x " + (stack.isEmpty()? 0 : stack.getCount())));
    		}
    	}
    	
        return ActionResultType.SUCCESS;
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
    
	
	@Override
	public boolean hasTileEntity(BlockState state){
		return true;
	}
	
	@Nullable
	@Override
	public TileEntity createTileEntity(final BlockState state, final IBlockReader world) {
		return new TileEntityCobblegen().setGenStats(cycleUpdate, stackSize);
	}
    
    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_1", stackSize).setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_2", cycleUpdate).setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_3").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    	tooltip.add(new TranslationTextComponent("tooltip.cobblegen_4").setStyle(new Style().setColor(TextFormatting.YELLOW)));
    }

}
