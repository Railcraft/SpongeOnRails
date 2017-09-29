package mods.railcraft.sponge.api;

import com.google.inject.Inject;

import org.spongepowered.api.plugin.Plugin;

import javax.annotation.CheckForNull;

/**
 *
 */
@Plugin(id = "spongeonrailsapi", version = "%version%")
public final class SpongeOnRailsAPI {

    @CheckForNull
    private static SpongeOnRailsAPI instance;

    @Inject
    private SpongeOnRailsAPI() {
        instance = this;
    }

    public static SpongeOnRailsAPI getInstance() {
        if (instance == null)
            throw new IllegalStateException("Too early");
        return instance;
    }
}
