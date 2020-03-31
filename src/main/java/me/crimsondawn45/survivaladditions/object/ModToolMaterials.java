package me.crimsondawn45.survivaladditions.object;

import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum ModToolMaterials implements IItemTier
{	
	bone(4.0F, 2.5F, 85, 0, 30, Items.BONE),
	flint(5.5F, 2.7F, 100, 1, 100, Items.FLINT),
	netherrack(5.0F, 3.0F, 80, 0, 25, Item.BLOCK_TO_ITEM.get(Blocks.NETHERRACK)),
	quartz(5.5F, 3.5F, 90, 1, 35, Items.QUARTZ),
	sandstone(5.0F, 3.5F, 100, 1, 5, Item.BLOCK_TO_ITEM.get(Blocks.SANDSTONE));
	
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	
	private ModToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantibility, Item repairMaterial)
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantibility;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficiency;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses()
	{
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}
}
