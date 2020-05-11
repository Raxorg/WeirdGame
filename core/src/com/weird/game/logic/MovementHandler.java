package com.weird.game.logic;

import com.weird.game.Bird;

public class MovementHandler {

    private Bird bird;


    public void update(float delta) {
        bird.updatePosition();
    }

    void touchDown() {
        // Here we make the bird go up or "flap"
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}