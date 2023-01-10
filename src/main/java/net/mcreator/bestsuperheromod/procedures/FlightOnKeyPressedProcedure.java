package net.mcreator.bestsuperheromod.procedures;

import net.minecraft.world.entity.Entity;

public class FlightOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("flight", (true));
	}
}
