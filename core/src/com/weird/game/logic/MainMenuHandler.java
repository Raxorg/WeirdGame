package com.weird.game.logic;

import com.badlogic.gdx.graphics.Color;
import com.weird.game.stuff.MainMenu;

public class MainMenuHandler {

    private MainMenu mainMenu;

    public void hideMainMenu() {
        mainMenu.getBackground().setColor(Color.CLEAR);
        mainMenu.getPlayButton().setColor(Color.CLEAR);
    }

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
}