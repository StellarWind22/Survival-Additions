package me.crimsondawn45.cdsam.registry;

import me.crimsondawn45.cdsam.Main;
import me.crimsondawn45.cdsam.object.item.MAxeItem;
import me.crimsondawn45.cdsam.object.item.MChorusStewItem;
import me.crimsondawn45.cdsam.object.item.MHoeItem;
import me.crimsondawn45.cdsam.object.item.MPickaxeItem;
import me.crimsondawn45.cdsam.object.item.MShovelItem;
import me.crimsondawn45.cdsam.object.item.MStewItem;
import me.crimsondawn45.cdsam.object.item.MSwordItem;
import me.crimsondawn45.cdsam.util.MItem;
import me.crimsondawn45.fabricshieldlib.lib.object.FabricShield;
import net.minecraft.item.Item;
import net.minecraft.tag.ItemTags;

public class MItems {
	
	//Items
		//Food
	public static MItem cactus_stew;
	public static MItem carrot_soup;
	public static MItem chorus_fruit_stew;
	public static MItem nether_wart_stew;
	public static MItem potato_soup;
		//Crafting
	public static MItem knapped_flint;
		//Tools
			//Bone
	public static MItem bone_sword;
	public static MItem bone_axe;
	public static MItem bone_pickaxe;
	public static MItem bone_hoe;
			//Flint
	public static MItem flint_sword;
	public static MItem flint_axe;
	public static MItem flint_pickaxe;
	public static MItem flint_shovel;
	public static MItem flint_hoe;
			//Sandstone
	public static MItem sandstone_sword;
	public static MItem sandstone_axe;
	public static MItem sandstone_pickaxe;
	public static MItem sandstone_shovel;
	public static MItem sandstone_hoe;
			//Netherrack
	public static MItem netherrack_sword;
	public static MItem netherrack_axe;
	public static MItem netherrack_pickaxe;
	public static MItem netherrack_shovel;
	public static MItem netherrack_hoe;
			//End Stone
	public static MItem end_stone_sword;
	public static MItem end_stone_axe;
	public static MItem end_stone_pickaxe;
	public static MItem end_stone_shovel;
	public static MItem end_stone_hoe;
			//Shield
	public static MItem wooden_shield;
	
	public static void Init() {
		//Food
		cactus_stew = new MItem("cactus_stew", new MStewItem(new Item.Settings().group(Main.ITEM).food(MFoods.CACTUS_STEW)));
		carrot_soup = new MItem("carrot_soup", new MStewItem(new Item.Settings().group(Main.ITEM).food(MFoods.CARROT_SOUP)));
		chorus_fruit_stew = new MItem("chorus_fruit_stew", new MChorusStewItem(new Item.Settings().group(Main.ITEM).food(MFoods.CHORUS_FRUIT_STEW)));
		nether_wart_stew = new MItem("nether_wart_stew", new MStewItem(new Item.Settings().group(Main.ITEM).food(MFoods.NETHER_WART_STEW)));
		potato_soup = new MItem("potato_soup", new MStewItem(new Item.Settings().group(Main.ITEM).food(MFoods.POTATO_SOUP)));
		
		//Crafting
		knapped_flint = new MItem("knapped_flint", new Item(new Item.Settings().group(Main.ITEM)));
		
		//Tools
		bone_sword = new MItem("bone_sword", new MSwordItem(MToolMaterials.bone, new Item.Settings().group(Main.ITEM)));
		bone_axe = new MItem("bone_axe", new MAxeItem(MToolMaterials.bone, new Item.Settings().group(Main.ITEM)));
		bone_pickaxe = new MItem("bone_pickaxe", new MPickaxeItem(MToolMaterials.bone, new Item.Settings().group(Main.ITEM)));
		bone_hoe = new MItem("bone_hoe", new MHoeItem(MToolMaterials.bone, new Item.Settings().group(Main.ITEM)));
		
		flint_sword = new MItem("flint_sword", new MSwordItem(MToolMaterials.flint, new Item.Settings().group(Main.ITEM)));
		flint_axe = new MItem("flint_axe", new MAxeItem(MToolMaterials.flint, new Item.Settings().group(Main.ITEM)));
		flint_pickaxe = new MItem("flint_pickaxe", new MPickaxeItem(MToolMaterials.flint, new Item.Settings().group(Main.ITEM)));
		flint_shovel = new MItem("flint_shovel", new MShovelItem(MToolMaterials.flint, new Item.Settings().group(Main.ITEM)));
		flint_hoe = new MItem("flint_hoe", new MHoeItem(MToolMaterials.flint, new Item.Settings().group(Main.ITEM)));
		
		sandstone_sword = new MItem("sandstone_sword", new MSwordItem(MToolMaterials.sandstone, new Item.Settings().group(Main.ITEM)));
		sandstone_axe = new MItem("sandstone_axe", new MAxeItem(MToolMaterials.sandstone, new Item.Settings().group(Main.ITEM)));
		sandstone_pickaxe = new MItem("sandstone_pickaxe", new MPickaxeItem(MToolMaterials.sandstone, new Item.Settings().group(Main.ITEM)));
		sandstone_shovel = new MItem("sandstone_shovel", new MShovelItem(MToolMaterials.sandstone, new Item.Settings().group(Main.ITEM)));
		sandstone_hoe = new MItem("sandstone_hoe", new MHoeItem(MToolMaterials.sandstone, new Item.Settings().group(Main.ITEM)));
		
		netherrack_sword = new MItem("netherrack_sword", new MSwordItem(MToolMaterials.netherrack, new Item.Settings().group(Main.ITEM)));
		netherrack_axe = new MItem("netherrack_axe", new MAxeItem(MToolMaterials.netherrack, new Item.Settings().group(Main.ITEM)));
		netherrack_pickaxe = new MItem("netherrack_pickaxe", new MPickaxeItem(MToolMaterials.netherrack, new Item.Settings().group(Main.ITEM)));
		netherrack_shovel = new MItem("netherrack_shovel", new MShovelItem(MToolMaterials.netherrack, new Item.Settings().group(Main.ITEM)));
		netherrack_hoe = new MItem("netherrack_hoe", new MHoeItem(MToolMaterials.netherrack, new Item.Settings().group(Main.ITEM)));
		
		wooden_shield = new MItem("wooden_shield", new FabricShield(new Item.Settings().group(Main.ITEM), 100, 165, ItemTags.PLANKS));
	}
}
