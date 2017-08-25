package com.kashdeya.tinyprogressions.properties;

import net.minecraft.util.IStringSerializable;

public enum EnumGlowstoneColor implements IStringSerializable
{
	WHITE(0, "white_glowstone"),
    ORANGE(1, "orange_glowstone"),
    MAGENTA(2, "magenta_glowstone"),
    LIGHT_BLUE(3, "lightblue_glowstone"),
    LIME(4, "lime_glowstone"),
    PINK(5, "pink_glowstone"),
    GRAY(6, "gray_glowstone"),
    SILVER(7, "silver_glowstone"),
    CYAN(8, "cyan_glowstone"),
    PURPLE(9, "purple_glowstone"),
    BLUE(10, "blue_glowstone"),
    BROWN(11, "brown_glowstone"),
    GREEN(12, "green_glowstone"),
    RED(13, "red_glowstone"),
    BLACK(14, "black_glowstone");
	
	private int metadata;
	private String name;
	
	EnumGlowstoneColor(int metadata, String name)
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
		String[] names = new String[EnumGlowstoneColor.values().length];
		
		for(int i = 0; i < names.length; i++)
			names[i] = EnumGlowstoneColor.values()[i].getName();
		
		return names;
	}
}
