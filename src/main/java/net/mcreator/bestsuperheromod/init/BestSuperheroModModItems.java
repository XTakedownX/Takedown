
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bestsuperheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bestsuperheromod.item.GreenarrowItem;
import net.mcreator.bestsuperheromod.item.Green_ArrowArmorItem;
import net.mcreator.bestsuperheromod.item.CompoundBowItem;
import net.mcreator.bestsuperheromod.BestSuperheroModMod;

public class BestSuperheroModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BestSuperheroModMod.MODID);
	public static final RegistryObject<Item> GREEN_ARROW_ARMOR_HELMET = REGISTRY.register("green_arrow_armor_helmet",
			() -> new Green_ArrowArmorItem.Helmet());
	public static final RegistryObject<Item> GREEN_ARROW_ARMOR_CHESTPLATE = REGISTRY.register("green_arrow_armor_chestplate",
			() -> new Green_ArrowArmorItem.Chestplate());
	public static final RegistryObject<Item> GREEN_ARROW_ARMOR_LEGGINGS = REGISTRY.register("green_arrow_armor_leggings",
			() -> new Green_ArrowArmorItem.Leggings());
	public static final RegistryObject<Item> GREEN_ARROW_ARMOR_BOOTS = REGISTRY.register("green_arrow_armor_boots",
			() -> new Green_ArrowArmorItem.Boots());
	public static final RegistryObject<Item> GREENARROW_HELMET = REGISTRY.register("greenarrow_helmet", () -> new GreenarrowItem.Helmet());
	public static final RegistryObject<Item> GREENARROW_CHESTPLATE = REGISTRY.register("greenarrow_chestplate",
			() -> new GreenarrowItem.Chestplate());
	public static final RegistryObject<Item> GREENARROW_LEGGINGS = REGISTRY.register("greenarrow_leggings", () -> new GreenarrowItem.Leggings());
	public static final RegistryObject<Item> GREENARROW_BOOTS = REGISTRY.register("greenarrow_boots", () -> new GreenarrowItem.Boots());
	public static final RegistryObject<Item> COMPOUND_BOW = REGISTRY.register("compound_bow", () -> new CompoundBowItem());
}
