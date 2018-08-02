package com.crimsondawn45.survivaladditions.tabs;

import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs {

	public BlocksTab(String label) {
		super(label);
		this.setBackgroundImageName("csam_blocks.png");
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.MUD_BRICK); 
	}
}
