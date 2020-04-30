package me.crimsondawn45.cdsam;

import me.crimsondawn45.cdsam.list.ModBlocks;
import me.crimsondawn45.cdsam.list.ModItems;
import me.crimsondawn45.cdsam.object.ModAxeItem;
import me.crimsondawn45.cdsam.object.ModChorusStewItem;
import me.crimsondawn45.cdsam.object.ModFoods;
import me.crimsondawn45.cdsam.object.ModHoeItem;
import me.crimsondawn45.cdsam.object.ModObsidianBlock;
import me.crimsondawn45.cdsam.object.ModObsidianButton;
import me.crimsondawn45.cdsam.object.ModObsidianPressurePlate;
import me.crimsondawn45.cdsam.object.ModObsidianSlab;
import me.crimsondawn45.cdsam.object.ModObsidianStairs;
import me.crimsondawn45.cdsam.object.ModObsidianWall;
import me.crimsondawn45.cdsam.object.ModPickaxeItem;
import me.crimsondawn45.cdsam.object.ModShovelItem;
import me.crimsondawn45.cdsam.object.ModStairsBlock;
import me.crimsondawn45.cdsam.object.ModSwordItem;
import me.crimsondawn45.cdsam.object.ModToolMaterials;
import me.crimsondawn45.cdsam.util.ModBlock;
import me.crimsondawn45.cdsam.util.ModBlockItem;
import me.crimsondawn45.cdsam.util.ModItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.util.Identifier;

public class SurvivalAdditions implements ModInitializer
{
	public static final String MOD_ID = "cdsam";
	
	public static final ItemGroup CDSAM_ITEMS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "cdsam_items"),() -> new ItemStack(ModItems.flint_pickaxe.getItem()));
	public static final ItemGroup CDSAM_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "cdsam_blocks"),() -> new ItemStack(ModItems.mud_bricks.getItem()));	
	
	@Override
	public void onInitialize()
	{
		//Blocks
		ModBlocks.scrap_planks = new ModBlock("scrap_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).build()));
		ModBlocks.scrap_stairs = new ModBlock("scrap_stairs", new ModStairsBlock(ModBlocks.scrap_planks.getBlock().getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.scrap_planks.getBlock())));
		ModBlocks.scrap_slab = new ModBlock("scrap_slab", new SlabBlock(Settings.copy(ModBlocks.scrap_planks.getBlock())));

		ModBlocks.mud_bricks = new ModBlock("mud_bricks", new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).materialColor(MaterialColor.DIRT).build()));
		ModBlocks.mud_brick_stairs = new ModBlock("mud_brick_stairs", new ModStairsBlock(ModBlocks.mud_bricks.getBlock().getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.mud_bricks.getBlock())));
		ModBlocks.mud_brick_slab = new ModBlock("mud_brick_slab", new SlabBlock(Settings.copy(ModBlocks.mud_bricks.getBlock())));
		ModBlocks.mud_brick_wall = new ModBlock("mud_brick_wall", new WallBlock(Settings.copy(ModBlocks.mud_bricks.getBlock())));

		ModBlocks.sandstone_bricks = new ModBlock("sandstone_bricks", new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).build()));
		ModBlocks.sandstone_brick_stairs = new ModBlock("sandstone_brick_stairs", new ModStairsBlock(ModBlocks.sandstone_bricks.getBlock().getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.sandstone_bricks.getBlock())));
		ModBlocks.sandstone_brick_slab = new ModBlock("sandstone_brick_slab", new SlabBlock(Settings.copy(ModBlocks.sandstone_bricks.getBlock())));
		ModBlocks.sandstone_brick_wall = new ModBlock("sandstone_brick_wall", new WallBlock(Settings.copy(ModBlocks.sandstone_bricks.getBlock())));
		
		ModBlocks.red_sandstone_bricks = new ModBlock("red_sandstone_bricks", new Block(FabricBlockSettings.copy(Blocks.RED_SANDSTONE).build()));
		ModBlocks.red_sandstone_brick_stairs = new ModBlock("red_sandstone_brick_stairs", new ModStairsBlock(ModBlocks.red_sandstone_bricks.getBlock().getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.red_sandstone_bricks.getBlock())));
		ModBlocks.red_sandstone_brick_slab = new ModBlock("red_sandstone_brick_slab", new SlabBlock(Settings.copy(ModBlocks.red_sandstone_bricks.getBlock())));
		ModBlocks.red_sandstone_brick_wall = new ModBlock("red_sandstone_brick_wall", new WallBlock(Settings.copy(ModBlocks.red_sandstone_bricks.getBlock())));

		ModBlocks.snow_bricks = new ModBlock("snow_bricks", new Block(FabricBlockSettings.copy(Blocks.SNOW_BLOCK).breakByHand(true).build()));
		ModBlocks.snow_brick_stairs = new ModBlock("snow_brick_stairs", new ModStairsBlock(ModBlocks.snow_bricks.getBlock().getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.snow_bricks.getBlock())));
		ModBlocks.snow_brick_slab= new ModBlock("snow_brick_slab", new SlabBlock(Settings.copy(ModBlocks.snow_bricks.getBlock())));
		ModBlocks.snow_brick_wall = new ModBlock("snow_brick_wall", new WallBlock(Settings.copy(ModBlocks.snow_bricks.getBlock())));

		ModBlocks.packed_ice_bricks = new ModBlock("packed_ice_bricks", new Block(FabricBlockSettings.copy(Blocks.PACKED_ICE).build()));
		ModBlocks.packed_ice_brick_stairs = new ModBlock("packed_ice_brick_stairs", new ModStairsBlock(ModBlocks.packed_ice_bricks.getBlock().getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.packed_ice_bricks.getBlock())));
		ModBlocks.packed_ice_brick_slab = new ModBlock("packed_ice_brick_slab", new SlabBlock(Settings.copy(ModBlocks.packed_ice_bricks.getBlock())));
		ModBlocks.packed_ice_brick_wall = new ModBlock("packed_ice_brick_wall", new WallBlock(Settings.copy(ModBlocks.packed_ice_bricks.getBlock())));

		ModBlocks.obsidian_stairs = new ModBlock("obsidian_stairs", new ModObsidianStairs(Blocks.OBSIDIAN.getDefaultState() ,Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.obsidian_slab = new ModBlock("obsidian_slab", new ModObsidianSlab(Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.obsidian_wall = new ModBlock("obsidian_wall", new ModObsidianWall(Settings.copy(Blocks.OBSIDIAN)));
		
		ModBlocks.polished_obsidian = new ModBlock("polished_obsidian", new ModObsidianBlock(Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_stairs = new ModBlock("polished_obsidian_stairs", new ModObsidianStairs(ModBlocks.polished_obsidian.getBlock().getDefaultState(),Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_slab = new ModBlock("polished_obsidian_slab", new ModObsidianSlab(Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_wall = new ModBlock("polished_obsidian_wall", new ModObsidianWall(Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_button = new ModBlock("polished_obsidian_button", new ModObsidianButton(Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_pressure_plate = new ModBlock("polished_obsidian_pressure_plate", new ModObsidianPressurePlate(Settings.copy(Blocks.OBSIDIAN)));

		ModBlocks.polished_obsidian_bricks = new ModBlock("polished_obsidian_bricks", new ModObsidianBlock(Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_brick_stairs = new ModBlock("polished_obsidian_brick_stairs", new ModObsidianStairs(ModBlocks.polished_obsidian_bricks.getBlock().getDefaultState(), Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_brick_slab = new ModBlock("polished_obsidian_brick_slab", new ModObsidianSlab(Settings.copy(Blocks.OBSIDIAN)));
		ModBlocks.polished_obsidian_brick_wall = new ModBlock("polished_obsidian_brick_wall", new ModObsidianWall(Settings.copy(Blocks.OBSIDIAN)));

		//Items
			//Crafting
		ModItems.knapped_flint = new ModItem("knapped_flint", new Item(new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.carved_quartz = new ModItem("carved_quartz", new Item(new Item.Settings().group(CDSAM_ITEMS)));
			//Tools
				//Bone
		ModItems.bone_sword = new ModItem("bone_sword", new ModSwordItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.bone_pickaxe = new ModItem("bone_pickaxe", new ModPickaxeItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.bone_axe = new ModItem("bone_axe", new ModAxeItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.bone_hoe = new ModItem("bone_hoe", new ModHoeItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
				//Flint
		ModItems.flint_sword = new ModItem("flint_sword", new ModSwordItem(ModToolMaterials.flint, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.flint_shovel = new ModItem("flint_shovel", new ModShovelItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.flint_pickaxe = new ModItem("flint_pickaxe", new ModPickaxeItem(ModToolMaterials.flint, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.flint_axe = new ModItem("flint_axe", new ModAxeItem(ModToolMaterials.flint, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.flint_hoe = new ModItem("flint_hoe", new ModHoeItem(ModToolMaterials.flint, new Item.Settings().group(CDSAM_ITEMS)));
				//Netherrack
		ModItems.netherrack_sword = new ModItem("netherrack_sword", new ModSwordItem(ModToolMaterials.netherrack, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.netherrack_shovel = new ModItem("netherrack_shovel", new ModShovelItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.netherrack_pickaxe = new ModItem("netherrack_pickaxe", new ModPickaxeItem(ModToolMaterials.netherrack, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.netherrack_axe = new ModItem("netherrack_axe", new ModAxeItem(ModToolMaterials.netherrack, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.netherrack_hoe = new ModItem("netherrack_hoe", new ModHoeItem(ModToolMaterials.netherrack, new Item.Settings().group(CDSAM_ITEMS)));
				//Quartz
		ModItems.quartz_sword = new ModItem("quartz_sword", new ModSwordItem(ModToolMaterials.quartz, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.quartz_shovel = new ModItem("quartz_shovel", new ModShovelItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.quartz_pickaxe = new ModItem("quartz_pickaxe", new ModPickaxeItem(ModToolMaterials.quartz, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.quartz_axe = new ModItem("quartz_axe", new ModAxeItem(ModToolMaterials.quartz, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.quartz_hoe = new ModItem("quartz_hoe", new ModHoeItem(ModToolMaterials.quartz, new Item.Settings().group(CDSAM_ITEMS)));
				//Sandstone
		ModItems.sandstone_sword = new ModItem("sandstone_sword", new ModSwordItem(ModToolMaterials.sandstone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.sandstone_shovel = new ModItem("sandstone_shovel", new ModShovelItem(ModToolMaterials.bone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.sandstone_pickaxe = new ModItem("sandstone_pickaxe", new ModPickaxeItem(ModToolMaterials.sandstone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.sandstone_axe = new ModItem("sandstone_axe", new ModAxeItem(ModToolMaterials.sandstone, new Item.Settings().group(CDSAM_ITEMS)));
		ModItems.sandstone_hoe = new ModItem("sandstone_hoe", new ModHoeItem(ModToolMaterials.sandstone, new Item.Settings().group(CDSAM_ITEMS)));
			//Food
		ModItems.cactus_stew = new ModItem("cactus_stew", new MushroomStewItem(new Item.Settings().group(CDSAM_ITEMS).food(ModFoods.CACTUS_STEW)));
		ModItems.nether_wart_stew = new ModItem("nether_wart_stew", new MushroomStewItem(new Item.Settings().group(CDSAM_ITEMS).food(ModFoods.NETHER_WART_STEW)));
		ModItems.chorus_fruit_stew = new ModItem("chorus_fruit_stew", new ModChorusStewItem(new Item.Settings().group(CDSAM_ITEMS).food(ModFoods.CHORUS_FRUIT_STEW)));
		ModItems.carrot_soup = new ModItem("carrot_soup", new MushroomStewItem(new Item.Settings().group(CDSAM_ITEMS).food(ModFoods.CARROT_SOUP)));
		ModItems.potato_soup = new ModItem("potato_soup", new MushroomStewItem(new Item.Settings().group(CDSAM_ITEMS).food(ModFoods.POTATO_SOUP)));
			//BlockItems
		ModItems.scrap_planks = new ModBlockItem(ModBlocks.scrap_planks);
		ModItems.scrap_stairs = new ModBlockItem(ModBlocks.scrap_stairs);
		ModItems.scrap_slab = new ModBlockItem(ModBlocks.scrap_slab);

		ModItems.mud_bricks = new ModBlockItem(ModBlocks.mud_bricks);
		ModItems.mud_brick_stairs = new ModBlockItem(ModBlocks.mud_brick_stairs);
		ModItems.mud_brick_slab = new ModBlockItem(ModBlocks.mud_brick_slab);
		ModItems.mud_brick_wall = new ModBlockItem(ModBlocks.mud_brick_wall);

		ModItems.sandstone_bricks = new ModBlockItem(ModBlocks.sandstone_bricks);
		ModItems.sandstone_brick_stairs = new ModBlockItem(ModBlocks.sandstone_brick_stairs);
		ModItems.sandstone_brick_slab = new ModBlockItem(ModBlocks.sandstone_brick_slab);
		ModItems.sandstone_brick_wall = new ModBlockItem(ModBlocks.sandstone_brick_wall);

		ModItems.red_sandstone_bricks = new ModBlockItem(ModBlocks.red_sandstone_bricks);
		ModItems.red_sandstone_brick_stairs = new ModBlockItem(ModBlocks.red_sandstone_brick_stairs);
		ModItems.red_sandstone_brick_slab = new ModBlockItem(ModBlocks.red_sandstone_brick_slab);
		ModItems.red_sandstone_brick_wall = new ModBlockItem(ModBlocks.red_sandstone_brick_wall);

		ModItems.snow_bricks = new ModBlockItem(ModBlocks.snow_bricks);
		ModItems.snow_brick_stairs = new ModBlockItem(ModBlocks.snow_brick_stairs);
		ModItems.snow_brick_slab = new ModBlockItem(ModBlocks.snow_brick_slab);
		ModItems.snow_brick_wall = new ModBlockItem(ModBlocks.snow_brick_wall);

		ModItems.packed_ice_bricks = new ModBlockItem(ModBlocks.packed_ice_bricks);
		ModItems.packed_ice_brick_stairs = new ModBlockItem(ModBlocks.packed_ice_brick_stairs);
		ModItems.packed_ice_brick_slab = new ModBlockItem(ModBlocks.packed_ice_brick_slab);
		ModItems.packed_ice_brick_wall = new ModBlockItem(ModBlocks.packed_ice_brick_wall);

		ModItems.obsidian_stairs = new ModBlockItem(ModBlocks.obsidian_stairs);
		ModItems.obsidian_slab = new ModBlockItem(ModBlocks.obsidian_slab);
		ModItems.obsidian_wall = new ModBlockItem(ModBlocks.obsidian_wall);

		ModItems.polished_obsidian = new ModBlockItem(ModBlocks.polished_obsidian);
		ModItems.polished_obsidian_stairs = new ModBlockItem(ModBlocks.polished_obsidian_stairs);
		ModItems.polished_obsidian_slab = new ModBlockItem(ModBlocks.polished_obsidian_slab);
		ModItems.polished_obsidian_wall = new ModBlockItem(ModBlocks.polished_obsidian_wall);
		ModItems.polished_obsidian_button = new ModBlockItem(ModBlocks.polished_obsidian_button);
		ModItems.polished_obsidian_pressure_plate = new ModBlockItem(ModBlocks.polished_obsidian_pressure_plate);

		ModItems.polished_obsidian_bricks = new ModBlockItem(ModBlocks.polished_obsidian_bricks);
		ModItems.polished_obsidian_brick_stairs = new ModBlockItem(ModBlocks.polished_obsidian_brick_stairs);
		ModItems.polished_obsidian_brick_slab = new ModBlockItem(ModBlocks.polished_obsidian_brick_slab);
		ModItems.polished_obsidian_brick_wall = new ModBlockItem(ModBlocks.polished_obsidian_brick_wall);
	}
}
