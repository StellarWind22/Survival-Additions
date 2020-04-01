package me.crimsondawn45.cdsam.object;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.piston.PistonBehavior;

public class ModObsidianStairs extends StairsBlock
{
	public ModObsidianStairs(BlockState baseBlockState, Settings settings)
	{
		super(baseBlockState, settings);
	}
	
	@Override
	public PistonBehavior getPistonBehavior(BlockState state)
	{
		return PistonBehavior.BLOCK;
	}
}
