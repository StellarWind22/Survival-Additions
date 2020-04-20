package me.crimsondawn45.cdsam.object;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.block.piston.PistonBehavior;

public class ModObsidianWall extends WallBlock
{
	public ModObsidianWall(Settings settings)
	{
		super(settings);
	}
	
	@Override
	public PistonBehavior getPistonBehavior(BlockState state)
	{
		return PistonBehavior.BLOCK;
	}
}
