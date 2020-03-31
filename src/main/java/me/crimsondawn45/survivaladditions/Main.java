package me.crimsondawn45.survivaladditions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.crimsondawn45.survivaladditions.init.ModBlocks;
import me.crimsondawn45.survivaladditions.init.ModFireManager;
import me.crimsondawn45.survivaladditions.init.ModItems;
import me.crimsondawn45.survivaladditions.object.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("cdsam")
public class Main 
{
	public static Main instance;
	public static final String MODID = "cdsam";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	public static final ItemGroup ITEM = new ModItemGroup(MODID + "_items", ()->(ModItems.flint_pickaxe));
	public static final ItemGroup BLOCK = new ModItemGroup(MODID + "_blocks", ()->(Item.BLOCK_TO_ITEM.get(ModBlocks.mud_bricks)));

	public Main() 
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		ModFireManager.init();
		
		LOGGER.info("Setup method registered.");
	}
}