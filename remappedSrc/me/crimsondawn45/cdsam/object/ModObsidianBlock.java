package me.crimsondawn45.cdsam.object;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonBehavior;

public class ModObsidianBlock extends Block
{
	public ModObsidianBlock(Settings settings)
	{
		super(settings);
	}

	@Override
	public PistonBehavior getPistonBehavior(BlockState state)
	{
		return PistonBehavior.BLOCK;
	}
}
