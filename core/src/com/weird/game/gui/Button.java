package com.weird.game.gui;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Button extends Sprite {

    public boolean contains(float x, float y) {
        return getBoundingRectangle().contains(x, y);
    }
}