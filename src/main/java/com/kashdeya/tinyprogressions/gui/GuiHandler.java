package com.kashdeya.tinyprogressions.gui;

import com.kashdeya.tinyprogressions.capabilities.InventoryStorage;
import com.kashdeya.tinyprogressions.container.OreDoublerContainer;
import com.kashdeya.tinyprogressions.container.PouchContainer;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.tiles.TileEntityOreDoubler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.items.CapabilityItemHandler;

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
     
            InventoryStorage storage = (InventoryStorage) item.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
     
            if(storage == null)
                return null;
     
            return new PouchContainer(storage, player);
        case 1:
        	return new OreDoublerContainer(player.inventory, (TileEntityOreDoubler)world.getTileEntity(new BlockPos(x, y, z)), player);
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
             
            if(item.isEmpty())
                return null;
     
            if(item.getItem() != TechItems.pouch)
                return null;
     
            InventoryStorage storage = (InventoryStorage) item.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
     
            if(storage == null)
                return null;
     
            return new PouchGui(storage, player);
        case 1:
        	return new OreDoublerGUI(player.inventory, (TileEntityOreDoubler)world.getTileEntity(new BlockPos(x, y, z)));
        default:
            return null;
        }
    }
}
