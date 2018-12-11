package com.crimsondawn45.survivaladditions.util.compat;

import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	public static void init() {
		OreDictionary.registerOre("flint", ModItems.SHARPENED_FLINT);
		OreDictionary.registerOre("bone", ModItems.SHARPENED_BONE);
		OreDictionary.registerOre("chain", ModItems.CHAIN);
		OreDictionary.registerOre("planks", ModBlocks.SCRAP_WOOD_PLANKS);
	}
}
