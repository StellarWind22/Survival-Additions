package com.crimsondawn45.survivaladditions.util.handlers;

import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolAxe;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolHoe;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolPickaxe;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolSpade;
import com.crimsondawn45.survivaladditions.objects.items.tools.ToolSword;
import com.crimsondawn45.survivaladditions.objects.items.tools.flint.FlintHatchet;
import com.crimsondawn45.survivaladditions.objects.items.tools.flint.FlintKnife;
import com.crimsondawn45.survivaladditions.objects.items.tools.flint.FlintPick;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class OptionalTools {

	public static void checkAndRegister() {
		
		boolean flintEnabled = ConfigHandler.enableFlintTools;
		boolean boneEnabled = ConfigHandler.enableBoneTools;
		boolean clayEnabled = ConfigHandler.enableClayTools;
		boolean sandstoneEnabled = ConfigHandler.enableSandstoneTools;
		boolean netherrackEnabled = ConfigHandler.enableNetherrackTools;
		boolean quartzEnabled = ConfigHandler.enableQuartzTools;
		
		if(boneEnabled) {
			final ToolMaterial MATERIAL_BONE = EnumHelper.addToolMaterial("material_bone", 0, 85, 2.5F, 0.5F, 30).setRepairItem(new ItemStack(ModItems.SHARPENED_BONE));
			
			final ItemSword BONE_KNIFE = new ToolSword("bone_knife" ,MATERIAL_BONE);
			final ItemPickaxe BONE_PICK = new ToolPickaxe("bone_pick" ,MATERIAL_BONE);
			final ItemAxe BONE_HATCHET = new ToolAxe("bone_hatchet" ,MATERIAL_BONE, 6.5F, -3.0F);
			final ItemHoe BONE_HOE = new ToolHoe("bone_hoe" ,MATERIAL_BONE);
		}
		
			//Flint
		if(flintEnabled) {
			final ToolMaterial MATERIAL_FLINT = EnumHelper.addToolMaterial("material_flint", 1, 100, 2.7F, 1.0F, 4).setRepairItem(new ItemStack(ModItems.SHARPENED_FLINT));
			
			final ItemSword FLINT_KNIFE = new FlintKnife("flint_knife" ,MATERIAL_FLINT);
			final ItemPickaxe FLINT_PICK = new FlintPick("flint_pick" ,MATERIAL_FLINT);
			final ItemAxe FLINT_HATCHET = new FlintHatchet("flint_hatchet" ,MATERIAL_FLINT, 7.0F, -3.2F);
			final ItemHoe FLINT_HOE = new ToolHoe("flint_hoe" ,MATERIAL_FLINT);
			final ItemSpade FLINT_SPADE = new ToolSpade("flint_spade" ,MATERIAL_FLINT);
		}
		
		if(netherrackEnabled) {
			final ToolMaterial MATERIAL_NETHERRACK = EnumHelper.addToolMaterial("material_netherrack", 0, 80, 3.0F, 1.5F, 25).setRepairItem(new ItemStack(Blocks.NETHERRACK));
			
			final ItemSword NETHERRACK_SWORD = new ToolSword("netherrack_sword", MATERIAL_NETHERRACK);
			final ItemPickaxe NETHERRACK_PICKAXE = new ToolPickaxe("netherrack_pickaxe", MATERIAL_NETHERRACK);
			final ItemAxe NETHERRACK_AXE = new ToolAxe("netherrack_axe", MATERIAL_NETHERRACK, 7.0F, -3.0F);
			final ItemHoe NETHERRACK_HOE = new ToolHoe("netherrack_hoe", MATERIAL_NETHERRACK);
			final ItemSpade NETHERRACK_SHOVEL = new ToolSpade("netherrack_shovel", MATERIAL_NETHERRACK);
		}
		
		if(quartzEnabled) {
			final ToolMaterial MATERIAL_QUARTZ = EnumHelper.addToolMaterial("material_quartz", 1, 90, 3.5F, 1.5F, 35).setRepairItem(new ItemStack(Items.QUARTZ));
			
			final ItemSword QUARTZ_SWORD = new ToolSword("quartz_sword", MATERIAL_QUARTZ);
			final ItemPickaxe QUARTZ_PICKAXE = new ToolPickaxe("quartz_pickaxe", MATERIAL_QUARTZ);
			final ItemAxe QUARTZ_AXE = new ToolAxe("quartz_axe", MATERIAL_QUARTZ, 7.0F, -3.0F);
			final ItemHoe QUARTZ_HOE = new ToolHoe("quartz_hoe", MATERIAL_QUARTZ);
			final ItemSpade QUARTZ_SHOVEL = new ToolSpade("quartz_shovel", MATERIAL_QUARTZ);
		}
		
		if(sandstoneEnabled) {
			final ToolMaterial MATERIAL_SANDSTONE = EnumHelper.addToolMaterial("material_sandstone", 1, 100, 3.5F, 1.0F, 5).setRepairItem(new ItemStack(Blocks.SANDSTONE));
			
			final ItemSword SANDSTONE_SWORD = new ToolSword("sandstone_sword", MATERIAL_SANDSTONE);
			final ItemPickaxe SANDSTONE_PICKAXE = new ToolPickaxe("sandstone_pickaxe", MATERIAL_SANDSTONE);
			final ItemAxe SANDSTONE_AXE = new ToolAxe("sandstone_axe", MATERIAL_SANDSTONE, 7.0F, -3.0F);
			final ItemHoe SANDSTONE_HOE = new ToolHoe("sandstone_hoe", MATERIAL_SANDSTONE);
			final ItemSpade SANDSTONE_SHOVEL = new ToolSpade("sandstone_shovel", MATERIAL_SANDSTONE);
		}
		
		if(clayEnabled) {
			final ToolMaterial MATERIAL_CLAY = EnumHelper.addToolMaterial("material_clay", 2, 25, 4.5F, 1.5F, 7);
			
			final ItemSword TERRACOTTA_SWORD = new ToolSword("terracotta_sword" ,MATERIAL_CLAY);
			final ItemPickaxe TERRACOTTA_PICKAXE = new ToolPickaxe("terracotta_pickaxe" ,MATERIAL_CLAY);
			final ItemAxe TERRACOTTA_AXE = new ToolAxe("terracotta_axe" ,MATERIAL_CLAY, 8.5F, -3.2F);
			final ItemHoe TERRACOTTA_HOE = new ToolHoe("terracotta_hoe" ,MATERIAL_CLAY);
			final ItemSpade TERRACOTTA_SHOVEL = new ToolSpade("terracotta_shovel" ,MATERIAL_CLAY);
		}
	}
}
