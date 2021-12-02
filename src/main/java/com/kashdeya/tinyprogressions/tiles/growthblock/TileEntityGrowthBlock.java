package com.kashdeya.tinyprogressions.tiles.growthblock;

import com.kashdeya.tinyprogressions.inits.ModTileEntityTypes;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.FarmlandWaterManager;
import net.minecraftforge.common.ticket.AABBTicket;

public class TileEntityGrowthBlock extends TileEntity implements ITickableTileEntity//ISidedInventory,
{
	
    private AABBTicket waterRegion;
    private int range;
    private int rangeY;
    private int growthLvl;
    
	public TileEntityGrowthBlock() {
		super(ModTileEntityTypes.GrowthCrystals.get());
	}
	
	public TileEntityGrowthBlock setStats(int level, int rangeX, int rangeY) {
        this.range = rangeX;
        this.rangeY = rangeY;
        this.growthLvl = level;
        return this;
	}

	@Override
	public void tick() {
		if (this.getLevel().isClientSide())
			return;
		if(this.waterRegion == null)
			makeWaterRegion(this.level, this.getBlockPos());
	}

	
	@Override
	public void onChunkUnloaded() {
		super.onChunkUnloaded();
		if (this.getLevel().isClientSide())
			return;
		removeWaterRegion();
	}

	@Override
    public void onLoad()
    {
        super.onLoad();
    }
    
	@Override
	public void load(BlockState block, CompoundNBT nbt) {

		this.range = nbt.getInt("range");
		this.rangeY = nbt.getInt("rangeY");
		this.growthLvl = nbt.getInt("growthLvl");
		this.setStats(growthLvl, range, rangeY);
		super.load(block, nbt);
	}

	@Override
	public CompoundNBT save(CompoundNBT nbt) {
		nbt.putInt("range", range);
		nbt.putInt("rangeY", rangeY);
		nbt.putInt("growthLvl", growthLvl);
		super.save(nbt);
		return nbt;
	}
	
    private void makeWaterRegion(World worldIn, BlockPos pos) {
    	if(worldIn.isClientSide()) return;
    	if(this.growthLvl <= 1) return;
        if (FarmlandWaterManager.hasBlockWaterTicket(worldIn, pos)) return; 
       	waterRegion = FarmlandWaterManager.addAABBTicket(worldIn, new AxisAlignedBB(pos).inflate(this.range, this.rangeY, this.range));//.offset(-range, -range, -range));
        this.setChanged();
    }

    public void removeWaterRegion() {
        if (waterRegion != null)
            waterRegion.invalidate();
    }

}