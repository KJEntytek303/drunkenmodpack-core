package net.kjentytek303.drunkenmodpack.mixin;

import net.ltxprogrammer.changed.entity.robot.AbstractRobot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(net.ltxprogrammer.changed.entity.robot.Exoskeleton.class )
public abstract class DrunkenModpack_ExoskeletonMixin extends AbstractRobot {

	protected DrunkenModpack_ExoskeletonMixin(EntityType<? extends PathfinderMob> type, Level level) {
		super(type, level);
	}

	@Override
	protected float getChargeRate() {
		return 1f/*super.getChargeRate() *4 */;
	}
}