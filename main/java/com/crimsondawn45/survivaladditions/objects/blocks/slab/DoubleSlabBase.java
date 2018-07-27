package com.crimsondawn45.survivaladditions.objects.blocks.slab;

import java.util.Random;

import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class DoubleSlabBase extends SlabBase{
	
	public DoubleSlabBase(String name, Material material, SoundType sound, String tool, int harvestLvl, Float hard, Float resist) {
		super(name, material, sound, tool, harvestLvl, hard, resist);
	}
	
	//Is Double
	public boolean isDouble()
    {
        return true;
    }
	
	//Get Drop Item
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		Block halfSlab = BlockSlab.getBlockFromName(this.getRegistryName().toString().replace("_double", ""));
		
        return Item.getItemFromBlock(halfSlab);
  	}
	
	//Drop Quantity
	public int getQuantityDropped() {
		return 2;
	}
}
