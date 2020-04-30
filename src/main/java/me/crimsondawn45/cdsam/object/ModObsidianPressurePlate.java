package me.crimsondawn45.cdsam.object;

import net.minecraft.block.PressurePlateBlock;

public class ModObsidianPressurePlate extends PressurePlateBlock
{
	public ModObsidianPressurePlate(Settings settings)
	{
		super(ActivationRule.MOBS, settings);
	}
	
	/*
	@Override
	public PistonBehavior getPistonBehavior(BlockState state)
	{
		return PistonBehavior.DESTROY;
	}
	*/
}
