package com.crimsondawn45.survivaladditions.tabs;

import com.crimsondawn45.survivaladditions.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ToolsTab extends CreativeTabs {

	public ToolsTab(String label) {
		super(label);
		this.setBackgroundImageName("csam_tools.png");
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.FLINT_PICK); 
	}
}
