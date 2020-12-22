package me.crimsondawn45.cdsam.registry;

import me.crimsondawn45.cdsam.util.MBlock;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.item.BlockItem;

public class MFlamBlock extends MBlock {

	public MFlamBlock(String name, BlockItem item, int burn, int spread) {
		super(name, item);
		FlammableBlockRegistry.getDefaultInstance().add(item.getBlock(), burn, spread);
	}
}
