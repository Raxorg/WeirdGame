package com.weird.game.logic;

import com.weird.game.stuff.MainMenu;

public class InputHandler {

    private Logic logic;
    private MainMenu mainMenu;

    public void touchDown(float x, float y) {
        if (mainMenu.getPlayButton().contains(x, y)) {
            logic.getMainMenuHandler().hideMainMenu();
        }
    }

    void setLogic(Logic logic) {
        this.logic = logic;
    }

    void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
}