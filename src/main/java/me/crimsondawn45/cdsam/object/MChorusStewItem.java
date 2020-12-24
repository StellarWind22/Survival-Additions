package me.crimsondawn45.cdsam.object;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class MChorusStewItem extends Item {

	private double range = 32.0D;
	
	public MChorusStewItem(Settings settings) {
		super(settings);
		
	}

	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
	{
      ItemStack itemStack = super.finishUsing(stack, world, user);
      
      if (!world.isClient)
      {
         double d = user.getPos().x;
         double e = user.getPos().y;
         double f = user.getPos().z;

         for(int i = 0; i < 16; ++i)
         {
            double g = user.getPos().x + (user.getRandom().nextDouble() - 0.5D) * range;
            double h = MathHelper.clamp(user.getPos().y + (double)(user.getRandom().nextInt(16) - 8), 0.0D, (double)(world.getHeight() - 1));
            double j = user.getPos().z + (user.getRandom().nextDouble() - 0.5D) * range;
            
            if (user.hasVehicle())
            {
               user.stopRiding();
            }

            if (user.teleport(g, h, j, true))
            {
               world.playSound((PlayerEntity)null, d, e, f, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
               user.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
               break;
            }
         }

         if (user instanceof PlayerEntity)
         {
        	 ((PlayerEntity)user).getItemCooldownManager().set(this, 20);
         }
      }

      return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(Items.BOWL);
   }
}