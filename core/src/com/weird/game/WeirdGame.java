package com.weird.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.weird.game.logic.Logic;
import com.weird.game.stuff.MainMenu;

public class WeirdGame extends ApplicationAdapter {

    private Logic logic;
    private MainMenu mainMenu;
    private Bird bird;
    private SpriteBatch spriteBatch;

    @Override
    public void create() {
        logic = new Logic();

        Input input = new Input();
        input.setLogic(logic);
        // Initialize the main menu
        Sprite backgroundSprite = new Sprite(new Texture("pixel.png"));
        Sprite playButtonSprite = new Sprite(new Texture("texture.png"), 0, 83, 29, 16);
        mainMenu = new MainMenu(backgroundSprite, playButtonSprite);
        logic.setMainMenu(mainMenu);
        // Initialize the bird
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
        mainMenu.draw(spriteBatch);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
    }
}
