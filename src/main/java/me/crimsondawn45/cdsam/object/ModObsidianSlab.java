package me.crimsondawn45.cdsam.object;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.piston.PistonBehavior;

public class ModObsidianSlab extends SlabBlock
{
	public ModObsidianSlab(Settings settings)
	{
		super(settings);
	}
	
	@Override
	public PistonBehavior getPistonBehavior(BlockState state)
	{
		return PistonBehavior.BLOCK;
	}
}
