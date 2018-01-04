package com.kashdeya.tinyprogressions.properties;

import net.minecraft.util.IStringSerializable;

import java.util.Arrays;

public enum EnumDustColor implements IStringSerializable
{
	WHITE(0, "white_dust", "dustWhiteGlowstone", "dyeWhite"),
    ORANGE(1, "orange_dust", "dustOrangeGlowstone", "dyeOrange"),
    MAGENTA(2, "magenta_dust", "dustMagentaGlowstone", "dyeMagenta"),
    LIGHT_BLUE(3, "lightblue_dust", "dustLightBlueGlowstone", "dyeLightBlue"),
    LIME(4, "lime_dust", "dustLimeGlowstone", "dyeLime"),
    PINK(5, "pink_dust", "dustPinkGlowstone", "dyePink"),
    GRAY(6, "gray_dust", "dustGrayGlowstone", "dyeGray"),
    SILVER(7, "silver_dust", "dustLightGrayGlowstone", "dyeLightGray"),
    CYAN(8, "cyan_dust", "dustCyanGlowstone", "dyeCyan"),
    PURPLE(9, "purple_dust", "dustPurpleGlowstone", "dyePurple"),
    BLUE(10, "blue_dust", "dustBlueGlowstone", "dyeBlue"),
    BROWN(11, "brown_dust", "dustBrownGlowstone", "dyeBrown"),
    GREEN(12, "green_dust", "dustGreenGlowstone", "dyeGreen"),
    RED(13, "red_dust", "dustRedGlowstone", "dyeRed"),
    BLACK(14, "black_dust", "dustBlackGlowstone", "dyeBlack");
	
	private int metadata;
	private String name;
	private String oredict;
	private String craftingOredict;
	
	EnumDustColor(int metadata, String name, String oredict, String craftingOredict)
	{
		this.metadata = metadata;
		this.name = name;
		this.oredict = oredict;
		this.craftingOredict = craftingOredict;
	}
	
	public int getMetadata()
	{
		return metadata;
	}
	
	public String getOredict()
	{
		return oredict;
	}
	
	public String getCraftingOredict()
	{
		return craftingOredict;
	}

	@Override
	public String getName()
	{
		return name;
	}
	
	public static String[] getNames()
	{
		return Arrays.stream(EnumDustColor.values()).map(EnumDustColor::getName).toArray(String[]::new);
	}
}
