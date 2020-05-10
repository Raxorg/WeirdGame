package com.weird.game.logic;

import com.weird.game.Bird;
import com.weird.game.stuff.MainMenu;

public class Logic {

    private InputHandler inputHandler;
    private MainMenuHandler mainMenuHandler;
    private MovementHandler movementHandler;
    private ObstacleHandler obstacleHandler;
    private PlayerCollisionHandler playerCollisionHandler;
    private ScoreHandler scoreHandler;

    public Logic() {
        inputHandler = new InputHandler();
        mainMenuHandler = new MainMenuHandler();
        movementHandler = new MovementHandler();
        obstacleHandler = new ObstacleHandler();
        playerCollisionHandler = new PlayerCollisionHandler();
        scoreHandler = new ScoreHandler();

        inputHandler.setLogic(this);
    }

    public void update(float delta) {
        movementHandler.update(delta);
    }

    public void setMainMenu(MainMenu mainMenu) {
        inputHandler.setMainMenu(mainMenu);
        mainMenuHandler.setMainMenu(mainMenu);
    }

    public void setBird(Bird bird) {
        movementHandler.setBird(bird);
    }

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    public MainMenuHandler getMainMenuHandler() {
        return mainMenuHandler;
    }
}