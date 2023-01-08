
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bestsuperheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.bestsuperheromod.block.BitchBlock;
import net.mcreator.bestsuperheromod.BestSuperheroModMod;

public class BestSuperheroModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BestSuperheroModMod.MODID);
	public static final RegistryObject<Block> BITCH = REGISTRY.register("bitch", () -> new BitchBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			BitchBlock.blockColorLoad(event);
		}
	}
}
