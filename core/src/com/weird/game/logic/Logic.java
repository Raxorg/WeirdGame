package com.weird.game.logic;

import com.weird.game.stuff.MainMenu;
import com.weird.game.stuff.Stuff;

/**
 * This class connects all the logic handlers with their respective required resources they need to work with
 */
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
        playerCollisionHandler.setLogic(this);
    }

    public void initialState() {
        obstacleHandler.spawnObstacles();
        movementHandler.initialize();
    }

    public void update(float delta) {
        movementHandler.movePlayer(delta);
        obstacleHandler.moveObstacles(delta);
        playerCollisionHandler.checkForCollision();
    }

    public void setMainMenu(MainMenu mainMenu) {
        inputHandler.setMainMenu(mainMenu);
        mainMenuHandler.setMainMenu(mainMenu);
    }

    public void setStuff(Stuff stuff) {
        movementHandler.setBird(stuff.getBird());
        obstacleHandler.setStuff(stuff);
        playerCollisionHandler.setStuff(stuff);
    }

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    MainMenuHandler getMainMenuHandler() {
        return mainMenuHandler;
    }

    MovementHandler getMovementHandler() {
        return movementHandler;
    }

    ObstacleHandler getObstacleHandler() {
        return obstacleHandler;
    }
}