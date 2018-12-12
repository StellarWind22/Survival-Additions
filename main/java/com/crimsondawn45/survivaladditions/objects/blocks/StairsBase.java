package com.crimsondawn45.survivaladditions.objects.blocks;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class StairsBase extends BlockStairs implements IHasModel {

	public StairsBase(String name ,Material material, SoundType sound,String tool, int harvestLvl, Float hard, Float resist, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setCreativeTab(Main.BLOCKS_TAB);
		setHardness(hard);
		setResistance(resist);
		setHarvestLevel(tool, harvestLvl);
		this.useNeighborBrightness = true;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	
	//Register Models
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
