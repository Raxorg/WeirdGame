package com.weird.game.stuff;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Bird {

    private Sprite sprite;
    private Vector2 speed;

    Bird(Sprite birdSprite) {
        sprite = new Sprite(birdSprite);
        speed = new Vector2();
    }


    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    // Set the Position ( Vector2 position)
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    public float getWidth() {
        return sprite.getWidth();
    }

    public float getHeight() {
        return sprite.getHeight();
    }

    public void setSize(float width, float height) {
        sprite.setSize(width, height);
    }

    public Vector2 getPosition() {
        return new Vector2(sprite.getX(), sprite.getY());
    }


    public Vector2 getSpeed() {
        return speed;
    }
}