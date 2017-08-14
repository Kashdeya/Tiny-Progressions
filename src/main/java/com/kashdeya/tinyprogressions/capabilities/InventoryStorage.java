package com.kashdeya.tinyprogressions.capabilities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.items.ItemStackHandler;

public class InventoryStorage extends ItemStackHandler
{
	   private final String name;
	    
	    public InventoryStorage(int inventorySize)
	    {
	        this("", inventorySize);
	    }
	 
	    public InventoryStorage(String name, int inventorySize)
	    {
	        super(inventorySize);
	        this.name = name;
	    }
	 
	    public String getName()
	    {
	        return name;
	    }
	 
	    public boolean hasCustomName()
	    {
	        return name != null;
	    }
	 
	    public ITextComponent getDisplayName()
	    {
	        return new TextComponentTranslation(name);
	    }
	    
	    
	    public void writeToNBT(NBTTagCompound compound)
	    {
	    	compound.setTag("Inventory", serializeNBT());
        }
	     
	    public void readFromNBT(NBTTagCompound compound)
	    {
	    	deserializeNBT(compound.getCompoundTag("Inventory"));
	    }

}
