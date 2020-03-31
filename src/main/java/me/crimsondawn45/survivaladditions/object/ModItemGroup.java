package me.crimsondawn45.survivaladditions.object;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroup extends ItemGroup {

	private IItemProvider icon;
	
	public ModItemGroup(String name, IItemProvider item) {
		super(name);
		
		this.icon = item;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(icon);
	}
}
