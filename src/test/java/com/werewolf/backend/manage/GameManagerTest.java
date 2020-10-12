package com.werewolf.backend.manage;

import com.werewolf.backend.game.Game;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GameManagerTest {
    private Game game1;
    private Game game2;
    private ArrayList<Game> gameList;

    @Before
    public void setup() {
        game1 = new Game();
        game2 = new Game();
        gameList = new ArrayList<>();
        gameList.add(game1);
        gameList.add(game2);
    }

    @Test
    public void manageGames() {
        assertEquals(gameList, GameManager.getGamesList());
        assertEquals(2, GameManager.getGamesList().size());

        GameManager.removeGame(game1);
        gameList.remove(game1);

        assertEquals(gameList, GameManager.getGamesList());
        assertEquals(1, GameManager.getGamesList().size());
    }
}