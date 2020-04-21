package me.crimsondawn45.survivaladditions.object;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;

public class ModObsidianBlock extends Block {

	public ModObsidianBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public PushReaction getPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}
}
