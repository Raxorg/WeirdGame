package com.weird.game.stuff;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Obstacle {

    private Sprite top, bottom;

    Obstacle(Sprite obstacleTopSprite, Sprite obstacleBottomSprite) {
        top = new Sprite(obstacleTopSprite);
        top.setSize(top.getWidth() * 2f, top.getHeight() * 2f);
        top.setY(Gdx.graphics.getHeight() / 2f);
        bottom = new Sprite(obstacleBottomSprite);
        bottom.setSize(bottom.getWidth() * 2f, Gdx.graphics.getHeight() / 2f);
        bottom.setX(bottom.getWidth() / 22f);
    }

    public void draw(SpriteBatch spriteBatch) {
        top.draw(spriteBatch);
        bottom.draw(spriteBatch);
    }

    public float getX() {
        return top.getX();
    }

    public void setX(float x) {
        top.setX(x);
        bottom.setX(x + bottom.getWidth() / 22f);
    }

    public float getWidth() {
        return top.getWidth();
    }
}