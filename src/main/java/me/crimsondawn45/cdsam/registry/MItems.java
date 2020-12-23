package me.crimsondawn45.cdsam.registry;

import me.crimsondawn45.cdsam.Main;
import me.crimsondawn45.cdsam.object.MAxeItem;
import me.crimsondawn45.cdsam.object.MChorusStewItem;
import me.crimsondawn45.cdsam.object.MHoeItem;
import me.crimsondawn45.cdsam.object.MShovelItem;
import me.crimsondawn45.cdsam.object.MSwordItem;
import me.crimsondawn45.cdsam.util.MItem;
import net.minecraft.item.Item;
import net.minecraft.item.MushroomStewItem;

public class MItems {
	
	//Settings
	private static Item.Settings m_item_s = new Item.Settings().group(Main.ITEM);
	//Items
		//Food
	public static MItem cactus_stew;
	public static MItem carrot_soup;
	public static MItem chorus_fruit_stew;
	public static MItem nether_wart_stew;
	public static MItem potato_soup;
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
	
	public static void Init() {
		cactus_stew = new MItem("cactus_stew", new MushroomStewItem(m_item_s.food(MFoods.CACTUS_STEW)));
		carrot_soup = new MItem("carrot_soup", new MushroomStewItem(m_item_s.food(MFoods.CARROT_SOUP)));
		chorus_fruit_stew = new MItem("chorus_fruit_stew", new MChorusStewItem(m_item_s.food(MFoods.CHORUS_FRUIT_STEW)));
		nether_wart_stew = new MItem("nether_wart_stew", new MushroomStewItem(m_item_s.food(MFoods.NETHER_WART_STEW)));
		potato_soup = new MItem("potato_soup", new MushroomStewItem(m_item_s.food(MFoods.POTATO_SOUP)));
		
		bone_sword = new MItem("bone_sword", new MSwordItem(MToolMaterials.bone, m_item_s));
		bone_axe = new MItem("bone_axe", new MAxeItem(MToolMaterials.bone, m_item_s));
		bone_pickaxe = new MItem("bone_pickaxe", new MAxeItem(MToolMaterials.bone, m_item_s));
		bone_hoe = new MItem("bone_hoe", new MHoeItem(MToolMaterials.bone, m_item_s));
		
		flint_sword = new MItem("flint_sword", new MSwordItem(MToolMaterials.flint, m_item_s));
		flint_axe = new MItem("flint_axe", new MAxeItem(MToolMaterials.flint, m_item_s));
		flint_pickaxe = new MItem("flint_pickaxe", new MAxeItem(MToolMaterials.flint, m_item_s));
		flint_shovel = new MItem("flint_shovel", new MShovelItem(MToolMaterials.flint, m_item_s));
		flint_hoe = new MItem("flint_hoe", new MHoeItem(MToolMaterials.flint, m_item_s));
		
		sandstone_sword = new MItem("sandstone_sword", new MSwordItem(MToolMaterials.sandstone, m_item_s));
		sandstone_axe = new MItem("sandstone_axe", new MAxeItem(MToolMaterials.sandstone, m_item_s));
		sandstone_pickaxe = new MItem("sandstone_pickaxe", new MAxeItem(MToolMaterials.sandstone, m_item_s));
		sandstone_shovel = new MItem("sandstone_shovel", new MShovelItem(MToolMaterials.sandstone, m_item_s));
		sandstone_hoe = new MItem("sandstone_hoe", new MHoeItem(MToolMaterials.sandstone, m_item_s));
		
		netherrack_sword = new MItem("netherrack_sword", new MSwordItem(MToolMaterials.netherrack, m_item_s));
		netherrack_axe = new MItem("netherrack_axe", new MAxeItem(MToolMaterials.netherrack, m_item_s));
		netherrack_pickaxe = new MItem("netherrack_pickaxe", new MAxeItem(MToolMaterials.netherrack, m_item_s));
		netherrack_shovel = new MItem("netherrack_shovel", new MShovelItem(MToolMaterials.netherrack, m_item_s));
		netherrack_hoe = new MItem("netherrack_hoe", new MHoeItem(MToolMaterials.netherrack, m_item_s));
	}
}
