package com.weird.game.logic;

import com.badlogic.gdx.Gdx;
import com.weird.game.Bird;

public class MovementHandler {

    private Bird bird;



    public static void update(float delta) {
        Bird.updatePosition();
    }

   public static void touchDown() {
        if(Gdx.input.isButtonJustPressed(0))
        {
            Bird.addGravity();
        }
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}