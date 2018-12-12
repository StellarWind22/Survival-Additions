package com.crimsondawn45.survivaladditions.objects.items;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FoodBase extends ItemFood implements IHasModel{

	public FoodBase(String name, int amount, boolean isWolfFood, int stack) {
		super(amount,isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MISC_TAB);
		setMaxStackSize(stack);
		
			
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
