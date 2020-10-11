package com.werewolf.backend.manage;

import com.werewolf.backend.game.Game;

import java.util.List;

public class GameMaster {
    private static List<Game> gamesList = Game.getGamesList();

    public static void removeGame(Game game) {
        gamesList.remove(game);
    }
}
