package com.crimsondawn45.survivaladditions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.crimsondawn45.survivaladditions.init.ModFireList;
import com.crimsondawn45.survivaladditions.init.ModSmelting;
import com.crimsondawn45.survivaladditions.proxy.CommonProxy;
import com.crimsondawn45.survivaladditions.tabs.BlocksTab;
import com.crimsondawn45.survivaladditions.tabs.MiscTab;
import com.crimsondawn45.survivaladditions.tabs.ToolsTab;
import com.crimsondawn45.survivaladditions.util.Reference;
import com.crimsondawn45.survivaladditions.util.compat.OreDictionaryCompat;
import com.crimsondawn45.survivaladditions.util.handlers.ConfigHandler;
import com.crimsondawn45.survivaladditions.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import scala.actors.threadpool.Arrays;

//Get Vars From Ref Class
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, useMetadata = false)
public class SurvivalAdditions {
	
	public static File config;
	
	@Instance
	public static SurvivalAdditions instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs TOOLS_TAB = new ToolsTab("csam_tools");
	public static final CreativeTabs BLOCKS_TAB = new BlocksTab("csam_blocks");
	public static final CreativeTabs MISC_TAB = new MiscTab("csam_misc");
	
	//Pre Init Event
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		//Virtual mcmod.info file
		event.getModMetadata().modId = Reference.MOD_ID;
		event.getModMetadata().version = Reference.VERSION;
		event.getModMetadata().name = Reference.NAME;
		event.getModMetadata().authorList.set(0,"CrimsonDawn45");
		event.getModMetadata().description = Reference.DESCRIPTION;
		event.getModMetadata().url = Reference.URL;
		event.getModMetadata().logoFile = Reference.LOGO;
		event.getModMetadata().credits = Reference.CREDITS;
		
		//ConfigHandler.registerConfig(event);
	}
	
	//Init Event
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		OreDictionaryCompat.init();
		
		ModSmelting.init();
		ModFireList.init();
	}
	
	//Post Init Event
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
			
	}
}
