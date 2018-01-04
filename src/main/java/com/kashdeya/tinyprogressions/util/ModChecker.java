package com.kashdeya.tinyprogressions.util;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {
	
	public static boolean isTinkersConstructLoaded;
	
	public ModChecker() {
		isTinkersConstructLoaded = Loader.isModLoaded("tconstruct");
	}
}
