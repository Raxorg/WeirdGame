package com.weird.game.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.weird.game.stuff.Bird;

class MovementHandler {

    private Bird bird;
    private Vector2 velocity, gravity, defaultPosition;
    private final Vector2 damping = new Vector2(0.99f, 0.99f);

    void initialize() {
        defaultPosition = new Vector2();
        velocity = new Vector2();
        gravity = new Vector2();

        // Center of the Screen
        defaultPosition.set((Gdx.graphics.getWidth() / 2f) - (bird.getWidth() / 2f), (Gdx.graphics.getHeight() / 2f) -
                (bird.getHeight() / 2));

        bird.setSize(bird.getWidth() * 4f, bird.getHeight() * 4f);
        bird.setPosition(defaultPosition.x, defaultPosition.y);

        velocity.set(0, 500);
        gravity.set(0, -4);
    }

    void movePlayer(float delta) {
        updatePosition(delta);
    }

    // Updating the Position & Gravity of sprite
    private void updatePosition(float delta) {
        gravityOfBird(delta);

        bird.setPosition(defaultPosition.x, bird.getPosition().y);
    }

    // set Gravity
    private void gravityOfBird(float delta) {
        velocity.scl(damping);
        velocity.add(gravity);
        Vector2 newPosition = bird.getPosition().mulAdd(velocity, delta);
        bird.setPosition(newPosition.x, newPosition.y);
    }

    private void addGravity() {
        velocity.scl(damping);
        velocity.set(defaultPosition.x, (bird.getPosition().y + velocity.y) * 0.5f);
    }

    void touchDown() {
        addGravity();
    }

    void setBird(Bird bird) {
        this.bird = bird;
    }
}