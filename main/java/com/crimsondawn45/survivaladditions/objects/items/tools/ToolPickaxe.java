package com.crimsondawn45.survivaladditions.objects.items.tools;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{
	
	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TOOLS_TAB);
			
		ModItems.ITEMS.add(this);
		}
		
		@Override
		public void registerModels() {
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
}
