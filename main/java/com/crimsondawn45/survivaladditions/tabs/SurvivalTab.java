package com.crimsondawn45.survivaladditions.tabs;

import com.crimsondawn45.survivaladditions.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SurvivalTab extends CreativeTabs {

	public SurvivalTab(String label) {
		super(label);
		this.setBackgroundImageName("csam.png");
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FLINT_PICK); 
	}
}
