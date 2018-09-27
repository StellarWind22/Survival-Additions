package com.crimsondawn45.survivaladditions.objects.items.tools.flint;

import com.crimsondawn45.survivaladditions.SurvivalAdditions;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FlintHatchet extends ItemAxe implements IHasModel{

	public FlintHatchet(String name, ToolMaterial material, Float damage, Float speed) {
		super(material, damage, speed);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SurvivalAdditions.TOOLS_TAB);
			
		ModItems.ITEMS.add(this);
		}
	
	//Right Click Light Fire Function
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		//Grab Vars
		pos = pos.offset(facing);
		ItemStack itemstack = player.getHeldItem(hand);
		ItemStack iron_nugget = new ItemStack(Items.IRON_NUGGET);

		//Check for iron nugget and looking at block
		if (!player.canPlayerEdit(pos, facing, itemstack) || !player.getHeldItemOffhand().isItemEqual(iron_nugget)) {
			return EnumActionResult.FAIL;
		} else {
			//Check if space for fire is available
		    if (worldIn.isAirBlock(pos)) {
		    	//Place fire block
		    	worldIn.playSound(player, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
		    	worldIn.playSound(player, pos, SoundEvents.ITEM_SHIELD_BREAK, SoundCategory.BLOCKS, 0.25F, itemRand.nextFloat() * 0.4F + 0.8F);
		    	worldIn.setBlockState(pos, Blocks.FIRE.getDefaultState(), 11);
		    }

		    if (player instanceof EntityPlayerMP) {
		    	CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos, itemstack);
		    }
		    ItemStack offhand = player.getHeldItemOffhand();
		            
		    //Take one Iron Nugget
		    offhand.shrink(1);
		    //Damage Tool
		    itemstack.damageItem(5, player);
		    return EnumActionResult.SUCCESS;
		}
	}
	
	//Register Item Model
	@Override
	public void registerModels() {
		SurvivalAdditions.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
