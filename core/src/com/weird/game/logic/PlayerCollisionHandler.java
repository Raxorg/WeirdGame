package com.weird.game.logic;

import com.badlogic.gdx.Gdx;
import com.weird.game.stuff.Bird;
import com.weird.game.stuff.Obstacle;
import com.weird.game.stuff.Stuff;

class PlayerCollisionHandler {

    private Logic logic;
    private Stuff stuff;

    void checkForCollision() {
        Bird bird = stuff.getBird();
        for (Obstacle obstacle : stuff.getObstacles()) {
            if (obstacle.overlaps(bird.getBounds())) {
                reset();
                return;
            }
        }
        if (bird.getBounds().y < 0f || bird.getBounds().y + bird.getBounds().height > Gdx.graphics.getHeight()) {
            reset();
        }
    }

    private void reset() {
        Bird bird = stuff.getBird();
        bird.setPosition(0f, Gdx.graphics.getHeight() / 2f - bird.getBounds().getHeight() / 2f);
        logic.getMovementHandler().initialize();
        logic.getObstacleHandler().spawnObstacles();
        // TODO: logic.getScoreHandler().resetScore();
    }

    void setLogic(Logic logic) {
        this.logic = logic;
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}