package com.crimsondawn45.survivaladditions.init;

import java.util.ArrayList;
import java.util.List;

import com.crimsondawn45.survivaladditions.objects.items.ItemBase;
import com.crimsondawn45.survivaladditions.objects.items.foods.NauseaSoupBase;
import com.crimsondawn45.survivaladditions.objects.items.foods.SoupBase;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolAxe;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolHoe;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolPickaxe;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolShield;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolSpade;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolSword;
import com.crimsondawn45.survivaladditions.objects.items.tools.flint.FlintHatchet;
import com.crimsondawn45.survivaladditions.objects.items.tools.flint.FlintKnife;
import com.crimsondawn45.survivaladditions.objects.items.tools.flint.FlintPick;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Crafting Items
	public static final Item SHARPENED_BONE = new ItemBase("sharpened_bone");
	public static final Item SHARPENED_FLINT = new ItemBase("sharpened_flint");
	
	//Materials
	public static final ToolMaterial MATERIAL_BONE = EnumHelper.addToolMaterial("material_bone", 0, 85, 2.5F, 0.5F, 30).setRepairItem(new ItemStack(SHARPENED_BONE));
	public static final ToolMaterial MATERIAL_FLINT = EnumHelper.addToolMaterial("material_flint", 1, 100, 2.7F, 1.0F, 4).setRepairItem(new ItemStack(SHARPENED_FLINT));
	public static final ToolMaterial MATERIAL_WET_CLAY = EnumHelper.addToolMaterial("material_wet_clay", 0, 4, 0.4F, -1.5F, 5).setRepairItem(new ItemStack(Items.CLAY_BALL));
	public static final ToolMaterial MATERIAL_CLAY = EnumHelper.addToolMaterial("material_clay", 2, 25, 4.5F, 1.5F, 7);
	
	//Items
	public static final Item CHAIN = new ItemBase("chain");
	
	//Tools
		//Bone
	public static final ItemSword BONE_KNIFE = new ToolSword("bone_knife" ,MATERIAL_BONE);
	public static final ItemPickaxe BONE_PICK = new ToolPickaxe("bone_pick" ,MATERIAL_BONE);
	public static final ItemAxe BONE_HATCHET = new ToolAxe("bone_hatchet" ,MATERIAL_BONE, 6.5F, -3.0F);
	public static final ItemHoe BONE_HOE = new ToolHoe("bone_hoe" ,MATERIAL_BONE);
		//Flint
	public static final ItemSword FLINT_KNIFE = new FlintKnife("flint_knife" ,MATERIAL_FLINT);
	public static final ItemPickaxe FLINT_PICK = new FlintPick("flint_pick" ,MATERIAL_FLINT);
	public static final ItemAxe FLINT_HATCHET = new FlintHatchet("flint_hatchet" ,MATERIAL_FLINT, 7.0F, -3.2F);
	public static final ItemHoe FLINT_HOE = new ToolHoe("flint_hoe" ,MATERIAL_FLINT);
	public static final ItemSpade FLINT_SPADE = new ToolSpade("flint_spade" ,MATERIAL_FLINT);
		//Wet Clay
	public static final ItemSword WET_CLAY_SWORD = new ToolSword("wet_clay_sword" ,MATERIAL_WET_CLAY);
	public static final ItemPickaxe WET_CLAY_PICKAXE = new ToolPickaxe("wet_clay_pickaxe" ,MATERIAL_WET_CLAY);
	public static final ItemAxe WET_CLAY_AXE = new ToolAxe("wet_clay_axe" ,MATERIAL_WET_CLAY, 3.5F, -3.2F);
	public static final ItemHoe WET_CLAY_HOE = new ToolHoe("wet_clay_hoe" ,MATERIAL_WET_CLAY);
	public static final ItemSpade WET_CLAY_SHOVEL = new ToolSpade("wet_clay_shovel" ,MATERIAL_WET_CLAY);
		//Clay
	public static final ItemSword CLAY_SWORD = new ToolSword("clay_sword" ,MATERIAL_CLAY);
	public static final ItemPickaxe CLAY_PICKAXE = new ToolPickaxe("clay_pickaxe" ,MATERIAL_CLAY);
	public static final ItemAxe CLAY_AXE = new ToolAxe("clay_axe" ,MATERIAL_CLAY, 8.5F, -3.2F);
	public static final ItemHoe CLAY_HOE = new ToolHoe("clay_hoe" ,MATERIAL_CLAY);
	public static final ItemSpade CLAY_SHOVEL = new ToolSpade("clay_shovel" ,MATERIAL_CLAY);
	
	//Shield
	public static final Item CRUDE_SHIELD = new ToolShield("crude_shield", 165);
	
	//Food
	public static final Item CACTUS_SOUP = new NauseaSoupBase("cactus_stew", 5, false);
	public static final Item CARROT_SOUP = new SoupBase("carrot_soup", 8, false);
	public static final Item POTATO_SOUP = new SoupBase("potato_soup", 6, false);
	
}
