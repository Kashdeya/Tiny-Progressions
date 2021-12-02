package com.kashdeya.tinyprogressions.blocks.properties;

import net.minecraft.util.IStringSerializable;

enum BlockColorEnum implements IStringSerializable {

	None("none"),
	White("white"),
	Orange("orange"),
	Magenta("magenta"),
	LightBlue("lightblue"),
	Yellow("yellow"),
	Lime("lime"),
	Pink("pink"),
	Gray("gray"),
	Silver("silver"),
	Cyan("cyan"),
	Purple("purple"),
	Blue("blue"),
	Brown("brown"),
	Green("green"),
	Red("red"),
	Black("black");



	private final String name;

   private BlockColorEnum(String name) {
      this.name = name;
   }

   public String toString() {
      return this.getName();
   }

   public String getName() {
      return this.name;
   }

	@Override
	public String getSerializedName() {
		return "block-color-enum";
	}
}