package com.weird.game.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.weird.game.Bird;

public class MovementHandler {

    private Bird bird;


    public void update(float delta) {
     bird.updatePosition();
    }



    public void setBird(Bird bird) {
        this.bird = bird;
    }
}