package me.crimsondawn45.cdsam.util;

import me.crimsondawn45.cdsam.SurvivalAdditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock
{
	private String name;
	private Item item;
	private Block block;
	
	public ModBlock(String name, Block block)
	{
		this.name = name;
		this.block = block;
		
		Registry.register(Registry.BLOCK, new Identifier(SurvivalAdditions.MOD_ID, this.name), this.block);
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
