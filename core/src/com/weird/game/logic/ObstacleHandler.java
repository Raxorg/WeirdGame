package com.weird.game.logic;

import com.badlogic.gdx.Gdx;
import com.weird.game.stuff.Obstacle;
import com.weird.game.stuff.Stuff;

class ObstacleHandler {

    private Stuff stuff;

    void moveObstacles(float delta) {
        for (Obstacle obstacle : stuff.getObstacles()) {
            obstacle.setX(obstacle.getX() - 200f * delta);
            if (obstacle.getX() < -obstacle.getWidth()) {
                obstacle.setX(Gdx.graphics.getWidth());
            }
        }
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}