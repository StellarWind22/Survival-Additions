package me.crimsondawn45.cdsam.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import net.minecraft.block.Block;
import net.minecraft.block.FireBlock;

@Mixin(FireBlock.class)
public class FireBlockMixin
{
	@Inject(at = { @At(value = "HEAD") }, method = { "" })
	public void registerFlammableBlock(Block block, int burnChance, int spreadChance)
	{
      
	}
}
