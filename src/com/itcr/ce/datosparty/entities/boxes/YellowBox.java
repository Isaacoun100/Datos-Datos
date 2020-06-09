package com.itcr.ce.datosparty.entities.boxes;

import com.itcr.ce.datosparty.gfx.Assets;
import com.itcr.ce.datosparty.entities.Player;
import com.itcr.ce.datosparty.logic.*;

import java.awt.*;

public class YellowBox extends Box {

    EventLogic eventLogic = new EventLogic();

    public YellowBox(float x, float y, int width, int height) {
        super(x, y, width, height);
    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.yellowBox,(int) x,(int) y, width, height, null);
    }

    @Override
    public void boxAction(Player player, Game game) {
        game.setCurrentEvent(game.eventStack.pop());
        switch (game.getCurrentEvent()) {
            case DUEL -> System.out.println("DUEL"); // WIP
            case STEAL_COINS -> eventLogic.pauseEvent(game);
            case GIFT_COINS -> eventLogic.giftCoins(player, game);
            case LOSE_STAR -> eventLogic.loseStar(player, game);
            case WIN_2_STARS -> eventLogic.winTwoStars(player, game);
            case WIN_5_STARS -> eventLogic.winFiveStars(player, game);
            case STEAL_STAR -> eventLogic.stealStar(player, game);
            case TELEPORT -> eventLogic.teleport(player, game);
            case SWAP_PLAYERS -> eventLogic.swapPlayers(player, game);
            default -> System.out.println("Couldn't find event");
        }
        player.setBoxAction(false);
    }
}
