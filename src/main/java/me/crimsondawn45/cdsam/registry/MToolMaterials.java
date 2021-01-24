package me.crimsondawn45.cdsam.registry;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MToolMaterials implements ToolMaterial {
	
	//Reference
	public static ToolMaterial bone;
	public static ToolMaterial flint;
	public static ToolMaterial netherrack;
	public static ToolMaterial quartz;
	public static ToolMaterial sandstone;
	
	//Init
	public static void Init() {
		bone = 			new MToolMaterials(4.0F, 2.5F, 85, 0, 30, Items.BONE);
		flint = 		new MToolMaterials(5.5F, 2.7F, 100, 1, 100, Items.FLINT);
		netherrack = 	new MToolMaterials(5.0F, 3.0F, 80, 0, 25, Items.NETHERRACK);
		quartz = 		new MToolMaterials(5.5F, 3.5F, 90, 1, 35, Items.QUARTZ);
		sandstone = 	new MToolMaterials(5.0F, 3.5F, 100, 1, 5, Items.SANDSTONE);
	}
	
	private float attackDamage, speedMultiplier;
	private int durability, miningLevel, enchantability;
	private Item repairMaterial;
	
	public MToolMaterials(float attackDamage, float speedMultiplier, int durability, int miningLevel, int enchantibility, Item repairMaterial)
	{
		this.attackDamage = attackDamage;
		this.speedMultiplier = speedMultiplier;
		this.durability = durability;
		this.miningLevel = miningLevel;
		this.enchantability = enchantibility;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public int getDurability()
	{
		return this.durability;
	}

	@Override
	public int getMiningLevel()
	{
		return this.miningLevel;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		return Ingredient.ofItems(this.repairMaterial);
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return this.speedMultiplier;
	}
}
