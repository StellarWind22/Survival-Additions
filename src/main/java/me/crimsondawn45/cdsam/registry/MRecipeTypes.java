package me.crimsondawn45.cdsam.registry;

import net.minecraft.recipe.RecipeType;

public class MRecipeTypes {
	
	
	//TODO fix type later
	public static RecipeType<?> kiln;
	
	//Initialization
	public static void init() {
		kiln = RecipeType.register("kiln");
	}
}
