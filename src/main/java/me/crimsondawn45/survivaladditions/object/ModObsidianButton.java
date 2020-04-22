package me.crimsondawn45.survivaladditions.object;

import net.minecraft.block.BlockState;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.material.PushReaction;

public class ModObsidianButton extends StoneButtonBlock
{
	public ModObsidianButton(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public PushReaction getPushReaction(BlockState state)
	{
		return PushReaction.DESTROY;
	}
}
