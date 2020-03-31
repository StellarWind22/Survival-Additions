package me.crimsondawn45.survivaladditions.object;

import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ModShieldItem extends Item {
   public ModShieldItem(Item.Properties builder) {
      super(builder);
      this.addPropertyOverride(new ResourceLocation("blocking"), (p_210314_0_, p_210314_1_, p_210314_2_) -> {
         return p_210314_2_ != null && p_210314_2_.isHandActive() && p_210314_2_.getActiveItemStack() == p_210314_0_ ? 1.0F : 0.0F;
      });
      DispenserBlock.registerDispenseBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
   }
   
   @Override
   public UseAction getUseAction(ItemStack stack) {
      return UseAction.BLOCK;
   }

   @Override
   public int getUseDuration(ItemStack stack) {
      return 72000;
   }

   @Override
   public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
      ItemStack itemstack = playerIn.getHeldItem(handIn);
      playerIn.setActiveHand(handIn);
      return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
   }

   @Override
   public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
      return ItemTags.PLANKS.contains(repair.getItem()) || super.getIsRepairable(toRepair, repair);
   }
   
   @Override
   public boolean isShield(ItemStack stack, LivingEntity entity) {
	   return true;
   }
}