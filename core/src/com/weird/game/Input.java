package com.weird.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.weird.game.logic.Logic;

/**
 * This class processes the raw input for later use by the adequate logic handlers
 */
public class Input extends InputAdapter {

    private Logic logic;

    Input() {
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (pointer != 0) {
            return false;
        }
        logic.getInputHandler().touchDown(screenX, Gdx.graphics.getHeight() - screenY);
        return true;
    }

    void setLogic(Logic logic) {
        this.logic = logic;
    }
}