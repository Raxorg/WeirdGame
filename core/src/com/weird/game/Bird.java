package com.weird.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.weird.game.logic.MovementHandler;

public class Bird {

    private static Sprite sprite;
    private static Vector2 position, speed,velocity,gravity,defaultPosition;

    private  static  final Vector2 damping = new Vector2(0.99f,0.99f);


    public Bird(Sprite birdSprite) {
        sprite = new Sprite(birdSprite);
        defaultPosition = new Vector2();
        position = new Vector2();
        speed = new Vector2();
        velocity = new Vector2();
        gravity = new Vector2();


        // Center of the Screen
        defaultPosition.set((Gdx.graphics.getWidth() /2) - (sprite.getWidth() / 2) , (Gdx.graphics.getHeight() /2 )-
                (sprite.getHeight()/2));

        sprite.setSize(sprite.getWidth() * 4f, sprite.getHeight() * 4f);
        sprite.setPosition(defaultPosition.x,defaultPosition.y );

        velocity.set(0,500);
        gravity.set(0,-4);
    }



    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    // Set the Position ( Vector2 position)
    public void setPosition(float x,float y)
    {
        position.x = x;
        position.y = y;
    }

    // set Gravity
    public static void gravityOfBird()
    {
        velocity.scl(damping);
        velocity.add(gravity);
        position.mulAdd(velocity, Gdx.graphics.getDeltaTime());
    }

    public static void addGravity()
    {
       velocity.scl(damping);
       velocity.set(defaultPosition.x,( position.y + velocity.y ) * 0.5f);
    }

    // Updating the Position & Gravity of sprite
    public static void  updatePosition()
    {
        gravityOfBird();

        sprite.setPosition(defaultPosition.x,position.y );
        MovementHandler.touchDown();
    }

    public Vector2 getPosition() {
        return position;
    }




    public Vector2 getSpeed() {
        return speed;
    }
}