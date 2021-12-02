package com.kashdeya.tinyprogressions.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.network.PacketBuffer;

public class StorageUtil
{
    public static byte[] storeData(@Nullable ItemStack itemstack)
    {
        if(itemstack == null || itemstack.isEmpty())
            return new byte[0];
        
        CompoundNBT nbt = itemstack.save(new CompoundNBT());
        
        String id = nbt.getString("id");
        if(id.equals("minecraft:air"))
            return new byte[0];
        
        int count = nbt.getByte("Count");
        if(count == 0)
            return new byte[0];
        
        short damage = nbt.getShort("Damage");
        boolean vanilla = id.startsWith("minecraft:") && id.indexOf(':', "minecraft:".length()) < 0;
        
        CompoundNBT tag = nbt.hasUUID("tag") ? nbt.getCompound("tag") : null;
        CompoundNBT forgeCaps = nbt.hasUUID("ForgeCaps") ? nbt.getCompound("ForgeCaps") : null;
        
        byte type = 0;
        if(damage != 0)
            type = (byte)(type | 0x1);
        if(tag != null)
            type = (byte)(type | 0x2);
        if(forgeCaps != null)
            type = (byte)(type | 0x4);
        if(count == 1)
            type = (byte)(type | 0x8);
        if(count == 64)
            type = (byte)(type | 0x10);
        
        ByteBuf data = Unpooled.buffer();
        PacketBuffer buffer = new PacketBuffer(data);
        
        data.writeByte(type);

        buffer = vanilla ? writeSmallString(buffer, id.substring("minecraft:".length())) : writeSmallString(buffer, id);
        
        if(count != 1 && count != 64)
            buffer.writeByte(count);
        if(damage != 0)
            buffer.writeShort(damage);
        if(tag != null)
        {
            try
            {
                buffer = writeNBT(buffer, tag);
            }
            catch(IOException e)
            {
                return new byte[0];
            }
        }
        if(forgeCaps != null)
        {
            try
            {
                buffer = writeNBT(buffer, forgeCaps);
            }
            catch(IOException e)
            {
                return new byte[0];
            }
        }
        
        int readableBytes = data.readableBytes();
        byte[] b = new byte[readableBytes];
        data.readBytes(b);
        return b;
    }
    
    public static ItemStack loadData(@Nonnull byte[] bytes)
    {
        if(bytes.length == 0)
            return ItemStack.EMPTY;
        
        ByteBuf data = Unpooled.wrappedBuffer(bytes);
        PacketBuffer buffer = new PacketBuffer(data);
        
        byte type = buffer.readByte();
        String id = readSmallString(buffer);
        
        if(id.indexOf(':') < 0)
            id = "minecraft:" + id;
        
        byte count;
        if((type & 0x8) != 0)
            count = 1;
        else
        {
            count = (type & 0x10) != 0 ? 64 : buffer.readByte();
        }
        
        short damage;
        if((type & 0x1) != 0)
            damage = buffer.readShort();
        else
            damage = 0;
        
        CompoundNBT tags;
        if((type & 0x2) != 0)
        {
            try
            {
                tags = readNBTChecked(buffer);
            }
            catch(IOException e)
            {
                return ItemStack.EMPTY;
            }
        }
        else
            tags = null;
        
        CompoundNBT forgeCaps;
        if((type & 0x4) != 0)
        {
            try
            {
                forgeCaps = readNBTChecked(buffer);
            }
            catch(IOException e)
            {
                return ItemStack.EMPTY;
            }
        }
        else
            forgeCaps = null;
        
        if(buffer.readableBytes() > 0)
            return ItemStack.EMPTY;
        
        CompoundNBT finalTag = new CompoundNBT();
        finalTag.putString("id", id);
        finalTag.putByte("Count", count);
        finalTag.putShort("Damage", damage);
        
        if(tags != null)
            finalTag.put("tag", tags);
        if(forgeCaps != null)
            finalTag.put("ForgeCaps", forgeCaps);
        
        return ItemStack.of(finalTag);
    }
    
    private static PacketBuffer writeSmallString(PacketBuffer buffer, String string)
    {
        if(string == null)
            buffer.writeByte(0);
        else
        {
            byte[] stringData = string.getBytes(Charset.forName("UTF-8"));
            buffer.writeByte(stringData.length);
            buffer.writeBytes(stringData);
        }
        
        return buffer;
    }
    
    private static String readSmallString(PacketBuffer buffer)
    {
        short length = buffer.readUnsignedByte();
        
        if(length <= 0)
            return "";
        
        byte[] bytes = new byte[length];
        buffer.readBytes(bytes);
        
        return new String(bytes, Charset.forName("UTF-8"));
    }
    
    private static PacketBuffer writeNBT(PacketBuffer buffer, CompoundNBT nbt) throws IOException
    {
        if(nbt == null)
        {
            buffer.writeShort(0);
            return buffer;
        }
        
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        CompressedStreamTools.writeCompressed(nbt, output);
        byte[] compressed = output.toByteArray();
        buffer.writeShort(compressed.length);
        buffer.writeBytes(compressed);
           
        return buffer;
    }
    
    private static CompoundNBT readNBTChecked(PacketBuffer buffer) throws IOException
    {
        int length = buffer.readUnsignedShort();
        
        if(length <= 0)
            return null;
        
        byte[] bytes = new byte[length];
        buffer.readBytes(bytes);
        
        return CompressedStreamTools.readCompressed(new ByteArrayInputStream(bytes));
    }
}
