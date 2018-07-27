package com.crimsondawn45.survivaladditions.objects.items.foods;

import com.crimsondawn45.survivaladditions.SurvivalAdditions;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.DiceRoll;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SoupBase extends ItemFood implements IHasModel{

	public SoupBase(String name, int amount, boolean isWolfFood) {
		super(amount,isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SurvivalAdditions.SURVIVAL_TAB);
		setMaxStackSize(1);
			
		ModItems.ITEMS.add(this);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
	
	@Override
	public void registerModels() {
		SurvivalAdditions.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
