package com.weird.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.weird.game.logic.Logic;
import com.weird.game.stuff.MainMenu;
import com.weird.game.stuff.Obstacle;
import com.weird.game.stuff.Stuff;

public class WeirdGame extends ApplicationAdapter {

    private Logic logic;
    private MainMenu mainMenu;
    private Stuff stuff;
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
        // Initialize bird and obstacles (stuff)
        stuff = new Stuff();
        stuff.initializeStuff();
        logic.setStuff(stuff);
        // Let the Logic object configure the initial state of the handlers before updating each frame
        logic.initialState();

        spriteBatch = new SpriteBatch();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.2f, 0.5f, 1f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        logic.update(Gdx.graphics.getDeltaTime());

        spriteBatch.begin();
        stuff.getBird().draw(spriteBatch);
        for (Obstacle obstacle : stuff.getObstacles()) {
            obstacle.draw(spriteBatch);
        }
        mainMenu.draw(spriteBatch);
        spriteBatch.end();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
    }
}
