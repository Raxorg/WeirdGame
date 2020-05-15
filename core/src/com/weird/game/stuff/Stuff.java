package com.weird.game.stuff;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * This class stores all the stuff that's gonna exist in the game
 */
public class Stuff {

    private Bird bird;
    private Obstacle[] obstacles;

    public void initializeStuff() {
        initializeBird();
        initializeObstacles();
    }

    private void initializeBird() {
        Sprite birdSprite = new Sprite(new Texture("texture.png"), 136, 0, 17, 12);
        bird = new Bird(birdSprite);
    }

    private void initializeObstacles() {
        obstacles = new Obstacle[3];
        Sprite obstacleTop = new Sprite(new Texture("texture.png"), 192, 0, 24, 14);
        Sprite obstacleBottom = new Sprite(new Texture("texture.png"), 136, 16, 22, 3);
        obstacles[0] = new Obstacle(obstacleTop, obstacleBottom);
        obstacles[0].setX(Gdx.graphics.getWidth());
        obstacles[1] = new Obstacle(obstacleTop, obstacleBottom);
        obstacles[1].setX(Gdx.graphics.getWidth() * 1.33f);
        obstacles[2] = new Obstacle(obstacleTop, obstacleBottom);
        obstacles[2].setX(Gdx.graphics.getWidth() * 1.66f);
    }

    public Bird getBird() {
        return bird;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }
}