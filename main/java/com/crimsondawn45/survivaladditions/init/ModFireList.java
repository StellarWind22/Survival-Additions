package com.crimsondawn45.survivaladditions.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class ModFireList {

	public static void init() {
	
		//List Of Flammable Mod Blocks
		Blocks.FIRE.setFireInfo(ModBlocks.SCRAP_WOOD_PLANKS, 6, 25);
		Blocks.FIRE.setFireInfo(ModBlocks.SCRAP_WOOD_STAIRS, 6, 25);
		Blocks.FIRE.setFireInfo(ModBlocks.SCRAP_WOOD_HALF_SLAB, 6, 25);
		Blocks.FIRE.setFireInfo(ModBlocks.SCRAP_WOOD_DOUBLE_SLAB, 6, 25);
		
		//Making Things That Should Be Flammable Flammable
		//Decorative Blocks
		Blocks.FIRE.setFireInfo(Blocks.CHEST, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.CRAFTING_TABLE, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.LADDER, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.JUKEBOX, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.STANDING_SIGN, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.WALL_SIGN, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.BED, 30, 60);
		Blocks.FIRE.setFireInfo(Blocks.NOTEBLOCK, 5, 20);
		
		//Crops
		Blocks.FIRE.setFireInfo(Blocks.WHEAT, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.CARROTS, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.POTATOES, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.BEETROOTS, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.COCOA, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.CACTUS, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.REEDS, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.WATERLILY, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.PUMPKIN, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.PUMPKIN_STEM, 60, 100);
		Blocks.FIRE.setFireInfo(Blocks.MELON_BLOCK, 5, 20);
		Blocks.FIRE.setFireInfo(Blocks.MELON_STEM, 60, 100);
	}
}
