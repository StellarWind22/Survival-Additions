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
		GameRegistry.addSmelting(ModItems.CLAY_SWORD_HEAD, new ItemStack(ModItems.TERRACOTTA_SWORD_HEAD, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.CLAY_PICKAXE_HEAD, new ItemStack(ModItems.TERRACOTTA_PICKAXE_HEAD, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.CLAY_AXE_HEAD, new ItemStack(ModItems.TERRACOTTA_AXE_HEAD, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.CLAY_HOE_HEAD, new ItemStack(ModItems.TERRACOTTA_HOE_HEAD, 1), 0.3F);
		GameRegistry.addSmelting(ModItems.CLAY_SHOVEL_HEAD, new ItemStack(ModItems.TERRACOTTA_SHOVEL_HEAD, 1), 0.3F);
		
		//Mud Brick
		GameRegistry.addSmelting(ModBlocks.MUD_BRICK_WET, new ItemStack(ModBlocks.MUD_BRICK, 1), 0.1F);
	}
}
