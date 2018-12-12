package com.crimsondawn45.survivaladditions.objects.items.foods;

import com.crimsondawn45.survivaladditions.Main;
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

public class NauseaSoupBase extends ItemFood implements IHasModel{

	public NauseaSoupBase(String name, int amount, boolean isWolfFood) {
		super(amount,isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MISC_TAB);
		setMaxStackSize(1);
			
		ModItems.ITEMS.add(this);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if(DiceRoll.probCheck(1,4)) {
        	entityLiving.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, DiceRoll.genRandEffectDurSecs(5, 10), 1));
        }
        return new ItemStack(Items.BOWL);
    }
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
