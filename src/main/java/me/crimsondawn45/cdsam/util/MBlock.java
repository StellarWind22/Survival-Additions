package me.crimsondawn45.cdsam.util;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;

public class MBlock extends MItem {
	
	private Block block;
	
	public MBlock(String name, BlockItem item) {
		super(name, item);
		this.block = item.getBlock();
		
		Registry.register(Registry.BLOCK, this.getId(), this.getBlock());
	}
	
	public Block getBlock() {
		return this.block;
	}
}
