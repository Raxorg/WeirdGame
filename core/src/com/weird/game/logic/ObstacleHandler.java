package com.weird.game.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.weird.game.stuff.Obstacle;
import com.weird.game.stuff.Stuff;

class ObstacleHandler {

    private Stuff stuff;

    void spawnObstacles() {
        Obstacle[] obstacles = stuff.getObstacles();
        obstacles[0].setX(Gdx.graphics.getWidth());
        obstacles[1].setX(Gdx.graphics.getWidth() * 1.333f + obstacles[1].getWidth() / 3f);
        obstacles[2].setX(Gdx.graphics.getWidth() * 1.666f + obstacles[2].getWidth() * (2f / 3f));
    }

    void moveObstacles(float delta) {
        for (Obstacle obstacle : stuff.getObstacles()) {
            obstacle.setX(obstacle.getX() - 250f * delta);
            if (obstacle.getX() < -obstacle.getWidth()) {
                respawnObstacle(obstacle);
            }
        }
    }

    private void respawnObstacle(Obstacle obstacle) {
        float randomHeight = MathUtils.random(Gdx.graphics.getHeight() / 6f, Gdx.graphics.getHeight() * 0.7f);
        obstacle.setHeight(randomHeight);
        obstacle.setX(Gdx.graphics.getWidth());
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}