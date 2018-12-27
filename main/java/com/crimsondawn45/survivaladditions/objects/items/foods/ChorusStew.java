package com.crimsondawn45.survivaladditions.objects.items.foods;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.DiceRoll;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ChorusStew extends ItemFood implements IHasModel{

	public ChorusStew(String name, int amount, boolean isWolfFood) {
		super(amount,isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MISC_TAB);
		setMaxStackSize(1);
		this.setAlwaysEdible();
			
		ModItems.ITEMS.add(this);
	}
	
	//Special Teleport Event
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);

        if (!worldIn.isRemote) {
            double d0 = entityLiving.posX;
            double d1 = entityLiving.posY;
            double d2 = entityLiving.posZ;

            for (int i = 0; i < 16; ++i) {
            	//change back to 32
                double d3 = entityLiving.posX + (entityLiving.getRNG().nextDouble() - 0.5D) * 32.0D;
                double d4 = MathHelper.clamp(entityLiving.posY + (double)(entityLiving.getRNG().nextInt(16) - 8), 0.0D, (double)(worldIn.getActualHeight() - 1));
                double d5 = entityLiving.posZ + (entityLiving.getRNG().nextDouble() - 0.5D) * 32.0D;

                if (entityLiving.isRiding())
                {
                    entityLiving.dismountRidingEntity();
                }

                if (entityLiving.attemptTeleport(d3, d4, d5))
                {
                    worldIn.playSound((EntityPlayer)null, d0, d1, d2, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
                    entityLiving.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
                    break;
                }
            }

            if (entityLiving instanceof EntityPlayer)
            {
                ((EntityPlayer)entityLiving).getCooldownTracker().setCooldown(this, 20);
            }
        }
        return new ItemStack(Items.BOWL);
    }
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
