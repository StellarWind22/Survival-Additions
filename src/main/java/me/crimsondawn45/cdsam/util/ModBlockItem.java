package me.crimsondawn45.cdsam.util;

import net.minecraft.item.Item;

public class ModBlockItem extends ModItem
{
	private ModBlock block;

	public ModBlockItem(ModBlock block, Item item)
	{
		super(block.getName(), item);
		
		this.block = block;
	}
	
	public ModBlock getBlock()
	{
		return this.block;
	}
}
