package com.weird.game.stuff;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.weird.game.gui.Button;

public class MainMenu {

    private Sprite background;
    private Button playButton;

    public MainMenu(Sprite backgroundSprite, Sprite playButtonSprite) {
        background = new Sprite(backgroundSprite);
        background.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        background.setColor(Color.FOREST.cpy().lerp(Color.WHITE, 0.5f));
        playButton = new Button(playButtonSprite);
        playButton.setSize(playButton.getWidth() * 4f, playButton.getHeight() * 4f);
        playButton.setX(Gdx.graphics.getWidth() / 2f);
        playButton.setY(Gdx.graphics.getHeight() / 2f);
    }

    public void draw(SpriteBatch spriteBatch) {
        background.draw(spriteBatch);
        playButton.draw(spriteBatch);
    }

    public Sprite getBackground() {
        return background;
    }

    public Button getPlayButton() {
        return playButton;
    }
}