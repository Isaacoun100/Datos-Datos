package com.okcomputer.datosparty.states;

import com.okcomputer.datosparty.Handler;
import com.okcomputer.datosparty.gfx.Assets;
import com.okcomputer.datosparty.userInterface.*;

import java.awt.*;

public class GameState extends State{

    private final UIManager uiManager;

    public GameState(Handler handler){

        super(handler);

        uiManager = new GameUI(handler);

        uiManager.addObject(new UIImage(6,6,2*20,2*3,Assets.titleImage));

        uiManager.addObject(new UIImageButton(20, 25, 3*3, 3, Assets.backButton,
                () -> State.setState(handler.getGameLoop().mainMenuState)));

    }

    @Override
    public void tick() {
        handler.getMouseManager().setUiManager(uiManager);
        uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
        uiManager.render(g);
    }

}
