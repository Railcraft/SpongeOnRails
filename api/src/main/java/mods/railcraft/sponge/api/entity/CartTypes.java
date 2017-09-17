package mods.railcraft.sponge.api.entity;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

/**
 *
 */
public final class CartTypes {
    //SortField: ON

    public static final CartType BASIC = DummyObjectProvider.createFor(CartType.class, "BASIC");
    //SortField: OFF

    private CartTypes() {
    }
}
