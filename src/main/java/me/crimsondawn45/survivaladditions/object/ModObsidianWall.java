package me.crimsondawn45.survivaladditions.object;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.PushReaction;

public class ModObsidianWall extends WallBlock {

	public ModObsidianWall(Properties properties) {
		super(properties);
	}
	
	@Override
	public PushReaction getPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}
}
