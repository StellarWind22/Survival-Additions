package com.crimsondawn45.survivaladditions.objects.items.tools;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel{

	public ToolSpade(String name, ToolMaterial material) {
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
