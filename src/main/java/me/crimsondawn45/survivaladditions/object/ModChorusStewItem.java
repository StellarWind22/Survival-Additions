package me.crimsondawn45.survivaladditions.object;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ModChorusStewItem extends Item {

	private double range = 32;
	
	public ModChorusStewItem(Properties properties) {
		super(properties);
		
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		super.onItemUseFinish(stack, worldIn, entityLiving);
		
		if (!worldIn.isRemote) {
			
			double d0 = entityLiving.posX;
			double d1 = entityLiving.posY;
			double d2 = entityLiving.posZ;
			
			
			for(int i = 0; i < range; ++i) {
				
	            double d3 = entityLiving.posX + (entityLiving.getRNG().nextDouble() - 0.5D) * range;
	            double d4 = MathHelper.clamp(entityLiving.posY + (double)(entityLiving.getRNG().nextInt((int) range) - 8), 0.0D, (double)(worldIn.getActualHeight() - 1));
	            double d5 = entityLiving.posZ + (entityLiving.getRNG().nextDouble() - 0.5D) * range;
	            
	            
	            if (entityLiving.isPassenger()) {
	               entityLiving.stopRiding();
	            }

	            if (entityLiving.attemptTeleport(d3, d4, d5, true)) {
	            	
	               worldIn.playSound((PlayerEntity)null, d0, d1, d2, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
	               entityLiving.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
	               
	               break;
	            }
	         }

			if (entityLiving instanceof PlayerEntity) {
	            ((PlayerEntity)entityLiving).getCooldownTracker().setCooldown(this, 20);
			}
	    }
		return new ItemStack(Items.BOWL);
	}
}
