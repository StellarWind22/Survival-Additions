package me.crimsondawn45.survivaladditions.init;

import net.minecraft.item.Food;
import net.minecraft.item.Food.Builder;

public class ModFoods {

	//Stews & Soups
	public static final Food CACTUS_STEW = food(6, 6.0F).build();
	public static final Food NETHER_WART_STEW = food(5, 6.0F).build();
	public static final Food CHORUS_FRUIT_STEW = food(8, 6.0F).setAlwaysEdible().build();
	public static final Food CARROT_SOUP = food(8, 6.0F).build();
	public static final Food POTATO_SOUP = food(7, 6.0F).build();
   
	//Food Method
	private static Builder food(int h, float s) {
		
		return (new Food.Builder()).hunger(h).saturation(s);
	}
}