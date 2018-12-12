package com.crimsondawn45.survivaladditions.objects.blocks.slab;

import java.util.Random;

import com.crimsondawn45.survivaladditions.Main;
import com.crimsondawn45.survivaladditions.init.ModBlocks;
import com.crimsondawn45.survivaladditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPurpurSlab;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class SlabBase extends BlockSlab implements IHasModel{
	
	public static final PropertyEnum<SlabBase.Variant> VARIANT = PropertyEnum.<SlabBase.Variant>create("variant", SlabBase.Variant.class);
	
    public SlabBase(String name ,Material material, SoundType sound,String tool, int harvestLvl, Float hard, Float resist) 
    {
        super(material);
        setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setCreativeTab(Main.BLOCKS_TAB);
		setHardness(hard);
		setResistance(resist);
		setHarvestLevel(tool, harvestLvl);
		
		IBlockState state = this.blockState.getBaseState();
		
		if(this.isDouble()) {
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		
		this.setDefaultState(state.withProperty(VARIANT, SlabBase.Variant.DEFAULT));
		
		ModBlocks.BLOCKS.add(this);
    }

    //GetUnlocalizedName
	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	//IsDouble
	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return SlabBase.Variant.DEFAULT;
	}
	
	//State From Meta
	public IBlockState getStateFromMeta(int meta)
    {
        IBlockState state = this.getDefaultState().withProperty(VARIANT, SlabBase.Variant.DEFAULT);

        if (!this.isDouble())
        {
            state = state.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return state;
    }
	
	//Meta From State
	public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
        {
            i |= 8;
        }

        return i;
    }
	
	//Create Block State Container
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
    }
	
	//Variants
	public static enum Variant implements IStringSerializable
    {
        DEFAULT;

        public String getName()
        {
            return "default";
        }
    }
	
	//Register Block Models
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}