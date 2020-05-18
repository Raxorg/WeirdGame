package com.weird.game.logic;

import com.badlogic.gdx.math.Vector2;
import com.weird.game.stuff.Bird;

class MovementHandler {

    private Bird bird;
    private Vector2 velocity, gravity;

    void initialize() {
        velocity = new Vector2(0f, 400f);
        gravity = new Vector2(0f, -15f);
    }

    // Updating the Position & Gravity of sprite
    void movePlayer(float delta) {
        velocity.add(gravity);
        Vector2 newPosition = bird.getPosition().mulAdd(velocity, delta);
        bird.setPosition(newPosition.x, newPosition.y);
    }

    void touchDown() {
        // Add vertical velocity
        velocity.set(0f, 400f);
    }

    void setBird(Bird bird) {
        this.bird = bird;
    }
}