package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.capabilities.IStorage;
import com.kashdeya.tinyprogressions.container.PouchContainer;
import com.kashdeya.tinyprogressions.gui.PouchGui;
import com.kashdeya.tinyprogressions.inits.TechItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch(ID)
        {
        case 0:
            ItemStack item = player.getHeldItemMainhand();
     
            if(item == null)
                return null;
     
            if(item.getItem() != TechItems.pouch)
                return null;
     
            IStorage storage = item.getCapability(IStorage.INSTANCE, null);
     
            if(storage == null)
                return null;
     
            return new PouchContainer(storage, player);
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
            ItemStack item = player.getHeldItemMainhand();
             
            if(item == null)
                return null;
     
            if(item.getItem() != TechItems.pouch)
                return null;
     
            IStorage storage = item.getCapability(IStorage.INSTANCE, null);
     
            if(storage == null)
                return null;
     
            return new PouchGui(storage, player);
        default:
            return null;
        }
    }
}
