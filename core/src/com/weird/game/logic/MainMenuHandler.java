package com.weird.game.logic;

import com.badlogic.gdx.graphics.Color;
import com.weird.game.stuff.MainMenu;

class MainMenuHandler {

    private MainMenu mainMenu;
    // Logic
    private boolean hidden;

    void hideMainMenu() {
        mainMenu.getBackground().setColor(Color.CLEAR);
        mainMenu.getPlayButton().setColor(Color.CLEAR);
        hidden = true;
    }

    public boolean isHidden() {
        return hidden;
    }

    void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
}