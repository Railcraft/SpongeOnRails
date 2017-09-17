package mods.railcraft.sponge.api;

import com.google.inject.Inject;

import org.spongepowered.api.plugin.Plugin;

/**
 *
 */
@Plugin(id = "spongeonrailsapi", version = "%version%")
public final class SpongeOnRailsAPI {

    private static SpongeOnRailsAPI instance;

    @Inject
    private SpongeOnRailsAPI() {
        instance = this;
    }

    public static SpongeOnRailsAPI getInstance() {
        return instance;
    }
}
