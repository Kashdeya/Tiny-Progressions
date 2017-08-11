package com.kashdeya.tinyprogressions.items;

import com.kashdeya.tinyprogressions.capabilities.SingleStackHandlerBase;
import com.kashdeya.tinyprogressions.handlers.StorageHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.EmptyHandler;

public class HoldingBag extends Item
{
    public HoldingBag()
    {
        setMaxStackSize(1);
    }
    
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt)
    {
        return new HoldingBagItemHandler(stack);
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
    {
        if(!world.isRemote)
            player.openGui(TinyProgressions.instance, 0, world, 0, 0, 0);
        
        return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }
    
    public class HoldingBagItemHandler implements ICapabilityProvider, IItemHandler
    {
        private final ItemStack containerItem;
        
        public HoldingBagItemHandler(ItemStack containerItem)
        {
            if(!containerItem.hasTagCompound())
                containerItem.setTagCompound(new NBTTagCompound());
            
            this.containerItem = containerItem;
        }
        
        @Override
        public int getSlots()
        {
            return 54;
        }
        
        public IItemHandler getSlotHandler(final int slot)
        {
            if(slot < 0 || slot >= getSlots())
                return EmptyHandler.INSTANCE;
            
            return new SingleStackHandlerBase() {
                @Override
                public ItemStack getStack()
                {
                    NBTTagCompound compound = HoldingBag.HoldingBagItemHandler.this.containerItem.getTagCompound();
                    if(compound == null)
                        compound = new NBTTagCompound();
                    
                    NBTTagCompound items = compound.getCompoundTag("Inventory");
                    if(items == null)
                        items = new NBTTagCompound();
                    
                    String key = getSlotKey();
                    
                    if(items.hasKey(key, 7))
                    {
                        ItemStack itemstack = StorageHandler.loadData(items.getByteArray(key));
                        
                        if(itemstack == null || itemstack.isEmpty())
                        {
                            items.removeTag(key);
                            itemstack = null;
                        }
                        
                        return itemstack;
                    }
                    
                    if(items.hasKey(key, 10))
                    {
                        ItemStack itemstack = new ItemStack(items.getCompoundTag(key));
                        
                        if(itemstack == null || itemstack.isEmpty())
                            items.removeTag(key);
                        else
                            items.setByteArray(key, StorageHandler.storeData(itemstack));
                        
                        return itemstack;
                    }
                    
                    return ItemStack.EMPTY;
                }
                
                @Override
                public void setStack(ItemStack itemstack)
                {
                    NBTTagCompound compound = HoldingBag.HoldingBagItemHandler.this.containerItem.getTagCompound();
                    if(compound == null)
                        compound = new NBTTagCompound();
                    
                    NBTTagCompound items = compound.getCompoundTag("Inventory");
                    if(items == null)
                        items = new NBTTagCompound();
                    
                    String key = getSlotKey();
                    
                    if(itemstack == null || itemstack.isEmpty())
                        items.removeTag(key);
                    else
                        items.setByteArray(key, StorageHandler.storeData(itemstack));
                }
                
                @Override
                protected int getStackLimit(ItemStack itemstack)
                {
                    if(itemstack.getItem() == HoldingBag.this)
                        return 0;
                    
                    if(itemstack.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null))
                        return 0;
                    
                    return super.getStackLimit(itemstack);
                }
                
                @Override
                public String getSlotKey()
                {
                    return "HoldingBag_Slot_" + slot;
                }
            };
        }
        
        @Override
        public int getSlotLimit(int slot)
        {
            return getSlotHandler(slot).getSlotLimit(slot);
        }
        
        @Override
        public ItemStack getStackInSlot(int slot)
        {
            return getSlotHandler(slot).getStackInSlot(slot);
        }
        
        @Override
        public ItemStack insertItem(int slot, ItemStack stack, boolean simulate)
        {
            return getSlotHandler(slot).insertItem(slot, stack, simulate);
        }
        
        @Override
        public ItemStack extractItem(int slot, int amount, boolean simulate)
        {
            return getSlotHandler(slot).extractItem(slot, amount, simulate);
        }
        
        @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing)
        {
            return facing == null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
        }
        
        @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing)
        {
            return hasCapability(capability, facing) ? (T)this : null;
        }
    }
}
