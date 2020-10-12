package com.werewolf.backend.manage;

import com.werewolf.backend.game.Game;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static List<Game> gamesList = new ArrayList<>();

    public static void removeGame(Game game) {
        gamesList.remove(game);
    }

    public static void addGame(Game game) { gamesList.add(game); }

    public static List<Game> getGamesList() { return gamesList; }
}
