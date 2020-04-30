package me.crimsondawn45.cdsam.mixin;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import me.crimsondawn45.cdsam.list.ModBlocks;
import me.crimsondawn45.cdsam.util.FlammabilityType;
import me.crimsondawn45.cdsam.util.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FireBlock;

@Mixin(FireBlock.class)
public class FireBlockMixin
{
	@Shadow @Final private final Object2IntMap<Block> burnChances = new Object2IntOpenHashMap<Block>();
	@Shadow @Final private final Object2IntMap<Block> spreadChances = new Object2IntOpenHashMap<Block>();
	
	@Inject(at = @At("HEAD"), method = "registerDefaultFlammables")
	private void registerDefaultFlammables(CallbackInfo info)
	{
		setFireInfo(ModBlocks.scrap_planks, FlammabilityType.PLANKS);
		setFireInfo(ModBlocks.scrap_stairs, FlammabilityType.PLANKS);
		setFireInfo(ModBlocks.scrap_slab, FlammabilityType.PLANKS);
	}
	
	private void setFireInfo(ModBlock modBlock, FlammabilityType flammabilityType)
	{
		switch(flammabilityType)
		{
			case LOG:
				burnChances.put(modBlock.getBlock(), 5);
				spreadChances.put(modBlock.getBlock(), 5);
				break;
				
			case WORKSTATION:
				burnChances.put(modBlock.getBlock(), 3);
				spreadChances.put(modBlock.getBlock(), 5);
				break;
				
			case CLOTH:
				burnChances.put(modBlock.getBlock(), 30);
				spreadChances.put(modBlock.getBlock(), 60);
				break;
				
			case THIN_CLOTH:
				burnChances.put(modBlock.getBlock(), 60);
				spreadChances.put(modBlock.getBlock(), 20);
				break;
				
			case PLANKS:
				burnChances.put(modBlock.getBlock(), 5);
				spreadChances.put(modBlock.getBlock(), 20);
				break;
				
			case PLANT:
				burnChances.put(modBlock.getBlock(), 60);
				spreadChances.put(modBlock.getBlock(), 100);
				break;
		}
	}
}