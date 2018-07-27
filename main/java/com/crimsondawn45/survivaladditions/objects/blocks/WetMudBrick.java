package com.crimsondawn45.survivaladditions.objects.blocks;

import java.util.Random;

import com.crimsondawn45.survivaladditions.SurvivalAdditions;
import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.DiceRoll;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class WetMudBrick extends Block implements IHasModel{

	//Creates Age Property
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 3);
	
	public WetMudBrick(String name ,Material material, SoundType sound,String tool, int harvestLvl, Float hard, Float resist) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setCreativeTab(SurvivalAdditions.SURVIVAL_TAB);
		setHardness(hard);
		setResistance(resist);
		setHarvestLevel(tool, harvestLvl);
		this.setTickRandomly(true);
		this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	//Update Tick
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if(((Integer)state.getValue(AGE)).intValue() == 3) {
			worldIn.setBlockState(pos, ModBlocks.MUD_BRICK.getDefaultState());
		} else if(worldIn.getLightFor(EnumSkyBlock.SKY, pos.up()) > 13 && worldIn.isDaytime() && !(worldIn.isRaining() || worldIn.isThundering())) {
			worldIn.setBlockState(pos, state.withProperty(AGE, ((Integer)state.getValue(AGE)).intValue() + 1));
		}
	}
	
	//Meta From State
	public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(AGE)).intValue();
    }
	
	//State From Meta
	public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(AGE, Integer.valueOf(MathHelper.clamp(meta, 0, 4)));
    }
	
	//Block State Container
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {AGE});
    }
	
    //Register Model
	@Override
	public void registerModels() {
		
		SurvivalAdditions.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
