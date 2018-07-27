package com.crimsondawn45.survivaladditions.util.handlers;

import com.crimsondawn45.survivaladditions.objects.blocks.container.ContainerBasket;
import com.crimsondawn45.survivaladditions.objects.blocks.container.ContainerClayUrn;
import com.crimsondawn45.survivaladditions.objects.blocks.tileentity.TileEntityBasket;
import com.crimsondawn45.survivaladditions.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_BASKET) {return new ContainerBasket(player.inventory, null, player);}
		if(ID == Reference.GUI_CLAY_URN) {return new ContainerClayUrn();}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		//if(ID == Reference.GUI_BASKET) {return new GuiBasket();}
		//if(ID == Reference.GUI_CLAY_URN) {return new GuiClayUrn();}
		return null;
	}

}
