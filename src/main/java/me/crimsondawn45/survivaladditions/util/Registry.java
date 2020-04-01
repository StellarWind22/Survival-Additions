package me.crimsondawn45.survivaladditions.util;

import org.apache.logging.log4j.Logger;

import me.crimsondawn45.survivaladditions.Main;
import me.crimsondawn45.survivaladditions.init.ModBlocks;
import me.crimsondawn45.survivaladditions.init.ModFoods;
import me.crimsondawn45.survivaladditions.init.ModItems;
import me.crimsondawn45.survivaladditions.object.ModChorusStewItem;
import me.crimsondawn45.survivaladditions.object.ModShieldItem;
import me.crimsondawn45.survivaladditions.object.ModStairsBlock;
import me.crimsondawn45.survivaladditions.object.ModToolMaterials;
import me.crimsondawn45.survivaladditions.object.ModWetMudBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SoupItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class Registry 
{
	public static final Logger LOGGER = Main.LOGGER;
	public static final String MODID = Main.MODID;
	
	public static final ItemGroup ITEM = Main.ITEM;
	public static final ItemGroup BLOCK = Main.BLOCK;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
			//Crafting
			ModItems.chain = new Item(new Item.Properties().group(ITEM)).setRegistryName(resLoc("chain")),
			
			ModItems.knapped_flint = new Item(new Item.Properties().group(ITEM)).setRegistryName(resLoc("knapped_flint")),
			ModItems.carved_quartz = new Item(new Item.Properties().group(ITEM)).setRegistryName(resLoc("carved_quartz")),
			
			//Tools
				//Bone
		    ModItems.bone_axe = new AxeItem(ModToolMaterials.bone, 2.0F, -3.2F , new Item.Properties().group(ITEM)).setRegistryName(resLoc("bone_axe")),
			ModItems.bone_hoe = new HoeItem(ModToolMaterials.bone, -3.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("bone_hoe")),
			ModItems.bone_pickaxe = new PickaxeItem(ModToolMaterials.bone, -3, -2.8F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("bone_pickaxe")),
			ModItems.bone_sword = new SwordItem(ModToolMaterials.bone, -1, -2.4F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("bone_sword")),
				//Flint
			ModItems.flint_axe = new AxeItem(ModToolMaterials.flint, 3.0F, -3.2F , new Item.Properties().group(ITEM)).setRegistryName(resLoc("flint_axe")),
			ModItems.flint_hoe = new HoeItem(ModToolMaterials.flint, -2.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("flint_hoe")),
			ModItems.flint_pickaxe = new PickaxeItem(ModToolMaterials.flint, -3, -2.8F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("flint_pickaxe")),
			ModItems.flint_shovel = new ShovelItem(ModToolMaterials.flint, -2.5F, -3.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("flint_shovel")),
			ModItems.flint_sword = new SwordItem(ModToolMaterials.flint, -1, -2.4F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("flint_sword")),
				//Netherrack
			ModItems.netherrack_axe = new AxeItem(ModToolMaterials.netherrack, 3.0F, -3.2F , new Item.Properties().group(ITEM)).setRegistryName(resLoc("netherrack_axe")),
			ModItems.netherrack_hoe = new HoeItem(ModToolMaterials.netherrack, -2.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("netherrack_hoe")),
			ModItems.netherrack_pickaxe = new PickaxeItem(ModToolMaterials.netherrack, -3, -2.8F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("netherrack_pickaxe")),
			ModItems.netherrack_shovel = new ShovelItem(ModToolMaterials.netherrack, -2.5F, -3.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("netherrack_shovel")),
			ModItems.netherrack_sword = new SwordItem(ModToolMaterials.netherrack, -1, -2.4F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("netherrack_sword")),
				//Quartz
			ModItems.quartz_axe = new AxeItem(ModToolMaterials.quartz, 3.0F, -3.2F , new Item.Properties().group(ITEM)).setRegistryName(resLoc("quartz_axe")),
			ModItems.quartz_hoe = new HoeItem(ModToolMaterials.quartz, -2.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("quartz_hoe")),
			ModItems.quartz_pickaxe = new PickaxeItem(ModToolMaterials.quartz, -3, -2.8F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("quartz_pickaxe")),
			ModItems.quartz_shovel = new ShovelItem(ModToolMaterials.quartz, -2.5F, -3.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("quartz_shovel")),
			ModItems.quartz_sword = new SwordItem(ModToolMaterials.quartz, -1, -2.4F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("quartz_sword")),
				//Sandstone
			ModItems.sandstone_axe = new AxeItem(ModToolMaterials.sandstone, 3.0F, -3.2F , new Item.Properties().group(ITEM)).setRegistryName(resLoc("sandstone_axe")),
			ModItems.sandstone_hoe = new HoeItem(ModToolMaterials.sandstone, -2.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("sandstone_hoe")),
			ModItems.sandstone_pickaxe = new PickaxeItem(ModToolMaterials.sandstone, -3, -2.8F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("sandstone_pickaxe")),
			ModItems.sandstone_shovel = new ShovelItem(ModToolMaterials.sandstone, -2.5F, -3.0F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("sandstone_shovel")),
			ModItems.sandstone_sword = new SwordItem(ModToolMaterials.sandstone, -1, -2.4F, new Item.Properties().group(ITEM)).setRegistryName(resLoc("sandstone_sword")),
			
			ModItems.wooden_shield = new ModShieldItem(new Item.Properties().group(ITEM).maxStackSize(1).maxDamage(100)).setRegistryName(resLoc("wooden_shield")),
			
			//Food
			ModItems.cactus_stew = new SoupItem(new Item.Properties().group(ITEM).food(ModFoods.CACTUS_STEW).maxStackSize(1)).setRegistryName(resLoc("cactus_stew")),
			ModItems.nether_wart_stew = new SoupItem(new Item.Properties().group(ITEM).food(ModFoods.NETHER_WART_STEW).maxStackSize(1)).setRegistryName(resLoc("nether_wart_stew")),
			ModItems.chorus_fruit_stew = new ModChorusStewItem(new Item.Properties().group(ITEM).food(ModFoods.CHORUS_FRUIT_STEW).maxStackSize(1)).setRegistryName(resLoc("chorus_fruit_stew")),
			ModItems.carrot_soup = new SoupItem(new Item.Properties().group(ITEM).food(ModFoods.CARROT_SOUP).maxStackSize(1)).setRegistryName(resLoc("carrot_soup")),
			ModItems.potato_soup = new SoupItem(new Item.Properties().group(ITEM).food(ModFoods.POTATO_SOUP).maxStackSize(1)).setRegistryName(resLoc("potato_soup")),
				
			//Blocks
			ModItems.scrap_planks = new BlockItem(ModBlocks.scrap_planks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.scrap_planks.getRegistryName()),
			ModItems.scrap_stairs = new BlockItem(ModBlocks.scrap_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.scrap_stairs.getRegistryName()),
			ModItems.scrap_slab = new BlockItem(ModBlocks.scrap_slab, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.scrap_slab.getRegistryName()),
			
			//ModItems.wet_mud_bricks = new BlockItem(ModBlocks.wet_mud_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.wet_mud_bricks.getRegistryName()),
			
			ModItems.mud_bricks = new BlockItem(ModBlocks.mud_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.mud_bricks.getRegistryName()),
			ModItems.mud_brick_stairs = new BlockItem(ModBlocks.mud_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.mud_brick_stairs.getRegistryName()),
			ModItems.mud_brick_slab = new BlockItem(ModBlocks.mud_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.mud_brick_slab.getRegistryName()),
			ModItems.mud_brick_wall = new BlockItem(ModBlocks.mud_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.mud_brick_wall.getRegistryName()),
			
			ModItems.red_sandstone_bricks = new BlockItem(ModBlocks.red_sandstone_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.red_sandstone_bricks.getRegistryName()),
			ModItems.red_sandstone_brick_stairs = new BlockItem(ModBlocks.red_sandstone_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.red_sandstone_brick_stairs.getRegistryName()),
			ModItems.red_sandstone_brick_slab = new BlockItem(ModBlocks.red_sandstone_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.red_sandstone_brick_slab.getRegistryName()),
			ModItems.red_sandstone_brick_wall = new BlockItem(ModBlocks.red_sandstone_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.red_sandstone_brick_wall.getRegistryName()),
			
			ModItems.sandstone_bricks = new BlockItem(ModBlocks.sandstone_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.sandstone_bricks.getRegistryName()),
			ModItems.sandstone_brick_stairs = new BlockItem(ModBlocks.sandstone_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.sandstone_brick_stairs.getRegistryName()),
			ModItems.sandstone_brick_slab = new BlockItem(ModBlocks.sandstone_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.sandstone_brick_slab.getRegistryName()),
			ModItems.sandstone_brick_wall = new BlockItem(ModBlocks.sandstone_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.sandstone_brick_wall.getRegistryName()),
			
			ModItems.snow_bricks = new BlockItem(ModBlocks.snow_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.snow_bricks.getRegistryName()),
			ModItems.snow_brick_stairs = new BlockItem(ModBlocks.snow_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.snow_brick_stairs.getRegistryName()),
			ModItems.snow_brick_slab = new BlockItem(ModBlocks.snow_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.snow_brick_slab.getRegistryName()),
			ModItems.snow_brick_wall = new BlockItem(ModBlocks.snow_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.snow_brick_wall.getRegistryName()),
			
			ModItems.packed_ice_bricks = new BlockItem(ModBlocks.packed_ice_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.packed_ice_bricks.getRegistryName()),
			ModItems.packed_ice_brick_stairs = new BlockItem(ModBlocks.packed_ice_brick_stairs, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.packed_ice_brick_stairs.getRegistryName()),
			ModItems.packed_ice_brick_slab = new BlockItem(ModBlocks.packed_ice_brick_slab, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.packed_ice_brick_slab.getRegistryName()),
			ModItems.packed_ice_brick_wall = new BlockItem(ModBlocks.packed_ice_brick_wall, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.packed_ice_brick_wall.getRegistryName()),
			ModItems.chiseled_packed_ice_bricks = new BlockItem(ModBlocks.chiseled_packed_ice_bricks, new Item.Properties().group(BLOCK)).setRegistryName(ModBlocks.chiseled_packed_ice_bricks.getRegistryName())
		);
		
		LOGGER.info("Items registered.");
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(		
			//Building
			ModBlocks.scrap_planks = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(resLoc("scrap_planks")),
			ModBlocks.scrap_stairs = new ModStairsBlock(ModBlocks.scrap_planks.getDefaultState(), Block.Properties.from(ModBlocks.scrap_planks)).setRegistryName(resLoc("scrap_stairs")),
			ModBlocks.scrap_slab = new SlabBlock(Block.Properties.from(ModBlocks.scrap_planks)).setRegistryName(resLoc("scrap_slab")),
			
			ModBlocks.wet_mud_bricks = new ModWetMudBlock(Block.Properties.from(Blocks.DIRT)).setRegistryName(resLoc("wet_mud_bricks")),
			
			ModBlocks.mud_bricks = new Block(Block.Properties.create(Material.ROCK, MaterialColor.DIRT).hardnessAndResistance(0.8F)).setRegistryName(resLoc("mud_bricks")),
			ModBlocks.mud_brick_stairs = new ModStairsBlock(ModBlocks.mud_bricks.getDefaultState(), Block.Properties.from(ModBlocks.mud_bricks)).setRegistryName(resLoc("mud_brick_stairs")),
			ModBlocks.mud_brick_slab = new SlabBlock(Block.Properties.from(ModBlocks.mud_bricks)).setRegistryName(resLoc("mud_brick_slab")),
			ModBlocks.mud_brick_wall = new WallBlock(Block.Properties.from(ModBlocks.mud_bricks)).setRegistryName(resLoc("mud_brick_wall")),
			
			ModBlocks.sandstone_bricks = new Block(Block.Properties.from(Blocks.SANDSTONE)).setRegistryName(resLoc("sandstone_bricks")),	
			ModBlocks.sandstone_brick_stairs = new ModStairsBlock(ModBlocks.sandstone_bricks.getDefaultState(), Block.Properties.from(ModBlocks.sandstone_bricks)).setRegistryName(resLoc("sandstone_brick_stairs")),
			ModBlocks.sandstone_brick_slab = new SlabBlock(Block.Properties.from(ModBlocks.sandstone_bricks)).setRegistryName(resLoc("sandstone_brick_slab")),
			ModBlocks.sandstone_brick_wall = new WallBlock(Block.Properties.from(ModBlocks.sandstone_bricks)).setRegistryName(resLoc("sandstone_brick_wall")),
			
			ModBlocks.red_sandstone_bricks = new Block(Block.Properties.from(Blocks.RED_SANDSTONE)).setRegistryName(resLoc("red_sandstone_bricks")),	
			ModBlocks.red_sandstone_brick_stairs = new ModStairsBlock(ModBlocks.red_sandstone_bricks.getDefaultState(), Block.Properties.from(ModBlocks.red_sandstone_bricks)).setRegistryName(resLoc("red_sandstone_brick_stairs")),
			ModBlocks.red_sandstone_brick_slab = new SlabBlock(Block.Properties.from(ModBlocks.red_sandstone_bricks)).setRegistryName(resLoc("red_sandstone_brick_slab")),
			ModBlocks.red_sandstone_brick_wall = new WallBlock(Block.Properties.from(ModBlocks.red_sandstone_bricks)).setRegistryName(resLoc("red_sandstone_brick_wall")),
			
				//I had to do wierd trick with the snow brick material bc if you dont you cant break it by hand?
			ModBlocks.snow_bricks = new Block(Block.Properties.create(Material.EARTH, MaterialColor.SNOW).sound(SoundType.SNOW).hardnessAndResistance(0.4F).harvestTool(ToolType.SHOVEL)).setRegistryName(resLoc("snow_bricks")),
			ModBlocks.snow_brick_stairs = new ModStairsBlock(ModBlocks.snow_bricks.getDefaultState(), Block.Properties.from(ModBlocks.snow_bricks)).setRegistryName(resLoc("snow_brick_stairs")),
			ModBlocks.snow_brick_slab = new SlabBlock(Block.Properties.from(ModBlocks.snow_bricks)).setRegistryName(resLoc("snow_brick_slab")),
			ModBlocks.snow_brick_wall = new WallBlock(Block.Properties.from(ModBlocks.snow_bricks)).setRegistryName(resLoc("snow_brick_wall")),
			
			ModBlocks.packed_ice_bricks = new Block(Block.Properties.create(Material.PACKED_ICE, MaterialColor.ICE).sound(SoundType.GLASS).slipperiness(0.98F).hardnessAndResistance(2.0F)).setRegistryName(resLoc("packed_ice_bricks")),
			ModBlocks.packed_ice_brick_stairs = new ModStairsBlock(ModBlocks.packed_ice_bricks.getDefaultState(), Block.Properties.from(ModBlocks.packed_ice_bricks)).setRegistryName(resLoc("packed_ice_brick_stairs")),
			ModBlocks.packed_ice_brick_slab = new SlabBlock(Block.Properties.from(ModBlocks.packed_ice_bricks)).setRegistryName(resLoc("packed_ice_brick_slab")),
			ModBlocks.packed_ice_brick_wall = new WallBlock(Block.Properties.from(ModBlocks.packed_ice_bricks)).setRegistryName(resLoc("packed_ice_brick_wall")),
			ModBlocks.chiseled_packed_ice_bricks = new Block(Block.Properties.create(Material.PACKED_ICE, MaterialColor.ICE).sound(SoundType.GLASS).slipperiness(0.98F).hardnessAndResistance(2.0F)).setRegistryName(resLoc("chiseled_packed_ice_bricks"))
		);
		
		LOGGER.info("Blocks registered.");
	}
	
	public static ResourceLocation resLoc(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}	