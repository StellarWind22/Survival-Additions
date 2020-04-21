package me.crimsondawn45.survivaladditions.object;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.PushReaction;

public class ModObsidianSlab extends SlabBlock {

	public ModObsidianSlab(Properties properties) {
		super(properties);
	}
	
	@Override
	public PushReaction getPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}
}
