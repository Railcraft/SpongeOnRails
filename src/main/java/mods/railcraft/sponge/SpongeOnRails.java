/*
 * The MIT License (MIT)
 *
 * Copyright (c) CovertJaguar and Railcraft team <http://www.railcraft.info>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package mods.railcraft.sponge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.InstanceFactory;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import org.spongepowered.api.Sponge;

import mods.railcraft.sponge.api.entity.MinecartUtilImpl;
import mods.railcraft.sponge.api.entity.MinecartUtils;

/**
 *
 */
@Mod(
        modid = "spongeonrails",
        name = "Sponge On Rails",
        version = "%VERSION%",
        dependencies = "required-after:Forge@[12.18.2.2107,);required-after:spongeforge;required-after:railcraft"
)
public final class SpongeOnRails {

    private static final SpongeOnRails INSTANCE = new SpongeOnRails();

    @InstanceFactory
    public static SpongeOnRails getInstance() {
        return INSTANCE;
    }

    private SpongeOnRails() {
    }

    @EventHandler
    public void onInit(FMLInitializationEvent event) {
        Sponge.getServiceManager().setProvider(SpongeOnRails.getInstance(), MinecartUtils.class, new MinecartUtilImpl());
    }
}
