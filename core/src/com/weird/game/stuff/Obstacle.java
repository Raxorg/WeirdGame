package com.weird.game.stuff;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Obstacle {

    private Sprite top, bottom;

    Obstacle(Sprite obstacleTopSprite, Sprite obstacleBottomSprite) {
        top = new Sprite(obstacleTopSprite);
        top.setSize(top.getWidth() * 3f, top.getHeight() * 3f);
        top.setY(Gdx.graphics.getHeight() / 3f);
        bottom = new Sprite(obstacleBottomSprite);
        bottom.setSize(bottom.getWidth() * 3f, Gdx.graphics.getHeight() / 3f);
        bottom.setX(bottom.getWidth() / 22f);
    }

    public void draw(SpriteBatch spriteBatch) {
        bottom.draw(spriteBatch);
        top.draw(spriteBatch);
    }

    public boolean overlaps(Rectangle rectangle) {
        return top.getBoundingRectangle().overlaps(rectangle) || bottom.getBoundingRectangle().overlaps(rectangle);
    }

    public void setHeight(float height) {
        top.setY(height);
        bottom.setSize(bottom.getWidth(), height + top.getHeight() / 2f);
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