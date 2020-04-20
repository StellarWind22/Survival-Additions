package me.crimsondawn45.cdsam.util;

import net.minecraft.item.Item;

public class ModItem
{
	private String name;
	private Item item;
	
	public ModItem(String name, Item item)
	{
		this.name = name;
		this.item = item;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Item getItem()
	{
		return this.item;
	}
}
