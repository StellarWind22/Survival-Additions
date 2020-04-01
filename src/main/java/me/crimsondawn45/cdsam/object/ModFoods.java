package me.crimsondawn45.cdsam.object;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponent.Builder;

public class ModFoods {

	//Stews & Soups
	public static final FoodComponent CACTUS_STEW = food(6, 6.0F).build();
	public static final FoodComponent NETHER_WART_STEW = food(5, 6.0F).build();
	public static final FoodComponent CHORUS_FRUIT_STEW = food(8, 6.0F).alwaysEdible().build();
	public static final FoodComponent CARROT_SOUP = food(8, 6.0F).build();
	public static final FoodComponent POTATO_SOUP = food(7, 6.0F).build();
   
	//Food Method
	private static Builder food(int h, float s) {
		
		return (new FoodComponent.Builder()).hunger(h).saturationModifier(s);
	}
}