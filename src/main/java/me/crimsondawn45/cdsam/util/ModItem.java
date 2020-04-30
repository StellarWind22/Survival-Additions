package me.crimsondawn45.cdsam.util;

import me.crimsondawn45.cdsam.SurvivalAdditions;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem
{
	private String name;
	private Item item;
	
	public ModItem(String name, Item item)
	{
		this.name = name;
		this.item = item;
		
		Registry.register(Registry.ITEM, new Identifier(SurvivalAdditions.MOD_ID, this.name), this.item);
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
