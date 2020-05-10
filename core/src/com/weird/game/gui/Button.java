package com.weird.game.gui;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Button extends Sprite {

    public Button(Sprite sprite) {
        super(sprite);
    }

    public boolean contains(float x, float y) {
        return getBoundingRectangle().contains(x, y);
    }
}