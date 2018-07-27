package com.crimsondawn45.survivaladditions.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {

	public static void init() {
		GameRegistry.addSmelting(ModItems.CHAIN, new ItemStack(Items.IRON_NUGGET, 1), 0.3F);
		GameRegistry.addSmelting(Blocks.IRON_BARS, new ItemStack(Items.IRON_NUGGET, 1), 0.3F);
		GameRegistry.addSmelting(Blocks.HOPPER, new ItemStack(Items.IRON_INGOT, 1), 0.3F);
		
		//Wet Clay
		GameRegistry.addSmelting(ModItems.WET_CLAY_AXE, new ItemStack(ModItems.CLAY_AXE, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.WET_CLAY_SWORD, new ItemStack(ModItems.CLAY_SWORD, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.WET_CLAY_PICKAXE, new ItemStack(ModItems.CLAY_PICKAXE, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.WET_CLAY_SHOVEL, new ItemStack(ModItems.CLAY_SHOVEL, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.WET_CLAY_HOE, new ItemStack(ModItems.CLAY_HOE, 1), 0.3F);
		
		//Mud Brick
		GameRegistry.addSmelting(ModBlocks.MUD_BRICK_WET, new ItemStack(ModBlocks.MUD_BRICK, 1), 0.1F);
	}
}
