package com.crimsondawn45.survivaladditions.util.handlers;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@EventBusSubscriber
public class RegistryHandler {

	//Item Register Event
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
		//Create Object
		ItemBlock mudSlab = new ItemSlab(ModBlocks.MUD_BRICK_HALF_SLAB, ModBlocks.MUD_BRICK_HALF_SLAB, (BlockSlab) ModBlocks.MUD_BRICK_DOUBLE_SLAB);
		ItemBlock scrapSlab = new ItemSlab(ModBlocks.SCRAP_WOOD_HALF_SLAB, ModBlocks.SCRAP_WOOD_HALF_SLAB, (BlockSlab) ModBlocks.SCRAP_WOOD_DOUBLE_SLAB);
		
		//RegistryName
		mudSlab.setRegistryName(ModBlocks.MUD_BRICK_HALF_SLAB.getRegistryName());
		scrapSlab.setRegistryName(ModBlocks.SCRAP_WOOD_HALF_SLAB.getRegistryName());
		
		//Register
		event.getRegistry().register(mudSlab);
		event.getRegistry().register(scrapSlab);
	}
	
	//Block Register Event
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		//Register Item Models
		for(Item item : ModItems.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		//Register Block Models
		for(Block block : ModBlocks.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
}
