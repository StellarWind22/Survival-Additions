package com.crimsondawn45.survivaladditions.objects.blocks.tileentity;

import com.crimsondawn45.survivaladditions.objects.blocks.container.ContainerBasket;
import com.crimsondawn45.survivaladditions.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;

public class TileEntityBasket extends TileEntityLockableLoot{

	private NonNullList<ItemStack> basketContents = NonNullList.<ItemStack>withSize(72, ItemStack.EMPTY);
	public int numPlayerUsing, ticksSinceSync;
	
	//Inventory Size
	@Override
	public int getSizeInventory() {
		return 72;
	}
	
	//Stack Limit
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
	
	//Check if empty
	@Override
	public boolean isEmpty() {
		for(ItemStack stack :this.basketContents) {
			if(!stack.isEmpty()) return false;
		}
		return true;
	}

	//Get Display Name
	@Override
	public String getName() {
		return this.hasCustomName() ? this.customName : "container.basket";
	}
	
	//Read From NBT
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		this.basketContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
		
		if(!this.checkLootAndRead(compound)) ItemStackHelper.loadAllItems(compound, basketContents);
		if(compound.hasKey("CustomName", 8)) this.customName = compound.getString("CustomName");
	}
	
	//Write To NBT
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		if(!this.checkLootAndWrite(compound)) ItemStackHelper.saveAllItems(compound, basketContents);
		if(compound.hasKey("CustomName", 8)) compound.setString("CustomName", this.customName);
		
		return compound;
	}
	
	//create container for tile entity
	@Override
	public Container createContainer(InventoryPlayer playerInv, EntityPlayer playerIn) {
		return new ContainerBasket(playerInv, this, playerIn);
	}
	
	//gets the gui id
	@Override
	public String getGuiID() {
		return Reference.MOD_ID + ":basket";
	}
	
	//fired when opened
	@Override
	public void openInventory(EntityPlayer player) {
		++this.numPlayerUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayerUsing);
		this.world.notifyNeighborsOfStateChange(pos, blockType, false);
	}
	
	//fired when closed
	@Override
	public void closeInventory(EntityPlayer player) {
		--this.numPlayerUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayerUsing);
		this.world.notifyNeighborsOfStateChange(pos, blockType, false);
	}
	
	//Get Items
	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.basketContents;
	}
	
}
