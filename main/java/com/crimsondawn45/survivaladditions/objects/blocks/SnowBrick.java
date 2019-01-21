package com.crimsondawn45.survivaladditions.objects.blocks;

import java.util.Random;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class SnowBrick extends Block implements IHasModel {

	public SnowBrick(String name ,Material material, SoundType sound,String tool, int harvestLvl, Float hard, Float resist) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setCreativeTab(Main.BLOCKS_TAB);
		setHardness(hard);
		setResistance(resist);
		setHarvestLevel(tool, harvestLvl);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.SNOW_BRICK);
    }

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
