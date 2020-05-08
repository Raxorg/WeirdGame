package com.weird.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Bird {

    private Sprite sprite;
    private Vector2 speed;

    public Bird(Sprite birdSprite) {
        sprite = new Sprite(birdSprite);
        sprite.setSize(sprite.getWidth() * 4f, sprite.getHeight() * 4f);
        speed = new Vector2();
    }

    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    public float getX() {
        return sprite.getX();
    }

    public void setX(float x) {
        sprite.setX(x);
    }

    public float getY() {
        return sprite.getY();
    }

    public void setY(float y) {
        sprite.setY(y);
    }

    public Vector2 getSpeed() {
        return speed;
    }
}