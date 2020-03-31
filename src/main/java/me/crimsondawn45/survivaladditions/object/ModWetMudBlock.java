package me.crimsondawn45.survivaladditions.object;

import java.util.Random;

import me.crimsondawn45.survivaladditions.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModWetMudBlock extends Block {
	
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_3;
	
	public ModWetMudBlock(Properties properties)
	{
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(AGE, Integer.valueOf(0)));
	}
	
	
	//Method Run Each Tick
	@Override
	public void tick(BlockState state, World world, BlockPos pos, Random random)
	{
		if(random.nextInt(3) == 3)
		{
			dry(world, state, pos);
		}
	}
	
	public BlockState updatePostPlacement()
	{
		return null;
	}
	
	protected IntegerProperty getAgeProperty()
	{
		return AGE;
	}
	
	protected int getMaxAge()
	{
		return 3;
	}
	
	public int getAge(BlockState state)
	{
		return state.get(this.getAgeProperty());
	}
	
	public BlockState withAge(int age)
	{
		return this.getDefaultState().with(this.getAgeProperty(), Integer.valueOf(age));
	}
	
	//Make tick randomly
	@Override
	public boolean ticksRandomly(BlockState state)
	{
	      return true;
	}
	
	//Check if it can dry
	private static boolean canDry(World world, BlockPos pos)
	{	
		//If it is raining or it is nighttime
		if(world.isRainingAt(pos) || !(world.isDaytime()) || world.getLightValue(pos) < 0)
		{
			return false;
		}
		return true;
	}
	
	/**
	 * dry - Method for drying the block one unit.
	 * 
	 * @param worldIn	World block is in.
	 * @param state		BlockState of block.
	 * @param pos		Position of the block.
	 */
	private void dry(World world, BlockState state, BlockPos pos)
	{
		if(!canDry(world, pos))
		{
			return;
		}
		
		int age = getAge(state);
		
		if(age == this.getMaxAge())
		{
			world.setBlockState(pos, ModBlocks.mud_bricks.getDefaultState());
		}
		
		//Add one to age
		world.setBlockState(pos, this.withAge(age + 1));
	}

	//Add age to blockstate
	@Override
	public void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		builder.add(AGE);
	}
}
