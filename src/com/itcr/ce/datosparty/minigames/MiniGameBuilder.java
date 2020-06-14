package com.itcr.ce.datosparty.minigames;

import com.itcr.ce.datosparty.Handler;
import com.itcr.ce.datosparty.dataStructures.lists.LinkedList;
import com.itcr.ce.datosparty.logic.Game;
import com.itcr.ce.datosparty.minigames.states.*;
import com.itcr.ce.datosparty.states.State;

public class MiniGameBuilder {

    public static void build(LinkedList<State> gameList, int playerNumber, Handler handler, Game game){

        gameList.add(new DuelMiniGame(handler, playerNumber, game));
        gameList.add(new SecondMinigameState(handler, playerNumber, game));
        gameList.add(new ThirdMinigameState(handler, playerNumber, game));
        gameList.add(new FourthMinigameState(handler, playerNumber, game));
        gameList.add(new BustedPaintballState(handler, playerNumber, game));
        gameList.add(new ClickerArtistState(handler, playerNumber, game));
        gameList.add(new SeventhMinigameState(handler, playerNumber, game));
        gameList.add(new EighthMinigameState(handler, playerNumber, game));

    }
}
