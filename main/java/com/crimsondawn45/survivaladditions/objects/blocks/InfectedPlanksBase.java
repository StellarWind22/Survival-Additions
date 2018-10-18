package com.crimsondawn45.survivaladditions.objects.blocks;

import java.util.Random;

import com.crimsondawn45.survivaladditions.SurvivalAdditions;
import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.init.ModItems;
import com.crimsondawn45.survivaladditions.util.DiceRoll;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class InfectedPlanksBase extends Block implements IHasModel{

	//Creates Age Property
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 4);
	
	//Grabs Variant Variable
	public static final PropertyEnum<BlockPlanks.EnumType> VARIANT = PropertyEnum.<BlockPlanks.EnumType>create("variant", BlockPlanks.EnumType.class);
	
	public InfectedPlanksBase(String name ,Material material, SoundType sound,String tool, int harvestLvl, Float hard, Float resist) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setCreativeTab(SurvivalAdditions.BLOCKS_TAB);
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
		//If Block At Maximum Age Break Else Check To Spread Infection
		if(((Integer)state.getValue(AGE)).intValue() == 4) {
			worldIn.destroyBlock(pos, false);
		} else {
			//Check Blocks Around It For Spreading
				//Set Vars For East Of Use
			IBlockState up = worldIn.getBlockState(pos.up());
			IBlockState down = worldIn.getBlockState(pos.down());
			IBlockState north = worldIn.getBlockState(pos.north());
			IBlockState south = worldIn.getBlockState(pos.south());
			IBlockState east = worldIn.getBlockState(pos.east());
			IBlockState west = worldIn.getBlockState(pos.west());
			
			//Checks The Up Direction
			if(up.getBlock().getDefaultState() == Blocks.PLANKS.getDefaultState()) {
				if(up.getValue(VARIANT).equals(BlockPlanks.EnumType.OAK)) {
					worldIn.setBlockState(pos.up(), ModBlocks.INFECTED_PLANKS_OAK.getDefaultState());
				}
				if(up.getValue(VARIANT).equals(BlockPlanks.EnumType.SPRUCE)) {
					worldIn.setBlockState(pos.up(), ModBlocks.INFECTED_PLANKS_SPRUCE.getDefaultState());
				}
				if(up.getValue(VARIANT).equals(BlockPlanks.EnumType.BIRCH)) {
					worldIn.setBlockState(pos.up(), ModBlocks.INFECTED_PLANKS_BIRCH.getDefaultState());
				}
				if(up.getValue(VARIANT).equals(BlockPlanks.EnumType.JUNGLE)) {
					worldIn.setBlockState(pos.up(), ModBlocks.INFECTED_PLANKS_JUNGLE.getDefaultState());
				}
				if(up.getValue(VARIANT).equals(BlockPlanks.EnumType.ACACIA)) {
					worldIn.setBlockState(pos.up(), ModBlocks.INFECTED_PLANKS_ACACIA.getDefaultState());
				}
				if(up.getValue(VARIANT).equals(BlockPlanks.EnumType.DARK_OAK)) {
					worldIn.setBlockState(pos.up(), ModBlocks.INFECTED_PLANKS_DARK_OAK.getDefaultState());
				}
			}
			
			//Checks The Down Direction
			if(down.getBlock().getDefaultState() == Blocks.PLANKS.getDefaultState()) {
				if(down.getValue(VARIANT).equals(BlockPlanks.EnumType.OAK)) {
					worldIn.setBlockState(pos.down(), ModBlocks.INFECTED_PLANKS_OAK.getDefaultState());
				}
				if(down.getValue(VARIANT).equals(BlockPlanks.EnumType.SPRUCE)) {
					worldIn.setBlockState(pos.down(), ModBlocks.INFECTED_PLANKS_SPRUCE.getDefaultState());
				}
				if(down.getValue(VARIANT).equals(BlockPlanks.EnumType.BIRCH)) {
					worldIn.setBlockState(pos.down(), ModBlocks.INFECTED_PLANKS_BIRCH.getDefaultState());
				}
				if(down.getValue(VARIANT).equals(BlockPlanks.EnumType.JUNGLE)) {
					worldIn.setBlockState(pos.down(), ModBlocks.INFECTED_PLANKS_JUNGLE.getDefaultState());
				}
				if(down.getValue(VARIANT).equals(BlockPlanks.EnumType.ACACIA)) {
					worldIn.setBlockState(pos.down(), ModBlocks.INFECTED_PLANKS_ACACIA.getDefaultState());
				}
				if(down.getValue(VARIANT).equals(BlockPlanks.EnumType.DARK_OAK)) {
					worldIn.setBlockState(pos.down(), ModBlocks.INFECTED_PLANKS_DARK_OAK.getDefaultState());
				}
			}
			
			//Checks The North Direction
			if(north.getBlock().getDefaultState() == Blocks.PLANKS.getDefaultState()) {
				if(north.getValue(VARIANT).equals(BlockPlanks.EnumType.OAK)) {
					worldIn.setBlockState(pos.north(), ModBlocks.INFECTED_PLANKS_OAK.getDefaultState());
				}
				if(north.getValue(VARIANT).equals(BlockPlanks.EnumType.SPRUCE)) {
					worldIn.setBlockState(pos.north(), ModBlocks.INFECTED_PLANKS_SPRUCE.getDefaultState());
				}
				if(north.getValue(VARIANT).equals(BlockPlanks.EnumType.BIRCH)) {
					worldIn.setBlockState(pos.north(), ModBlocks.INFECTED_PLANKS_BIRCH.getDefaultState());
				}
				if(north.getValue(VARIANT).equals(BlockPlanks.EnumType.JUNGLE)) {
					worldIn.setBlockState(pos.north(), ModBlocks.INFECTED_PLANKS_JUNGLE.getDefaultState());
				}
				if(north.getValue(VARIANT).equals(BlockPlanks.EnumType.ACACIA)) {
					worldIn.setBlockState(pos.north(), ModBlocks.INFECTED_PLANKS_ACACIA.getDefaultState());
				}
				if(north.getValue(VARIANT).equals(BlockPlanks.EnumType.DARK_OAK)) {
					worldIn.setBlockState(pos.north(), ModBlocks.INFECTED_PLANKS_DARK_OAK.getDefaultState());
				}
			}
			
			//Checks The South Direction
			if(south.getBlock().getDefaultState() == Blocks.PLANKS.getDefaultState()) {
				if(south.getValue(VARIANT).equals(BlockPlanks.EnumType.OAK)) {
					worldIn.setBlockState(pos.south(), ModBlocks.INFECTED_PLANKS_OAK.getDefaultState());
				}
				if(south.getValue(VARIANT).equals(BlockPlanks.EnumType.SPRUCE)) {
					worldIn.setBlockState(pos.south(), ModBlocks.INFECTED_PLANKS_SPRUCE.getDefaultState());
				}
				if(south.getValue(VARIANT).equals(BlockPlanks.EnumType.BIRCH)) {
					worldIn.setBlockState(pos.south(), ModBlocks.INFECTED_PLANKS_BIRCH.getDefaultState());
				}
				if(south.getValue(VARIANT).equals(BlockPlanks.EnumType.JUNGLE)) {
					worldIn.setBlockState(pos.south(), ModBlocks.INFECTED_PLANKS_JUNGLE.getDefaultState());
				}
				if(south.getValue(VARIANT).equals(BlockPlanks.EnumType.ACACIA)) {
					worldIn.setBlockState(pos.south(), ModBlocks.INFECTED_PLANKS_ACACIA.getDefaultState());
				}
				if(south.getValue(VARIANT).equals(BlockPlanks.EnumType.DARK_OAK)) {
					worldIn.setBlockState(pos.south(), ModBlocks.INFECTED_PLANKS_DARK_OAK.getDefaultState());
				}
			}
			
			//Checks The East Direction
			if(east.getBlock().getDefaultState() == Blocks.PLANKS.getDefaultState()) {
				if(east.getValue(VARIANT).equals(BlockPlanks.EnumType.OAK)) {
					worldIn.setBlockState(pos.east(), ModBlocks.INFECTED_PLANKS_OAK.getDefaultState());
				}
				if(east.getValue(VARIANT).equals(BlockPlanks.EnumType.SPRUCE)) {
					worldIn.setBlockState(pos.east(), ModBlocks.INFECTED_PLANKS_SPRUCE.getDefaultState());
				}
				if(east.getValue(VARIANT).equals(BlockPlanks.EnumType.BIRCH)) {
					worldIn.setBlockState(pos.east(), ModBlocks.INFECTED_PLANKS_BIRCH.getDefaultState());
				}
				if(east.getValue(VARIANT).equals(BlockPlanks.EnumType.JUNGLE)) {
					worldIn.setBlockState(pos.east(), ModBlocks.INFECTED_PLANKS_JUNGLE.getDefaultState());
				}
				if(east.getValue(VARIANT).equals(BlockPlanks.EnumType.ACACIA)) {
					worldIn.setBlockState(pos.east(), ModBlocks.INFECTED_PLANKS_ACACIA.getDefaultState());
				}
				if(east.getValue(VARIANT).equals(BlockPlanks.EnumType.DARK_OAK)) {
					worldIn.setBlockState(pos.east(), ModBlocks.INFECTED_PLANKS_DARK_OAK.getDefaultState());
				}
			}
			
			//Checks The West Direction
			if(west.getBlock().getDefaultState() == Blocks.PLANKS.getDefaultState()) {
				if(west.getValue(VARIANT).equals(BlockPlanks.EnumType.OAK)) {
					worldIn.setBlockState(pos.west(), ModBlocks.INFECTED_PLANKS_OAK.getDefaultState());
				}
				if(west.getValue(VARIANT).equals(BlockPlanks.EnumType.SPRUCE)) {
					worldIn.setBlockState(pos.west(), ModBlocks.INFECTED_PLANKS_SPRUCE.getDefaultState());
				}
				if(west.getValue(VARIANT).equals(BlockPlanks.EnumType.BIRCH)) {
					worldIn.setBlockState(pos.west(), ModBlocks.INFECTED_PLANKS_BIRCH.getDefaultState());
				}
				if(west.getValue(VARIANT).equals(BlockPlanks.EnumType.JUNGLE)) {
					worldIn.setBlockState(pos.west(), ModBlocks.INFECTED_PLANKS_JUNGLE.getDefaultState());
				}
				if(west.getValue(VARIANT).equals(BlockPlanks.EnumType.ACACIA)) {
					worldIn.setBlockState(pos.west(), ModBlocks.INFECTED_PLANKS_ACACIA.getDefaultState());
				}
				if(west.getValue(VARIANT).equals(BlockPlanks.EnumType.DARK_OAK)) {
					worldIn.setBlockState(pos.west(), ModBlocks.INFECTED_PLANKS_DARK_OAK.getDefaultState());
				}
			}
			
			//Increase Age Of Block
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
