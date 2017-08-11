package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.items.HoldingBag;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch(ID)
        {
        case 0:
            ItemStack heldItem = player.getHeldItemMainhand();
            
            if(heldItem == null || heldItem.isEmpty() || heldItem.getItem() != TechItems.holding_bag)
                return null;
            
            IItemHandler handler = (IItemHandler)heldItem.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
            if(handler == null || handler.getClass() != HoldingBag.HoldingBagItemHandler.class)
                return null;
            
            return new ContainerBagHolding(player, player.inventory.currentItem, (HoldingBag.HoldingBagItemHandler)handler, player.world.isRemote ? Side.CLIENT : Side.SERVER);
        default:
            return null;
        }
    }
    
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch(ID)
        {
        case 0:
            ItemStack heldItem = player.getHeldItemMainhand();
            
            if(heldItem == null || heldItem.isEmpty() || heldItem.getItem() != TechItems.holding_bag)
                return null;
            
            IItemHandler handler = (IItemHandler)heldItem.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
            if(handler == null || handler.getClass() != HoldingBag.HoldingBagItemHandler.class)
                return null;
            
            return new GuiBagHolding(new ContainerBagHolding(player, player.inventory.currentItem, (HoldingBag.HoldingBagItemHandler)handler, player.world.isRemote ? Side.CLIENT : Side.SERVER));
        default:
            return null;
        }
    }
}
