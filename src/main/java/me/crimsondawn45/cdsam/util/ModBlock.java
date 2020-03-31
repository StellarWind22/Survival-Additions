package me.crimsondawn45.cdsam.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModBlock
{
	private String name;
	private Item item;
	private Block block;
	
	public ModBlock(String name, Block block)
	{
		this.name = name;
		this.block = block;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Block getBlock()
	{
		return this.block;
	}
	
	public Item getItem()
	{
		return this.item;
	}
}
