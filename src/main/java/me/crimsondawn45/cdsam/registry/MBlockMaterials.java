package me.crimsondawn45.cdsam.registry;

import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.piston.PistonBehavior;

public class MBlockMaterials {
	
	public static Material m_sandstone;
	public static Material m_red_sandstone;
	public static Material m_obsidian;
	public static Material m_mud;
	
	public static void Init() {
		m_sandstone = new Material(MaterialColor.SAND, false, true, true, true, false, false, false, PistonBehavior.NORMAL);
		m_red_sandstone = new Material(MaterialColor.ORANGE, false, true, true, true, false, false, false, PistonBehavior.NORMAL);
		m_obsidian = new Material(MaterialColor.BLACK, false, true, true, true, false, false, false, PistonBehavior.BLOCK);
		m_mud = new Material(MaterialColor.BROWN, false, true, true, true, false, false, false, PistonBehavior.NORMAL);
	}
}
