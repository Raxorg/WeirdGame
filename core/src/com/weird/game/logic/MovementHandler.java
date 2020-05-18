package com.weird.game.logic;

import com.badlogic.gdx.math.Vector2;
import com.weird.game.stuff.Bird;

class MovementHandler {

    private Bird bird;
    private Vector2 velocity, gravity;

    void initialize() {
        velocity = new Vector2(0f, 500f);
        gravity = new Vector2(0f, -10f);
    }

    void movePlayer(float delta) {
        updatePosition(delta);
    }

    // Updating the Position & Gravity of sprite
    private void updatePosition(float delta) {
        velocity.add(gravity);
        Vector2 newPosition = bird.getPosition().mulAdd(velocity, delta);
        bird.setPosition(newPosition.x, newPosition.y);
    }

    void touchDown() {
        // Add vertical velocity
        velocity.set(0f, 300f);
    }

    void setBird(Bird bird) {
        this.bird = bird;
    }
}