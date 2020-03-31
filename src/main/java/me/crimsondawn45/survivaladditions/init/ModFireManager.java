package me.crimsondawn45.survivaladditions.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;

public class ModFireManager {

	//Enum For Simplifying flammability stuff
	public enum FT {
		LOG,
		PLANKS,
		PLANT,
		CLOTH,
		WORKSTATION
	}
	
	
	//Set all the fire information here
	public static void init() {
		
		//Modded
		setFireInfo(ModBlocks.scrap_planks, FT.PLANKS);
		setFireInfo(ModBlocks.scrap_stairs, FT.PLANKS);
		setFireInfo(ModBlocks.scrap_slab, FT.PLANKS);
		
		//Vanilla
		setFireInfo(Blocks.CRAFTING_TABLE, FT.WORKSTATION);
		setFireInfo(Blocks.CHEST, FT.LOG);
		setFireInfo(Blocks.TRAPPED_CHEST, FT.LOG);
		setFireInfo(Blocks.JUKEBOX, FT.WORKSTATION);
		setFireInfo(Blocks.NOTE_BLOCK, FT.WORKSTATION);
		setFireInfo(Blocks.BARREL, FT.WORKSTATION);
		setFireInfo(Blocks.LOOM, FT.WORKSTATION);
		setFireInfo(Blocks.LECTERN, FT.WORKSTATION);
		setFireInfo(Blocks.FLETCHING_TABLE, FT.WORKSTATION);
		setFireInfo(Blocks.CARTOGRAPHY_TABLE, FT.WORKSTATION);
		
		setFireInfo(Blocks.LADDER, FT.PLANKS);
		setFireInfo(Blocks.OAK_SIGN, FT.PLANKS);
		setFireInfo(Blocks.SPRUCE_SIGN, FT.PLANKS);
		setFireInfo(Blocks.BIRCH_SIGN, FT.PLANKS);
		setFireInfo(Blocks.JUNGLE_SIGN, FT.PLANKS);
		setFireInfo(Blocks.DARK_OAK_SIGN, FT.PLANKS);
		setFireInfo(Blocks.ACACIA_SIGN, FT.PLANKS);
		
		setFireInfo(Blocks.OAK_PRESSURE_PLATE, FT.PLANKS);
		setFireInfo(Blocks.SPRUCE_PRESSURE_PLATE, FT.PLANKS);
		setFireInfo(Blocks.BIRCH_PRESSURE_PLATE, FT.PLANKS);
		setFireInfo(Blocks.JUNGLE_PRESSURE_PLATE, FT.PLANKS);
		setFireInfo(Blocks.DARK_OAK_PRESSURE_PLATE, FT.PLANKS);
		setFireInfo(Blocks.ACACIA_PRESSURE_PLATE, FT.PLANKS);
		
		setFireInfo(Blocks.OAK_BUTTON, FT.PLANKS);
		setFireInfo(Blocks.SPRUCE_BUTTON, FT.PLANKS);
		setFireInfo(Blocks.BIRCH_BUTTON, FT.PLANKS);
		setFireInfo(Blocks.JUNGLE_BUTTON, FT.PLANKS);
		setFireInfo(Blocks.DARK_OAK_BUTTON, FT.PLANKS);
		setFireInfo(Blocks.ACACIA_BUTTON, FT.PLANKS);
		
		setFireInfo(Blocks.OAK_TRAPDOOR, FT.LOG);
		setFireInfo(Blocks.SPRUCE_TRAPDOOR, FT.LOG);
		setFireInfo(Blocks.BIRCH_TRAPDOOR, FT.LOG);
		setFireInfo(Blocks.JUNGLE_TRAPDOOR, FT.LOG);
		setFireInfo(Blocks.DARK_OAK_TRAPDOOR, FT.LOG);
		setFireInfo(Blocks.ACACIA_TRAPDOOR, FT.LOG);
		
		setFireInfo(Blocks.OAK_DOOR, FT.LOG);
		setFireInfo(Blocks.SPRUCE_DOOR, FT.LOG);
		setFireInfo(Blocks.BIRCH_DOOR, FT.LOG);
		setFireInfo(Blocks.JUNGLE_DOOR, FT.LOG);
		setFireInfo(Blocks.DARK_OAK_DOOR, FT.LOG);
		setFireInfo(Blocks.ACACIA_DOOR, FT.LOG);
		
		setFireInfo(Blocks.WHITE_BANNER, FT.CLOTH);
		setFireInfo(Blocks.ORANGE_BANNER, FT.CLOTH);
		setFireInfo(Blocks.MAGENTA_BANNER, FT.CLOTH);
		setFireInfo(Blocks.LIGHT_BLUE_BANNER, FT.CLOTH);
		setFireInfo(Blocks.YELLOW_BANNER, FT.CLOTH);
		setFireInfo(Blocks.LIME_BANNER, FT.CLOTH);
		setFireInfo(Blocks.PINK_BANNER, FT.CLOTH);
		setFireInfo(Blocks.GRAY_BANNER, FT.CLOTH);
		setFireInfo(Blocks.LIGHT_GRAY_BANNER, FT.CLOTH);
		setFireInfo(Blocks.CYAN_BANNER, FT.CLOTH);
		setFireInfo(Blocks.PURPLE_BANNER, FT.CLOTH);
		setFireInfo(Blocks.BLUE_BANNER, FT.CLOTH);
		setFireInfo(Blocks.BROWN_BANNER, FT.CLOTH);
		setFireInfo(Blocks.GREEN_BANNER, FT.CLOTH);
		setFireInfo(Blocks.RED_BANNER, FT.CLOTH);
		setFireInfo(Blocks.BLACK_BANNER, FT.CLOTH);
		
		setFireInfo(Blocks.WHITE_BED, FT.LOG);
		setFireInfo(Blocks.ORANGE_BED, FT.LOG);
		setFireInfo(Blocks.MAGENTA_BED, FT.LOG);
		setFireInfo(Blocks.LIGHT_BLUE_BED, FT.LOG);
		setFireInfo(Blocks.YELLOW_BED, FT.LOG);
		setFireInfo(Blocks.LIME_BED, FT.LOG);
		setFireInfo(Blocks.PINK_BED, FT.LOG);
		setFireInfo(Blocks.GRAY_BED, FT.LOG);
		setFireInfo(Blocks.LIGHT_GRAY_BED, FT.LOG);
		setFireInfo(Blocks.CYAN_BED, FT.LOG);
		setFireInfo(Blocks.PURPLE_BED, FT.LOG);
		setFireInfo(Blocks.BLUE_BED, FT.LOG);
		setFireInfo(Blocks.BROWN_BED, FT.LOG);
		setFireInfo(Blocks.GREEN_BED, FT.LOG);
		setFireInfo(Blocks.RED_BED, FT.LOG);
		setFireInfo(Blocks.BLACK_BED, FT.LOG);
		
		setFireInfo(Blocks.CARROTS, FT.PLANT);
		setFireInfo(Blocks.POTATOES, FT.PLANT);
		setFireInfo(Blocks.BEETROOTS, FT.PLANT);
		setFireInfo(Blocks.WHEAT, FT.PLANT);
		setFireInfo(Blocks.SUGAR_CANE, FT.PLANT);
		setFireInfo(Blocks.CARROTS, FT.PLANT);
		setFireInfo(Blocks.PUMPKIN_STEM, FT.PLANT);
		setFireInfo(Blocks.ATTACHED_PUMPKIN_STEM, FT.PLANT);
		setFireInfo(Blocks.MELON_STEM, FT.PLANT);
		setFireInfo(Blocks.ATTACHED_MELON_STEM, FT.PLANT);
		
		setFireInfo(Blocks.PUMPKIN, FT.LOG);
		setFireInfo(Blocks.CARVED_PUMPKIN, FT.PLANKS);
		setFireInfo(Blocks.JACK_O_LANTERN, FT.PLANKS);
		setFireInfo(Blocks.MELON, FT.LOG);
	}
	
	
	
	//Fire Info method thingy
	public static void setFireInfo(Block block, FT FT) {
		FireBlock fireblock = (FireBlock)Blocks.FIRE;
		
		switch(FT) {
			
			case LOG:
				fireblock.setFireInfo(block, 5, 5);
				break;
				
			case WORKSTATION:
				fireblock.setFireInfo(block, 5, 10);
				break;
			
			case CLOTH:
				fireblock.setFireInfo(block, 30, 60);
				break;
				
			case PLANKS:
				fireblock.setFireInfo(block, 5, 20);
				break;
				
			case PLANT:
				fireblock.setFireInfo(block, 60, 100);
				break;
			
			default:
				return;
		}
	}
}
