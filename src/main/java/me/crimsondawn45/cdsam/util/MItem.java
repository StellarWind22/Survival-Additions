package me.crimsondawn45.cdsam.util;

import me.crimsondawn45.cdsam.Main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MItem {
	
	private Item item;
	private Identifier id;
	
	public MItem(String name, Item item) {
		this.id = new Identifier(Main.MOD_ID, name);
		this.item = item;
		Registry.register(Registry.ITEM, this.id, this.item);
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public Identifier getId() {
		return this.id;
	}
}
