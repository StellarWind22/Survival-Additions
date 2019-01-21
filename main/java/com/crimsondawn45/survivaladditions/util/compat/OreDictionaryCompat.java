package com.crimsondawn45.survivaladditions.util.compat;

import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	public static void init() {
		//Some Basic Compatability
		OreDictionary.registerOre("flint", ModItems.SHARPENED_FLINT);
		OreDictionary.registerOre("bone", ModItems.SHARPENED_BONE);
		OreDictionary.registerOre("chain", ModItems.CHAIN);
		
		//Register Items As An Adhesive For Crude Tools
		OreDictionary.registerOre("csam_adhesive", Items.STRING);
		OreDictionary.registerOre("csam_adhesive", Items.SLIME_BALL);
		OreDictionary.registerOre("csam_adhesive", Items.MAGMA_CREAM);
		
		//Register Items As An Handle For Crude Tools
		OreDictionary.registerOre("csam_handle", Items.STICK);
		OreDictionary.registerOre("csam_handle", Items.BLAZE_ROD);
		
		//Register Item As A Water Source
		OreDictionary.registerOre("csam_water_source", Item.getItemFromBlock(Blocks.CACTUS));
		
		//Register Item As A Cold Water Source
		OreDictionary.registerOre("csam_cold_water_source", Item.getItemFromBlock(Blocks.ICE));
		OreDictionary.registerOre("csam_cold_water_source", Item.getItemFromBlock(Blocks.PACKED_ICE));
		OreDictionary.registerOre("csam_cold_water_source", Item.getItemFromBlock(Blocks.SNOW));
		OreDictionary.registerOre("csam_cold_water_source", Item.getItemFromBlock(ModBlocks.SNOW_BRICK));
		
		//Register Item As A Heat Source
		OreDictionary.registerOre("csam_heat_source", Item.getItemFromBlock(Blocks.TORCH));
		OreDictionary.registerOre("csam_heat_source", Items.GLOWSTONE_DUST);
		OreDictionary.registerOre("csam_heat_source", Items.BLAZE_POWDER);
	}
}
