package me.crimsondawn45.survivaladditions.object;

import java.util.Random;

import me.crimsondawn45.survivaladditions.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ModWetBlock extends Block
{
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;
	
	private static final int MIN_TICK_TIME = 20;
	private static final int MAX_TICK_TIME = 40;
	private static final int MAX_AGE = 3;
	
	public ModWetBlock(Properties properties)
	{
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(AGE, Integer.valueOf(0)));
	}
	
	public void tick(BlockState state, World world, BlockPos pos, Random random)
	{
		if(random.nextInt(3) == 0 && this.canDry(world, pos))
		{
			this.dry(world, state, pos);
		}
		world.getPendingBlockTicks().scheduleTick(pos, this, MathHelper.nextInt(random, MIN_TICK_TIME, MAX_TICK_TIME));
	}
	
	protected IntegerProperty getAgeProperty()
	{
		return AGE;
	}
	
	public int getAge(BlockState state)
	{
		return state.get(this.getAgeProperty());
	}
	
	public BlockState withAge(int age)
	{
		return this.getDefaultState().with(this.getAgeProperty(), Integer.valueOf(age));
	}
	
	private boolean canDry(World world, BlockPos pos)
	{	
		if(world.isRainingAt(pos) || !(world.isDaytime()) || world.getLightValue(pos) < 7)
		{
			return false;
		}
		return true;
	}
	
	private void dry(World world, BlockState state, BlockPos pos)
	{
		if(!canDry(world, pos))
		{
			return;
		}
		
		int age = getAge(state);
		
		if(age == MAX_AGE)
		{
			world.setBlockState(pos, ModBlocks.mud_bricks.getDefaultState());
		}
		world.setBlockState(pos, this.withAge(age + 1));
	}

	@Override
	public void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		builder.add(AGE);
	}
}
