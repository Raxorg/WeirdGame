package com.weird.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Bird {

    private Sprite sprite;
    private Vector2 position, speed;

    public Bird(Sprite birdSprite) {
        sprite = new Sprite(birdSprite);
        sprite.setSize(sprite.getWidth() * 4f, sprite.getHeight() * 4f);
        position = new Vector2();
        speed = new Vector2();
    }

    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getSpeed() {
        return speed;
    }
}