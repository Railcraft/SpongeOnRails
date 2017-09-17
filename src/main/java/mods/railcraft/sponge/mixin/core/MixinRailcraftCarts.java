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
package mods.railcraft.sponge.mixin.core;

import net.minecraft.entity.item.EntityMinecart;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.text.translation.FixedTranslation;
import org.spongepowered.api.text.translation.Translation;
import org.spongepowered.api.util.annotation.NonnullByDefault;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nullable;

import mods.railcraft.common.carts.RailcraftCarts;
import mods.railcraft.common.core.IRailcraftObjectContainer;
import mods.railcraft.sponge.api.entity.CartType;

/**
 *
 */
@Mixin(RailcraftCarts.class)
@NonnullByDefault
public abstract class MixinRailcraftCarts implements CartType, IRailcraftObjectContainer {

    @Shadow
    @Final
    private Class<? extends EntityMinecart> type;

    @Nullable
    private FixedTranslation translation;

    @Shadow
    public abstract String getEntityLocalizationTag();

    @Override
    @SuppressWarnings("unchecked")
    public Class<? extends Entity> getEntityClass() {
        return (Class) type;
    }

    @Override
    public String getId() {
        return getBaseTag();
    }

    @Override
    public String getName() {
        return ((RailcraftCarts) (Object) this).name();
    }

    @Override
    public Translation getTranslation() {
        if (translation == null) {
            translation = new FixedTranslation(getEntityLocalizationTag());
        }
        return translation;
    }
}
