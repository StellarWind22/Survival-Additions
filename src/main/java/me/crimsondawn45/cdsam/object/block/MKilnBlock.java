package me.crimsondawn45.cdsam.object.block;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class MKilnBlock extends AbstractFurnaceBlock {

	public MKilnBlock(Settings settings) {
		super(settings);
	}

	@Override
	public BlockEntity createBlockEntity(BlockView arg0) {
		//return new MKilnBlockEntity(null, RecipeType.);
		return null;
	}

	@Override
	public void openScreen(World world, BlockPos pos, PlayerEntity player) {
		// TODO Auto-generated method stub

	}

}
