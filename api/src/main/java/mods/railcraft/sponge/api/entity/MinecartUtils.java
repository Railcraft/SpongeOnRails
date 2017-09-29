package mods.railcraft.sponge.api.entity;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.vehicle.minecart.Minecart;

/**
 *
 */
public interface MinecartUtils {

    static MinecartUtils getInstance() {
        return Sponge.getServiceManager().provideUnchecked(MinecartUtils.class);
    }

    boolean willExplode(Minecart cart);

    boolean isHighSpeed(Minecart cart);
}
