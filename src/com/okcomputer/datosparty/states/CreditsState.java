package com.okcomputer.datosparty.states;

import com.okcomputer.datosparty.GameLoop;
import com.okcomputer.datosparty.Handler;
import com.okcomputer.datosparty.gfx.Assets;
import com.okcomputer.datosparty.userInterface.*;

import java.awt.*;

public class CreditsState extends State{
    private final UIManager uiManager;


    public CreditsState(Handler handler){
        super(handler);
        uiManager = new CreditsUI(handler);

        uiManager.addObject(new UIImage(20,10,5*2,5*2, Assets.notOKComputerIcon));
        uiManager.addObject(new UIImage(16,19,2*9, 2, Assets.notOKComputer));
        uiManager.addObject(new UIImage(7,26,9*4, 4, Assets.nothingHereMessage));

        uiManager.addObject(new UIImageButton(20, 30, 3*3, 3, Assets.backButton,
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
