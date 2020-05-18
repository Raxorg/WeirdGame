package com.weird.game.stuff;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bird {

    private Sprite sprite;

    Bird(Sprite birdSprite) {
        sprite = new Sprite(birdSprite);
        sprite.setSize(sprite.getWidth() * 4f, sprite.getHeight() * 4f);
    }

    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    // Set the Position ( Vector2 position)
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    public Vector2 getPosition() {
        return new Vector2(sprite.getX(), sprite.getY());
    }

    public Rectangle getBounds() {
        return sprite.getBoundingRectangle();
    }
}