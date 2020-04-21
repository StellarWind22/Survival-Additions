package me.crimsondawn45.survivaladditions.object;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.PushReaction;

public class ModObsidianStairs extends StairsBlock {

	public ModObsidianStairs(BlockState state, Properties properties) {
		super(state, properties);
	}
	
	@Override
	public PushReaction getPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}
}
