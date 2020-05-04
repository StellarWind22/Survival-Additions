package me.crimsondawn45.cdsam.util;

import java.util.ArrayList;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class FlammabilityManager
{
	public static final ArrayList<ModBlock> flammableBlocks = new ArrayList<ModBlock>();
	
	public static void init()
	{
		FlammableBlockRegistry flammableBlockRegistry = FlammableBlockRegistry.getDefaultInstance();
		
		for(ModBlock block : flammableBlocks)
		{	
			switch(block.getFlammabilityType())
			{
				case LOG:
					flammableBlockRegistry.add(block.getBlock(), 5, 5);
					break;
				
				case CLOTH:
					flammableBlockRegistry.add(block.getBlock(), 30, 60);
					break;
				
				case THIN_CLOTH:
					flammableBlockRegistry.add(block.getBlock(), 60, 20);
					break;
				
				case PLANKS:
					flammableBlockRegistry.add(block.getBlock(), 5, 20);
					break;
				
				case PLANT:
					flammableBlockRegistry.add(block.getBlock(), 60, 100);
					break;
			}
		}
	}
}
