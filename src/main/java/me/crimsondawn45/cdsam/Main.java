package me.crimsondawn45.cdsam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.crimsondawn45.cdsam.registry.MBlocks;
import me.crimsondawn45.cdsam.registry.MItems;
import me.crimsondawn45.cdsam.registry.MToolMaterials;
import me.crimsondawn45.cdsam.registry.MBlockMaterials;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
	
	public static final String MOD_ID = "cdsam";
	
	public static final ItemGroup ITEM = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "items"), () -> new ItemStack(MItems.flint_pickaxe.getItem()));
	public static final ItemGroup BLOCK = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "blocks"), () -> new ItemStack(MBlocks.mud_bricks.getBlock()));
	
	public static final Logger logger = LogManager.getLogger("Survival Additions");
	
	@Override
	public void onInitialize() {
		logger.info("Initializing...");
		MBlockMaterials.Init();
		logger.info("1/4 Initialized: Block Materials");
		MToolMaterials.Init();
		logger.info("2/4 Initialized: Tool Materials");
		MItems.Init();
		logger.info("3/4 Initialized: Items");
		MBlocks.Init();
		logger.info("4/4 Initialized: Blocks");
		logger.info("Finished Initialization...");
	}
}
