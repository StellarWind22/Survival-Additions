package com.crimsondawn45.survivaladditions.init;

import java.util.ArrayList;
import java.util.List;

import com.crimsondawn45.survivaladditions.objects.blocks.BlockBase;
import com.crimsondawn45.survivaladditions.objects.blocks.StairsBase;
import com.crimsondawn45.survivaladditions.objects.blocks.WetMudBrick;
import com.crimsondawn45.survivaladditions.objects.blocks.slab.DoubleSlabBase;
import com.crimsondawn45.survivaladditions.objects.blocks.slab.HalfSlabBase;
import com.crimsondawn45.survivaladditions.objects.blocks.slab.SlabBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemSlab;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Scrap Wood
	public static final Block SCRAP_WOOD_PLANKS = new BlockBase("scrap_wood_planks", Material.WOOD, SoundType.WOOD, "axe", 0, 1.5F, 7.0F);
	public static final BlockStairs SCRAP_WOOD_STAIRS = new StairsBase("scrap_wood_stairs", Material.WOOD, SoundType.WOOD, "axe", 0, 1.5F, 7.0F, ModBlocks.SCRAP_WOOD_PLANKS.getDefaultState());
	
	public static final BlockSlab SCRAP_WOOD_HALF_SLAB = new HalfSlabBase("scrap_wood_slab", Material.WOOD, SoundType.WOOD, "axe", 0, 1.5F, 7.0F);
	public static final Block SCRAP_WOOD_DOUBLE_SLAB = new DoubleSlabBase("scrap_wood_double_slab", Material.WOOD, SoundType.WOOD, "axe", 0, 1.5F, 7.0F);
	
	//Mud Brick
	public static final Block MUD_BRICK_WET = new WetMudBrick("mud_brick_wet", Material.GROUND, SoundType.GROUND, "shovel", 0, 0.7F, 0.5F);
	public static final Block MUD_BRICK = new BlockBase("mud_brick", Material.ROCK, SoundType.STONE, "pickaxe", 0, 1.25F, 6.5F);
	public static final BlockStairs MUD_BRICK_STAIRS = new StairsBase("mud_brick_stairs", Material.ROCK, SoundType.STONE, "pickaxe", 0, 1.25F, 6.5F, ModBlocks.MUD_BRICK.getDefaultState());
	
	public static final BlockSlab MUD_BRICK_HALF_SLAB = new HalfSlabBase("mud_brick_slab", Material.ROCK, SoundType.STONE, "pickaxe", 0, 1.25F, 6.5F);
	public static final Block MUD_BRICK_DOUBLE_SLAB = new DoubleSlabBase("mud_brick_double_slab", Material.ROCK, SoundType.STONE, "pickaxe", 0, 1.25F, 6.5F);
	
}
