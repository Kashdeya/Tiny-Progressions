package com.kashdeya.tinyprogressions.tiles;

import com.kashdeya.tinyprogressions.blocks.oredoubler.OreDoublerBlock;
import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;
import com.kashdeya.tinyprogressions.inits.TechBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;

public class TileEntityOreDoubler extends TileEntity implements  ITickable{
    
	
    /** The number of ticks that the furnace will keep burning */
    private int furnaceBurnTime;
    /** The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for */
    private int currentItemBurnTime;
    private int cookTime;
    private int totalCookTime;
    private String furnaceCustomName;
    
    private int cookSpeed = 200;
    
    
    public TileEntityOreDoubler setCookSpeed(int ticksIn) {
    	this.cookSpeed = ticksIn;
    	return this;
    }
    
    public InventoryStorage inputInventory = new InventoryStorage(1) {
	    @Override
	    public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
	    	totalCookTime = getCookTime(inputInventory.getStackInSlot(0));
	    	return super.insertItem(slot, stack, simulate);
	    }
    	@Override
    	public boolean canExtractSlot(int slot) { return false;	}
    	@Override
	    public void writeToNBT(NBTTagCompound compound)  { 	compound.setTag("inputInventory", serializeNBT());    }
    	@Override 
	    public void readFromNBT(NBTTagCompound compound) { 	deserializeNBT(compound.getCompoundTag("inputInventory"));  }
    };
    
    public InventoryStorage outputInventory = new InventoryStorage(4) {
    	@Override
		public boolean canInsertSlot(int slot, ItemStack stack) { return false; }
    	@Override
	    public void writeToNBT(NBTTagCompound compound)  { 	compound.setTag("outputInventory", serializeNBT());    }
    	@Override 
	    public void readFromNBT(NBTTagCompound compound) { 	deserializeNBT(compound.getCompoundTag("outputInventory"));  }
    };
    
    public InventoryStorage fuelInventory = new InventoryStorage(1) {
    	@Override
		public boolean canInsertSlot(int slot, ItemStack stack) { 		
    		if(TileEntityFurnace.isItemFuel(stack)) return true;
    		else return false;
		}
    	@Override
    	public boolean canExtractSlot(int slot) { return false;	}
    	@Override
	    public void writeToNBT(NBTTagCompound compound)  { 	compound.setTag("fuelInventory", serializeNBT());    }
    	@Override 
	    public void readFromNBT(NBTTagCompound compound) { 	deserializeNBT(compound.getCompoundTag("fuelInventory"));  }
    };
	
	@Override
	public void update() {
		
	      boolean flag = this.isBurning();
	        boolean flag1 = false;

	        if (this.isBurning())
	        {
	            --this.furnaceBurnTime;
	        }

	        if (!this.world.isRemote)
	        {
	            ItemStack itemstackFuelSlot = this.fuelInventory.getStackInSlot(0);

	            if (this.isBurning() || !itemstackFuelSlot.isEmpty() && !((ItemStack)this.inputInventory.getStackInSlot(0)).isEmpty())
	            {
	                if (!this.isBurning() && this.canSmelt())
	                {
	                    this.furnaceBurnTime = TileEntityFurnace.getItemBurnTime(itemstackFuelSlot);
	                    this.currentItemBurnTime = this.furnaceBurnTime;

	                    if (this.isBurning())
	                    {
	                        flag1 = true;

	                        if (!itemstackFuelSlot.isEmpty())
	                        {
	                            Item item = itemstackFuelSlot.getItem();
	                            itemstackFuelSlot.shrink(1);

	                            if (itemstackFuelSlot.isEmpty())
	                            {
	                                ItemStack item1 = item.getContainerItem(itemstackFuelSlot);
	                                this.fuelInventory.setStackInSlot(0, item1);
	                            }
	                        }
	                    }
	                }

	                if (this.isBurning() && this.canSmelt())
	                {
	                    ++this.cookTime;
	                    if (this.cookTime == this.getCookTime(this.inputInventory.getStackInSlot(0)))
	                    {
	                        this.cookTime = 0;
	                        this.totalCookTime = this.getCookTime(this.inputInventory.getStackInSlot(0));
	                        this.smeltItem();
	                        flag1 = true;
	                    }
	                }
	                else
	                {
	                    this.cookTime = 0;
	                }
	            }
	            else if (!this.isBurning() && this.cookTime > 0)
	            {
	                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
	            }

	            if (flag != this.isBurning())
	            {
	                flag1 = true;
	                OreDoublerBlock.setBurning( this.world, this.pos, this.isBurning());
	            }
	        }

	        if (flag1)
	        {
	            this.markDirty();
	        }	
	}
	
	
    /**
     * Furnace isBurning
     */
    public boolean isBurning()
    {
        return this.furnaceBurnTime > 0;
    }

    
	private boolean canSmelt()
    {
        if (this.inputInventory.getStackInSlot(0).isEmpty()){
            return false;
        }
        else
        {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.inputInventory.getStackInSlot(0));
            if (itemstack.isEmpty()) {
                return false;
            }
            else {
            	ItemStack itemstack1 = itemstack.copy();
            	
            	for(int outputSlot = 0; outputSlot < outputInventory.getSlots(); outputSlot++) {
            		itemstack1 = this.outputInventory.insertItemInternal(outputSlot, itemstack1, true);
            		if(itemstack1.isEmpty()) {
            			return true;
            		}
            	}
               	return false;
            }
        }
    }
	
	/**
     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt())
        {
            ItemStack itemstackInput = this.inputInventory.getStackInSlot(0);
            ItemStack itemstackResult = FurnaceRecipes.instance().getSmeltingResult(itemstackInput);

            for(int outputSlot = 0; outputSlot < outputInventory.getSlots(); outputSlot++) {
            	if(itemstackResult.isEmpty())
            		break;
                if (itemstackInput.getItem() == Item.getItemFromBlock(Blocks.SPONGE) && itemstackInput.getMetadata() == 1 && !((ItemStack)this.fuelInventory.getStackInSlot(0)).isEmpty() && ((ItemStack)this.fuelInventory.getStackInSlot(0)).getItem() == Items.BUCKET)
                {
                    this.fuelInventory.setStackInSlot(0, new ItemStack(Items.WATER_BUCKET));
                }
                else
                	itemstackResult = this.outputInventory.insertItemInternal(outputSlot, itemstackResult.copy(), false);
           	}
        	
            itemstackInput.shrink(1);
        }
    }
    
    

    public int getCookTime(ItemStack stack)
    {
        return this.cookSpeed;
    }
	
	
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.inputInventory.readFromNBT(compound);
        this.outputInventory.readFromNBT(compound);
        this.fuelInventory.readFromNBT(compound);
        this.furnaceBurnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        this.totalCookTime = compound.getInteger("CookTimeTotal");
        this.currentItemBurnTime = TileEntityFurnace.getItemBurnTime(this.fuelInventory.getStackInSlot(0));
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setInteger("BurnTime", (short)this.furnaceBurnTime);
        compound.setInteger("CookTime", (short)this.cookTime);
        compound.setInteger("CookTimeTotal", (short)this.totalCookTime);
        this.inputInventory.writeToNBT(compound);
        this.outputInventory.writeToNBT(compound);
        this.fuelInventory.writeToNBT(compound);
        return compound;
    }
    
    
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
	{
		if(oldState.getBlock() == TechBlocks.ore_doubler_block && newSate.getBlock() == TechBlocks.ore_doubler_block){
			return false;
		}
		else 
			return oldState != newSate;
	}
		
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing)
	{
		return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY || super.hasCapability(capability, facing);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing)
	{
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && facing == EnumFacing.UP) 
			return (T) this.inputInventory;
		else if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && (facing == EnumFacing.EAST || facing == EnumFacing.WEST || facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)) 
			return (T) this.fuelInventory;
		else if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && facing == EnumFacing.DOWN) 
			return (T) this.outputInventory;
		
	        return super.getCapability(capability, facing);
	}


    public int getField(int id)
    {
        switch (id)
        {
            case 0:
                return this.furnaceBurnTime;
            case 1:
                return this.currentItemBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch (id)
        {
            case 0:
                this.furnaceBurnTime = value;
                break;
            case 1:
                this.currentItemBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
        }
    }


	public static boolean isBurning(TileEntityOreDoubler oredoubler) {
		return oredoubler.isBurning();
	}

}
