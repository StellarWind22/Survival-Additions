package com.crimsondawn45.survivaladditions;

import java.util.ArrayList;
import java.util.List;

import com.crimsondawn45.survivaladditions.init.ModFireList;
import com.crimsondawn45.survivaladditions.init.ModSmelting;
import com.crimsondawn45.survivaladditions.proxy.CommonProxy;
import com.crimsondawn45.survivaladditions.tabs.SurvivalTab;
import com.crimsondawn45.survivaladditions.util.Reference;
import com.crimsondawn45.survivaladditions.util.compat.OreDictionaryCompat;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.actors.threadpool.Arrays;

//Get Vars From Ref Class
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, useMetadata = false)
public class SurvivalAdditions {
	
	@Instance
	public static SurvivalAdditions instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs SURVIVAL_TAB = new SurvivalTab("survival_tab");
	
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
