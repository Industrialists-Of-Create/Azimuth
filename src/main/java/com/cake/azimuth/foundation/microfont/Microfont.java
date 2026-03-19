package com.cake.azimuth.foundation.microfont;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;

/**
 * Teeny tiny barely even readable font used for type annotations on pins / data
 */
public class Microfont {

    public static final FontSheet FONT = new FontSheet.Builder(
            ResourceLocation.fromNamespaceAndPath("azimuth", "textures/gui/microfont.png"),
            3, 4, 1, true
    ).addChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ<>/").build();

    public static void render(final GuiGraphics guiGraphics, final String text, final int x, final int y, final int color) {
        FONT.render(guiGraphics, text, x, y, color);
    }

    public static void renderHighlighted(final GuiGraphics guiGraphics, final String text, final int x, final int y, final int color, final int bgColor) {
        RenderSystem.enableBlend();
        guiGraphics.fill(x - 1, y - 1, x + calculateWidth(text) + 1, y + getCharHeight() + 1, bgColor);
        FONT.render(guiGraphics, text, x, y, color);
    }

    public static int calculateWidth(final String text) {
        return FONT.calculateWidth(text);
    }

    public static int getCharHeight() {
        return FONT.getCharHeight();
    }
}
