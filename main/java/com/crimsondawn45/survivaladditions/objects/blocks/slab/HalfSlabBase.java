package com.crimsondawn45.survivaladditions.objects.blocks.slab;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class HalfSlabBase extends SlabBase{

	public HalfSlabBase(String name, Material material, SoundType sound, String tool, int harvestLvl, Float hard, Float resist) {
		super(name, material, sound, tool, harvestLvl, hard, resist);
		this.useNeighborBrightness = true;
	}
	
	public boolean isDouble()
    {
        return false;
    }

}
