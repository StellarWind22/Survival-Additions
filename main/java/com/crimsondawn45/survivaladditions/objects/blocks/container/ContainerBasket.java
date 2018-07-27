package com.crimsondawn45.survivaladditions.objects.blocks.container;

import com.crimsondawn45.survivaladditions.objects.blocks.tileentity.TileEntityBasket;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBasket extends Container{
	
	private final int numRows;
	private TileEntityBasket basketInventory;
	
	public ContainerBasket(InventoryPlayer playerInv, TileEntityBasket tileEntityBasket, EntityPlayer player) {
		this.basketInventory = tileEntityBasket;
		this.numRows = tileEntityBasket.getSizeInventory() / 9;
		tileEntityBasket.openInventory(player);
		
		//Add Slots To Tile Entity
		for(int i = 0; i < this.numRows; ++i) {
			for(int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(tileEntityBasket, j + i * 9, 8 + j * 18 , 18 + j * 18));
			}
		}
		
		//Add In player's inventory slots
		for(int y=0; y < 3; y++) {
			for(int x = 0; x < 9; x++) {
				this.addSlotToContainer(new Slot(playerInv, x + y*9 + 9, 8 + x*18, 175 + y*18));
			}
		}
		
		//Add In HotBar Slots
		for(int x = 0; x < 9; x++) {
			this.addSlotToContainer(new Slot(playerInv, x, 8 + x*18, 233));
		}
	}

	//Player Can Interact With It
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.basketInventory.isUsableByPlayer(playerIn);
	}
	
	//When Container Closes
	@Override
	public void onContainerClosed(EntityPlayer playerIn) {
		super.onContainerClosed(playerIn);
		basketInventory.closeInventory(playerIn);
	}
	
	//Transfer Stack Function
	@Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
 
        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
 
            if (index < this.numRows * 9)
            {
                if (!this.mergeItemStack(itemstack1, this.numRows * 9, this.inventorySlots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.numRows * 9, false))
            {
                return ItemStack.EMPTY;
            }
 
            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }
        }
 
        return itemstack;
    }
	
	public TileEntityBasket getBasketInventory() {
		return this.basketInventory;
	}
}
