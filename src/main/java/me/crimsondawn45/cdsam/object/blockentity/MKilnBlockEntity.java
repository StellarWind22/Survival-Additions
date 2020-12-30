package me.crimsondawn45.cdsam.object.blockentity;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class MKilnBlockEntity extends AbstractFurnaceBlockEntity {
	
	private static final TranslatableText NAME = new TranslatableText("container.cdsam.kiln");

	public MKilnBlockEntity(BlockEntityType<?> blockEntityType, RecipeType<? extends AbstractCookingRecipe> recipeType) {
		super(blockEntityType, recipeType);
	}

	@Override
	public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return null;
	}

	@Override
	public Text getContainerName() {
		//return this.NAME.;
		return null;
	}
}
