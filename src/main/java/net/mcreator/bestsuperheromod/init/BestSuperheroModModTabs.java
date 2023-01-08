
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bestsuperheromod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BestSuperheroModModTabs {
	public static CreativeModeTab TAB_COLLECTIVE_HEROES;

	public static void load() {
		TAB_COLLECTIVE_HEROES = new CreativeModeTab("tabcollective_heroes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BestSuperheroModModItems.GREENARROW_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
