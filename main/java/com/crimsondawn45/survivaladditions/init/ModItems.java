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
import com.crimsondawn45.survivaladditions.util.Reference;
import com.crimsondawn45.survivaladditions.util.handlers.ConfigHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
		//Tools
	public static final ToolMaterial MATERIAL_BONE = EnumHelper.addToolMaterial("material_bone", 0, 85, 2.5F, 0.5F, 30).setRepairItem(new ItemStack(ModItems.SHARPENED_BONE));
	public static final ToolMaterial MATERIAL_FLINT = EnumHelper.addToolMaterial("material_flint", 1, 100, 2.7F, 1.0F, 4).setRepairItem(new ItemStack(ModItems.SHARPENED_FLINT));
	public static final ToolMaterial MATERIAL_NETHERRACK = EnumHelper.addToolMaterial("material_netherrack", 0, 80, 3.0F, 1.5F, 25).setRepairItem(new ItemStack(Blocks.NETHERRACK));
	public static final ToolMaterial MATERIAL_QUARTZ = EnumHelper.addToolMaterial("material_quartz", 1, 90, 3.5F, 1.5F, 35).setRepairItem(new ItemStack(Items.QUARTZ));
	public static final ToolMaterial MATERIAL_SANDSTONE = EnumHelper.addToolMaterial("material_sandstone", 1, 100, 3.5F, 1.0F, 5).setRepairItem(new ItemStack(Blocks.SANDSTONE));
	public static final ToolMaterial MATERIAL_CLAY = EnumHelper.addToolMaterial("material_clay", 2, 25, 4.5F, 1.5F, 7);
	
	//Items
	public static final Item CHAIN = new ItemBase("chain");
		//Clay Tool Heads
	public static final Item CLAY_SWORD_HEAD = new ItemBase("clay_sword_head");
	public static final Item CLAY_PICKAXE_HEAD = new ItemBase("clay_pickaxe_head");
	public static final Item CLAY_AXE_HEAD = new ItemBase("clay_axe_head");
	public static final Item CLAY_HOE_HEAD = new ItemBase("clay_hoe_head");
	public static final Item CLAY_SHOVEL_HEAD = new ItemBase("clay_shovel_head");
		//Terracotta Tool Heads
	public static final Item TERRACOTTA_SWORD_HEAD = new ItemBase("terracotta_sword_head");
	public static final Item TERRACOTTA_PICKAXE_HEAD = new ItemBase("terracotta_pickaxe_head");
	public static final Item TERRACOTTA_AXE_HEAD = new ItemBase("terracotta_axe_head");
	public static final Item TERRACOTTA_HOE_HEAD = new ItemBase("terracotta_hoe_head");
	public static final Item TERRACOTTA_SHOVEL_HEAD = new ItemBase("terracotta_shovel_head");
	
	//Tools
	public static final ItemSword BONE_KNIFE = new ToolSword("bone_knife" ,MATERIAL_BONE);
	public static final ItemPickaxe BONE_PICK = new ToolPickaxe("bone_pick" ,MATERIAL_BONE);
	public static final ItemAxe BONE_HATCHET = new ToolAxe("bone_hatchet" ,MATERIAL_BONE, 6.5F, -3.0F);
	public static final ItemHoe BONE_HOE = new ToolHoe("bone_hoe" ,MATERIAL_BONE);

	public static final ItemSword FLINT_KNIFE = new FlintKnife("flint_knife" ,MATERIAL_FLINT);
	public static final ItemPickaxe FLINT_PICK = new FlintPick("flint_pick" ,MATERIAL_FLINT);
	public static final ItemAxe FLINT_HATCHET = new FlintHatchet("flint_hatchet" ,MATERIAL_FLINT, 7.0F, -3.2F);
	public static final ItemHoe FLINT_HOE = new ToolHoe("flint_hoe" ,MATERIAL_FLINT);
	public static final ItemSpade FLINT_SPADE = new ToolSpade("flint_spade" ,MATERIAL_FLINT);

	public static final ItemSword NETHERRACK_SWORD = new ToolSword("netherrack_sword", MATERIAL_NETHERRACK);
	public static final ItemPickaxe NETHERRACK_PICKAXE = new ToolPickaxe("netherrack_pickaxe", MATERIAL_NETHERRACK);
	public static final ItemAxe NETHERRACK_AXE = new ToolAxe("netherrack_axe", MATERIAL_NETHERRACK, 7.0F, -3.0F);
	public static final ItemHoe NETHERRACK_HOE = new ToolHoe("netherrack_hoe", MATERIAL_NETHERRACK);
	public static final ItemSpade NETHERRACK_SHOVEL = new ToolSpade("netherrack_shovel", MATERIAL_NETHERRACK);

	public static final ItemSword QUARTZ_KNIFE = new ToolSword("quartz_knife", MATERIAL_QUARTZ);
	public static final ItemPickaxe QUARTZ_PICK = new ToolPickaxe("quartz_pick", MATERIAL_QUARTZ);
	public static final ItemAxe QUARTZ_HATCHET = new ToolAxe("quartz_hatchet", MATERIAL_QUARTZ, 7.0F, -3.0F);
	public static final ItemHoe QUARTZ_HOE = new ToolHoe("quartz_hoe", MATERIAL_QUARTZ);
	public static final ItemSpade QUARTZ_SPADE = new ToolSpade("quartz_spade", MATERIAL_QUARTZ);

	public static final ItemSword SANDSTONE_SWORD = new ToolSword("sandstone_sword", MATERIAL_SANDSTONE);
	public static final ItemPickaxe SANDSTONE_PICKAXE = new ToolPickaxe("sandstone_pickaxe", MATERIAL_SANDSTONE);
	public static final ItemAxe SANDSTONE_AXE = new ToolAxe("sandstone_axe", MATERIAL_SANDSTONE, 7.0F, -3.0F);
	public static final ItemHoe SANDSTONE_HOE = new ToolHoe("sandstone_hoe", MATERIAL_SANDSTONE);
	public static final ItemSpade SANDSTONE_SHOVEL = new ToolSpade("sandstone_shovel", MATERIAL_SANDSTONE);

	public static final ItemSword TERRACOTTA_SWORD = new ToolSword("terracotta_sword" ,MATERIAL_CLAY);
	public static final ItemPickaxe TERRACOTTA_PICKAXE = new ToolPickaxe("terracotta_pickaxe" ,MATERIAL_CLAY);
	public static final ItemAxe TERRACOTTA_AXE = new ToolAxe("terracotta_axe" ,MATERIAL_CLAY, 8.5F, -3.2F);
	public static final ItemHoe TERRACOTTA_HOE = new ToolHoe("terracotta_hoe" ,MATERIAL_CLAY);
	public static final ItemSpade TERRACOTTA_SHOVEL = new ToolSpade("terracotta_shovel" ,MATERIAL_CLAY);
	
	//Shield
	public static final Item CRUDE_SHIELD = new ToolShield("crude_shield", 165);
	
	//Food
	public static final Item CACTUS_SOUP = new NauseaSoupBase("cactus_stew", 5, false);
	public static final Item NETHER_WART_SOUP = new NauseaSoupBase("nether_wart_stew", 5, false);
	public static final Item CARROT_SOUP = new SoupBase("carrot_soup", 8, false);
	public static final Item POTATO_SOUP = new SoupBase("potato_soup", 6, false);
}
