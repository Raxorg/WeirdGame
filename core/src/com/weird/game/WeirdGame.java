package com.weird.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.weird.game.logic.Logic;

public class WeirdGame extends ApplicationAdapter {

    private Logic logic;
    private Bird bird;
    private SpriteBatch spriteBatch;

    @Override
    public void create() {
        logic = new Logic();

        Input input = new Input();
        input.setLogic(logic);

        Sprite birdSprite = new Sprite(new Texture("texture.png"), 136, 0, 17, 12);
        bird = new Bird(birdSprite);
        logic.setBird(bird);

        spriteBatch = new SpriteBatch();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.2f, 0.5f, 1f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        logic.update(Gdx.graphics.getDeltaTime());

        spriteBatch.begin();
        bird.draw(spriteBatch);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
    }
}
