package com.weird.game.logic;

import com.weird.game.Bird;

public class Logic {

    private MenuHandler menuHandler;
    private MovementHandler movementHandler;
    private ObstacleHandler obstacleHandler;
    private PlayerCollisionHandler playerCollisionHandler;
    private ScoreHandler scoreHandler;

    public Logic() {
        menuHandler = new MenuHandler();
        movementHandler = new MovementHandler();
        obstacleHandler = new ObstacleHandler();
        playerCollisionHandler = new PlayerCollisionHandler();
        scoreHandler = new ScoreHandler();
    }

    public void update(float delta) {
        movementHandler.update(delta);
    }

    public void setBird(Bird bird) {
        movementHandler.setBird(bird);
    }
}