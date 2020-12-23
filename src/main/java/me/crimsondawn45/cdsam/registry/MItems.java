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
			//Flint
	public static MItem flint_sword;
	public static MItem flint_axe;
	public static MItem flint_pickaxe;
	public static MItem flint_shovel;
	public static MItem flint_hoe;
			//Bone
	
	
	public static void Init() {
		cactus_stew = new MItem("cactus_stew", new MushroomStewItem(m_item_s.food(MFoods.CACTUS_STEW)));
		carrot_soup = new MItem("carrot_soup", new MushroomStewItem(m_item_s.food(MFoods.CARROT_SOUP)));
		chorus_fruit_stew = new MItem("chorus_fruit_stew", new MChorusStewItem(m_item_s.food(MFoods.CHORUS_FRUIT_STEW)));
		nether_wart_stew = new MItem("nether_wart_stew", new MushroomStewItem(m_item_s.food(MFoods.NETHER_WART_STEW)));
		potato_soup = new MItem("potato_soup", new MushroomStewItem(m_item_s.food(MFoods.POTATO_SOUP)));
		
		flint_sword = new MItem("flint_sword", new MSwordItem(MToolMaterials.flint, m_item_s));
		flint_axe = new MItem("flint_axe", new MAxeItem(MToolMaterials.flint, m_item_s));
		flint_pickaxe = new MItem("flint_pickaxe", new MAxeItem(MToolMaterials.flint, m_item_s));
		flint_shovel = new MItem("flint_shovel", new MShovelItem(MToolMaterials.flint, m_item_s));
		flint_hoe = new MItem("flint_shovel", new MHoeItem(MToolMaterials.flint, m_item_s));
	}
}
