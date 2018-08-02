package com.crimsondawn45.survivaladditions.tabs;

import com.crimsondawn45.survivaladditions.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MiscTab extends CreativeTabs {

	public MiscTab(String label) {
		super(label);
		this.setBackgroundImageName("csam_misc.png");
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.TERRACOTTA_PICKAXE_HEAD); 
	}
}
