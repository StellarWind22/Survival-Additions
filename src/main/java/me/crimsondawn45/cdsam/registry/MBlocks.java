package me.crimsondawn45.cdsam.registry;

import me.crimsondawn45.cdsam.Main;
import me.crimsondawn45.cdsam.object.MPressurePlateBlock;
import me.crimsondawn45.cdsam.object.MStairsBlock;
import me.crimsondawn45.cdsam.object.MStoneButtonBlock;
import me.crimsondawn45.cdsam.object.MWoodenButtonBlock;
import me.crimsondawn45.cdsam.util.MBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

public class MBlocks {
	
	//Settings
		//Generic
	private static Item.Settings m_item_s = new Item.Settings().group(Main.BLOCK);
		//Scrap
	private static FabricBlockSettings m_scrap_block_s = FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
		//Mud Bricks
	private static FabricBlockSettings m_mud_block_s = FabricBlockSettings.of(MBlockMaterials.m_mud).strength(1.25F, 4.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES);
		//Sandstone
	public static FabricBlockSettings m_sandstone_block_s = FabricBlockSettings.of(MBlockMaterials.m_sandstone).strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES);
	public static FabricBlockSettings m_red_sandstone_block_s = FabricBlockSettings.of(MBlockMaterials.m_red_sandstone).strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES);
		//Granite
	public static FabricBlockSettings m_granite_block_s = FabricBlockSettings.copyOf(Blocks.GRANITE).breakByTool(FabricToolTags.PICKAXES);
		//Diorite
	public static FabricBlockSettings m_diorite_block_s = FabricBlockSettings.copyOf(Blocks.DIORITE).breakByTool(FabricToolTags.PICKAXES);
		//Andesite
	public static FabricBlockSettings m_andesite_block_s = FabricBlockSettings.copyOf(Blocks.ANDESITE).breakByTool(FabricToolTags.PICKAXES);
		//Obsidian
	private static FabricBlockSettings m_obsidian_block_s = FabricBlockSettings.copyOf(Blocks.OBSIDIAN).breakByTool(FabricToolTags.PICKAXES);
	private static FabricBlockSettings m_obsidian_block_s_glass = FabricBlockSettings.copyOf(m_obsidian_block_s).sounds(BlockSoundGroup.GLASS).nonOpaque();
	
	//Blocks
		//Scrap Planks
	public static MFlamBlock scrap_planks;
	public static MFlamBlock scrap_stairs;
	public static MFlamBlock scrap_slab;
	public static MFlamBlock scrap_fence;
	public static MFlamBlock scrap_fence_gate;
	public static MFlamBlock scrap_button;
	public static MFlamBlock scrap_pressure_plate;
	//public static MBlock scrap_sign;	TODO find a way to handle signs
	//public static MBlock scrap_door;
	//public static MBlock scrap_trapdoor;
		//Mud Bricks
	public static MBlock mud_bricks;
	public static MBlock mud_brick_stairs;
	public static MBlock mud_brick_slab;
	public static MBlock mud_brick_wall;
		//Sandstone
			//Blocks
	public static MBlock smooth_sandstone_bricks;
	public static MBlock smooth_sandstone_brick_stairs;
	public static MBlock smooth_sandstone_brick_slab;
	public static MBlock smooth_sandstone_brick_wall;
			//Buttons
	public static MBlock smooth_sandstone_button;
	public static MBlock smooth_sandstone_pressure_plate;
		//Red Sandstone
			//Blocks
	public static MBlock smooth_red_sandstone_bricks;
	public static MBlock smooth_red_sandstone_brick_stairs;
	public static MBlock smooth_red_sandstone_brick_slab;
	public static MBlock smooth_red_sandstone_brick_wall;
			//Buttons
	public static MBlock smooth_red_sandstone_button;
	public static MBlock smooth_red_sandstone_pressure_plate;
		//Granite
			//Blocks
	public static MBlock polished_granite_bricks;
	public static MBlock polished_granite_brick_stairs;
	public static MBlock polished_granite_brick_slab;
	public static MBlock polished_granite_brick_wall;
			//Buttons
	public static MBlock polished_granite_button;
	public static MBlock polished_granite_pressure_plate;
		//Diorite
			//Blocks
	public static MBlock polished_diorite_bricks;
	public static MBlock polished_diorite_brick_stairs;
	public static MBlock polished_diorite_brick_slab;
	public static MBlock polished_diorite_brick_wall;
			//Buttons
	public static MBlock polished_diorite_button;
	public static MBlock polished_diorite_pressure_plate;
		//Andesite
			//Blocks
	public static MBlock polished_andesite_bricks;
	public static MBlock polished_andesite_brick_stairs;
	public static MBlock polished_andesite_brick_slab;
	public static MBlock polished_andesite_brick_wall;
			//Buttons
	public static MBlock polished_andesite_button;
	public static MBlock polished_andesite_pressure_plate;
		//Obsidian
			//Glass
	public static MBlock obsidian_glass;
	public static MBlock obsidian_glass_pane;
			//Obsidian
	public static MBlock obsidian_stairs;
	public static MBlock obsidian_slab;
	public static MBlock obsidian_wall;
			//Polished Obsidian
	public static MBlock polished_obsidian;
	public static MBlock polished_obsidian_stairs;
	public static MBlock polished_obsidian_slab;
	public static MBlock polished_obsidian_wall;
			//Polished Obsidian Brick
	public static MBlock polished_obsidian_bricks;
	public static MBlock polished_obsidian_brick_stairs;
	public static MBlock polished_obsidian_brick_slab;
	public static MBlock polished_obsidian_brick_wall;
			//Buttons
	public static MBlock polished_obsidian_button;
	public static MBlock polished_obsidian_pressure_plate;
	
	//Initialization
	public static void Init() {
		
		//Scrap
		scrap_planks = new MFlamBlock("scrap_planks", new BlockItem(new Block(m_scrap_block_s), m_item_s), 5, 20);
		scrap_stairs = new MFlamBlock("scrap_stairs", new BlockItem(new MStairsBlock(scrap_planks.getBlock().getDefaultState(), m_scrap_block_s), m_item_s), 5, 20);
		scrap_slab = new MFlamBlock("scrap_slab", new BlockItem(new SlabBlock(m_scrap_block_s), m_item_s), 5, 20);
		scrap_fence = new MFlamBlock("scrap_fence", new BlockItem(new FenceBlock(m_scrap_block_s), m_item_s), 5, 20);
		scrap_fence_gate = new MFlamBlock("scrap_fence_gate", new BlockItem(new FenceGateBlock(m_scrap_block_s), m_item_s), 5, 20);
		scrap_button = new MFlamBlock("scrap_button", new BlockItem(new MWoodenButtonBlock(m_scrap_block_s), m_item_s), 5, 20);
		scrap_pressure_plate = new MFlamBlock("scrap_pressure_plate", new BlockItem(new MPressurePlateBlock(ActivationRule.EVERYTHING, m_scrap_block_s), m_item_s), 5, 20);
		
		//Mud Bricks
		mud_bricks = new MBlock("mud_bricks", new BlockItem(new Block(m_mud_block_s), m_item_s));
		mud_brick_stairs = new MBlock("mud_brick_stairs", new BlockItem(new MStairsBlock(mud_bricks.getBlock().getDefaultState(), m_mud_block_s), m_item_s));
		mud_brick_slab = new MBlock("mud_brick_slab", new BlockItem(new SlabBlock(m_mud_block_s), m_item_s));
		mud_brick_wall = new MBlock("mud_brick_wall", new BlockItem(new WallBlock(m_mud_block_s), m_item_s));
		
		//Sandstone
		smooth_sandstone_bricks = new MBlock("smooth_sandstone_bricks", new BlockItem(new Block(m_sandstone_block_s), m_item_s));
		smooth_sandstone_brick_stairs = new MBlock("smooth_sandstone_brick_stairs", new BlockItem(new MStairsBlock(smooth_sandstone_bricks.getBlock().getDefaultState(), m_sandstone_block_s), m_item_s));
		smooth_sandstone_brick_slab = new MBlock("smooth_sandstone_brick_slab", new BlockItem(new SlabBlock(m_sandstone_block_s), m_item_s));
		smooth_sandstone_brick_wall = new MBlock("smooth_sandstone_brick_wall", new BlockItem(new WallBlock(m_sandstone_block_s), m_item_s));
		
		smooth_sandstone_button = new MBlock("smooth_sandstone_button", new BlockItem(new MStoneButtonBlock(m_sandstone_block_s), m_item_s));
		smooth_sandstone_pressure_plate = new MBlock("smooth_sandstone_pressure_plate", new BlockItem(new MPressurePlateBlock(ActivationRule.MOBS, m_sandstone_block_s), m_item_s));
		
		//Red Sandstone
		smooth_red_sandstone_bricks = new MBlock("smooth_red_sandstone_bricks", new BlockItem(new Block(m_red_sandstone_block_s), m_item_s));
		smooth_red_sandstone_brick_stairs = new MBlock("smooth_red_sandstone_brick_stairs", new BlockItem(new MStairsBlock(smooth_red_sandstone_bricks.getBlock().getDefaultState(), m_red_sandstone_block_s), m_item_s));
		smooth_red_sandstone_brick_slab = new MBlock("smooth_red_sandstone_brick_slab", new BlockItem(new SlabBlock(m_red_sandstone_block_s), m_item_s));
		smooth_red_sandstone_brick_wall = new MBlock("smooth_red_sandstone_brick_wall", new BlockItem(new WallBlock(m_red_sandstone_block_s), m_item_s));
		
		smooth_red_sandstone_button = new MBlock("smooth_red_sandstone_button", new BlockItem(new MStoneButtonBlock(m_red_sandstone_block_s), m_item_s));
		smooth_red_sandstone_pressure_plate = new MBlock("smooth_red_sandstone_pressure_plate", new BlockItem(new MPressurePlateBlock(ActivationRule.MOBS, m_red_sandstone_block_s), m_item_s));
		
		//Granite
		polished_granite_bricks = new MBlock("polished_granite_bricks", new BlockItem(new Block(m_granite_block_s), m_item_s));
		polished_granite_brick_stairs = new MBlock("polished_granite_brick_stairs", new BlockItem(new MStairsBlock(polished_granite_bricks.getBlock().getDefaultState(), m_granite_block_s), m_item_s));
		polished_granite_brick_slab = new MBlock("polished_granite_brick_slab", new BlockItem(new SlabBlock(m_granite_block_s), m_item_s));
		polished_granite_brick_wall = new MBlock("polished_granite_brick_wall", new BlockItem(new WallBlock(m_granite_block_s), m_item_s));
		
		polished_granite_button = new MBlock("polished_granite_button", new BlockItem(new MStoneButtonBlock(m_granite_block_s), m_item_s));
		polished_granite_pressure_plate = new MBlock("polished_granite_pressure_plate", new BlockItem(new MPressurePlateBlock(ActivationRule.MOBS, m_granite_block_s), m_item_s));
		
		//Diorite
		polished_diorite_bricks = new MBlock("polished_diorite_bricks", new BlockItem(new Block(m_diorite_block_s), m_item_s));
		polished_diorite_brick_stairs = new MBlock("polished_diorite_brick_stairs", new BlockItem(new MStairsBlock(polished_diorite_bricks.getBlock().getDefaultState(), m_diorite_block_s), m_item_s));
		polished_diorite_brick_slab = new MBlock("polished_diorite_brick_slab", new BlockItem(new SlabBlock(m_diorite_block_s), m_item_s));
		polished_diorite_brick_wall = new MBlock("polished_diorite_brick_wall", new BlockItem(new WallBlock(m_diorite_block_s), m_item_s));
		
		polished_diorite_button = new MBlock("polished_diorite_button", new BlockItem(new MStoneButtonBlock(m_diorite_block_s), m_item_s));
		polished_diorite_pressure_plate = new MBlock("polished_diorite_pressure_plate", new BlockItem(new MPressurePlateBlock(ActivationRule.MOBS, m_diorite_block_s), m_item_s));
		
		//Andesite
		polished_andesite_bricks = new MBlock("polished_andesite_bricks", new BlockItem(new Block(m_andesite_block_s), m_item_s));
		polished_andesite_brick_stairs = new MBlock("polished_andesite_brick_stairs", new BlockItem(new MStairsBlock(polished_andesite_bricks.getBlock().getDefaultState(), m_andesite_block_s), m_item_s));
		polished_andesite_brick_slab = new MBlock("polished_andesite_brick_slab", new BlockItem(new SlabBlock(m_andesite_block_s), m_item_s));
		polished_andesite_brick_wall = new MBlock("polished_andesite_brick_wall", new BlockItem(new WallBlock(m_andesite_block_s), m_item_s));
		
		polished_andesite_button = new MBlock("polished_andesite_button", new BlockItem(new MStoneButtonBlock(m_andesite_block_s), m_item_s));
		polished_andesite_pressure_plate = new MBlock("polished_andesite_pressure_plate", new BlockItem(new MPressurePlateBlock(ActivationRule.MOBS, m_andesite_block_s), m_item_s));
		
		//Obsidian
		obsidian_glass = new MBlock("obsidian_glass", new BlockItem(new StainedGlassBlock(DyeColor.PURPLE, m_obsidian_block_s_glass), m_item_s));
		obsidian_glass_pane = new MBlock("obsidian_glass_pane", new BlockItem(new StainedGlassPaneBlock(DyeColor.PURPLE, m_obsidian_block_s_glass), m_item_s));
		
		obsidian_stairs = new MBlock("obsidian_stairs", new BlockItem(new MStairsBlock(Blocks.OBSIDIAN.getDefaultState(), m_obsidian_block_s), m_item_s));
		obsidian_slab = new MBlock("obsidian_slab", new BlockItem(new SlabBlock(m_obsidian_block_s), m_item_s));
		obsidian_wall = new MBlock("obsidian_wall", new BlockItem(new WallBlock(m_obsidian_block_s), m_item_s));
		
		polished_obsidian = new MBlock("polished_obsidian", new BlockItem(new Block(m_obsidian_block_s), m_item_s));
		polished_obsidian_stairs = new MBlock("polished_obsidian_stairs", new BlockItem(new MStairsBlock(polished_obsidian.getBlock().getDefaultState(), m_obsidian_block_s), m_item_s));
		polished_obsidian_slab = new MBlock("polished_obsidian_slab", new BlockItem(new SlabBlock(m_obsidian_block_s), m_item_s));
		polished_obsidian_wall = new MBlock("polished_obsidian_wall", new BlockItem(new WallBlock(m_obsidian_block_s), m_item_s));
		
		polished_obsidian_bricks = new MBlock("polished_obsidian_bricks", new BlockItem(new Block(m_obsidian_block_s), m_item_s));
		polished_obsidian_brick_stairs = new MBlock("polished_obsidian_brick_stairs", new BlockItem(new MStairsBlock(polished_obsidian_bricks.getBlock().getDefaultState(), m_obsidian_block_s), m_item_s));
		polished_obsidian_brick_slab = new MBlock("polished_obsidian_brick_slab", new BlockItem(new SlabBlock(m_obsidian_block_s), m_item_s));
		polished_obsidian_wall = new MBlock("polished_obsidian_brick_wall", new BlockItem(new WallBlock(m_obsidian_block_s), m_item_s));
		
		polished_obsidian_button = new MBlock("polished_obsidian_button", new BlockItem(new MStoneButtonBlock(m_obsidian_block_s),m_item_s));
		polished_obsidian_pressure_plate = new MBlock("polished_obsidian_pressure_plate", new BlockItem(new MPressurePlateBlock(ActivationRule.MOBS, m_obsidian_block_s), m_item_s));
	}
}
