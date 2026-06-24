package net.kjentytek303.drunkenmodpack.mixin;

import net.ltxprogrammer.changed.entity.robot.AbstractRobot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(net.ltxprogrammer.changed.entity.robot.Exoskeleton.class )
public abstract class DrunkenModpack_ExoskeletonMixin extends AbstractRobot {

	protected DrunkenModpack_ExoskeletonMixin(EntityType<? extends PathfinderMob> type, Level level) {
		super(type, level);
	}

	@Override
	public float getChargeRate() {
		return super.getChargeRate() * 4;
	}
}