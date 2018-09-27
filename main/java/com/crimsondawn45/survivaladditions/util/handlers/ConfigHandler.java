package com.crimsondawn45.survivaladditions.util.handlers;

import java.io.File;

import com.crimsondawn45.survivaladditions.SurvivalAdditions;
import com.crimsondawn45.survivaladditions.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {

	public static Configuration config;
	
	public static boolean enableFlintTools;
	public static boolean enableBoneTools;
	public static boolean enableClayTools;
	public static boolean enableNetherrackTools;
	public static boolean enableQuartzTools;
	public static boolean enableSandstoneTools;
	
	//Config File
	public static void init(File file) {
		config = new Configuration(file);
		
		String category;
		category = "Tools";
		config.addCustomCategoryComment(category, "Enable or disable tool types");
		
		enableFlintTools = config.getBoolean("Enable Flint Tools", category, true, "toggle flint tools doesnt affect flint crafting items");
		enableBoneTools = config.getBoolean("Enable Bone Tools", category, true, "toggle bone tools doesnt affect bone crafting items");
		enableClayTools = config.getBoolean("Enable Clay Tools", category, true, "toggle clay tools doesnt affect clay crafting items");
		enableNetherrackTools = config.getBoolean("Enable Netherrack Tools", category, true, "toggle netherrack tools doesnt affect netherrack crafting items");
		enableQuartzTools = config.getBoolean("Enable Quartz Tools", category, true, "toggle quartz tools doesnt affect quartz crafting items");
		enableSandstoneTools = config.getBoolean("Enable Sandstone Tools", category, true, "toggle sandstone tools doesnt affect sandstone crafting items");
		
		config.save();
	}
	
	//Register Config FIle
	public static void registerConfig(FMLPreInitializationEvent event) {
		SurvivalAdditions.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		SurvivalAdditions.config.mkdir();
		init(new File(SurvivalAdditions.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
	
}
