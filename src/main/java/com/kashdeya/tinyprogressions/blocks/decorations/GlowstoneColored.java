package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.blocks.StandardBlock;

public class GlowstoneColored extends StandardBlock
{
//	public static final PropertyEnum<EnumGlowstoneColor> COLOR = PropertyEnum.create("color", EnumGlowstoneColor.class);
	
	public GlowstoneColored(Properties prop)
	{
		super(prop
				.hardnessAndResistance(0.3F)
				.lightValue(15));
	}
	
}
