package me.crimsondawn45.cdsam.util;

import me.crimsondawn45.cdsam.SurvivalAdditions;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;

public class ModBlockItem extends ModItem
{
	private ModBlock block;

	public ModBlockItem(ModBlock block, Settings settings)
	{
		super(block.getName(), new BlockItem(block.getBlock(), settings));
		
		this.block = block;
	}
	
	public ModBlockItem(ModBlock block)
	{
		super(block.getName(), new BlockItem(block.getBlock(), new Item.Settings().group(SurvivalAdditions.CDSAM_BLOCKS)));
		
		this.block = block;
	}
	
	public ModBlock getBlock()
	{
		return this.block;
	}
}
