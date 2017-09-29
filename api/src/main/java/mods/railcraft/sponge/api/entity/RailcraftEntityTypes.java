package mods.railcraft.sponge.api.entity;

import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 *
 */
public final class RailcraftEntityTypes {

    //SortField: ON

    public static final EntityType BASIC = DummyObjectProvider.createFor(EntityType.class, "BASIC");
    //SortField: OFF

    private RailcraftEntityTypes() {
    }
}
