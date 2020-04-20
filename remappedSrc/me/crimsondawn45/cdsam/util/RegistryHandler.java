package me.crimsondawn45.cdsam.util;

import me.crimsondawn45.cdsam.SurvivalAdditions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHandler
{
	public static void registerItems(ModItem...items)
	{
		for(ModItem item : items)
		{
			Registry.register(Registry.ITEM, new Identifier(SurvivalAdditions.MOD_ID, item.getName()), item.getItem());
		}
	}
	
	public static void registerBlocks(ModBlock...blocks)
	{
		for(ModBlock block : blocks)
		{
			Registry.register(Registry.BLOCK, new Identifier(SurvivalAdditions.MOD_ID, block.getName()), block.getBlock());
		}
	}
}
