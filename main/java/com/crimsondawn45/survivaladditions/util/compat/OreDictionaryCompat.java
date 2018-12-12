package com.crimsondawn45.survivaladditions.util.compat;

import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	public static void init() {
		OreDictionary.registerOre("flint", ModItems.SHARPENED_FLINT);
		OreDictionary.registerOre("bone", ModItems.SHARPENED_BONE);
		OreDictionary.registerOre("chain", ModItems.CHAIN);
		
		//Register Items As An Adhesive For Crude Tools
		OreDictionary.registerOre("csam_adhesive", Items.STRING);
		OreDictionary.registerOre("csam_adhesive", Items.SLIME_BALL);
		OreDictionary.registerOre("csam_adhesive", Items.MAGMA_CREAM);
	}
}
