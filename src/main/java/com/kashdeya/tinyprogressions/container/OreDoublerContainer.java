package com.kashdeya.tinyprogressions.container;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;
import com.kashdeya.tinyprogressions.tiles.TileEntityOreDoubler;

import javafx.geometry.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;

public class OreDoublerContainer extends BasicContainer{


	private final InventoryStorage inputInventory;
	private final InventoryStorage outputInventory;
	private final InventoryStorage fuelInventory;
	
	private final TileEntityOreDoubler oredoubler;
	
    private int cookTime;
    private int totalCookTime;
    private int furnaceBurnTime;
    private int currentItemBurnTime;

	public OreDoublerContainer(InventoryPlayer playerInventory,	TileEntityOreDoubler tile, EntityPlayer player) 
	{
		inputInventory = (InventoryStorage) tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.UP);
		
		outputInventory = (InventoryStorage) tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.DOWN);

		fuelInventory = (InventoryStorage) tile.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, EnumFacing.EAST);

		addInventories(inputInventory, fuelInventory, outputInventory);  
		
		oredoubler = tile;
		
		addSlotToContainer(new InvStorageSlot(inputInventory, 0, 56, 17) { @Override public boolean canTakeStack(EntityPlayer playerIn) { return true; } });
		
		addSlotToContainer(new InvStorageSlot(fuelInventory, 0, 56, 53) { @Override public boolean canTakeStack(EntityPlayer playerIn) { return true; } });
		
		addSlotToContainer(new InvStorageSlot(outputInventory, 0, 106, 25));
		
		addSlotToContainer(new InvStorageSlot(outputInventory, 1, 125, 25));
		
		addSlotToContainer(new InvStorageSlot(outputInventory, 2, 106, 44));
		
		addSlotToContainer(new InvStorageSlot(outputInventory, 3, 125, 44));
		     
		bindPlayerInventory(playerInventory);          
	}
	

	@Override
	public void addListener(IContainerListener listener) {
		if (this.listeners.contains(listener)) {
			throw new IllegalArgumentException("Listener already listening");
		} else {
			this.listeners.add(listener);
			listener.sendAllContents(this, this.getInventory());
			this.detectAndSendChanges();
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void updateProgressBar(int id, int value) {
		this.oredoubler.setField(id, value);
	}

	public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener icontainerlistener = this.listeners.get(i);

            if (this.cookTime != this.oredoubler.getField(2))
            {
                icontainerlistener.sendWindowProperty(this, 2, this.oredoubler.getField(2));
            }

            if (this.furnaceBurnTime != this.oredoubler.getField(0))
            {
                icontainerlistener.sendWindowProperty(this, 0, this.oredoubler.getField(0));
            }

            if (this.currentItemBurnTime != this.oredoubler.getField(1))
            {
                icontainerlistener.sendWindowProperty(this, 1, this.oredoubler.getField(1));
            }

            if (this.totalCookTime != this.oredoubler.getField(3))
            {
                icontainerlistener.sendWindowProperty(this, 3, this.oredoubler.getField(3));
            }
        }

        this.cookTime = this.oredoubler.getField(2);
        this.furnaceBurnTime = this.oredoubler.getField(0);
        this.currentItemBurnTime = this.oredoubler.getField(1);
        this.totalCookTime = this.oredoubler.getField(3);
    }
	
	
}
