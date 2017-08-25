package com.kashdeya.tinyprogressions.properties;

import net.minecraft.util.IStringSerializable;

public enum EnumLampColor implements IStringSerializable
{
	WHITE(0, "white_lamp"),
    ORANGE(1, "orange_lamp"),
    MAGENTA(2, "magenta_lamp"),
    LIGHT_BLUE(3, "lightblue_lamp"),
    YELLOW(4, "yellow_lamp"),
    LIME(5, "lime_lamp"),
    PINK(6, "pink_lamp"),
    GRAY(7, "gray_lamp"),
    SILVER(8, "silver_lamp"),
    CYAN(9, "cyan_lamp"),
    PURPLE(10, "purple_lamp"),
    BLUE(11, "blue_lamp"),
    BROWN(12, "brown_lamp"),
    GREEN(13, "green_lamp"),
    RED(14, "red_lamp"),
    BLACK(15, "black_lamp");
	
	private int metadata;
	private String name;
	
	EnumLampColor(int metadata, String name)
	{
		this.metadata = metadata;
		this.name = name;
	}
	
	public int getMetadata()
	{
		return metadata;
	}

	@Override
	public String getName()
	{
		return name;
	}
	
	public static String[] getNames()
	{
		String[] names = new String[EnumLampColor.values().length];
		
		for(int i = 0; i < names.length; i++)
			names[i] = EnumLampColor.values()[i].getName();
		
		return names;
	}
}
