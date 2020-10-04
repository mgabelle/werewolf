package com.werewolf.backend.test;

import com.werewolf.backend.game.Game;
import com.werewolf.backend.player.Player;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GameTest {
    private static List<Player> listPlayerStub;
    private static int listPlayerStubSize = 10;

    @Before
    public void setup() {
        generateListPlayer(listPlayerStubSize);
    }

    @Test
    public void basicTestOnGameClass(){
        Game game = new Game(listPlayerStub);

        //Same size for player list
        assertEquals(game.getPlayerList().size(),listPlayerStub.size());
    }

    @Test
    public void playerListIsWellShuffled() {
        Game game = new Game(listPlayerStub);
        generateListPlayer(listPlayerStubSize);
        assertNotEquals(game.getPlayerList(), listPlayerStub);
    }

    private static void generateListPlayer(int size) {
        listPlayerStub = new ArrayList<Player>();
        listPlayerStub.clear();
        IntStream.range(0, size).forEach(n -> listPlayerStub.add(new Player("Player" + n)));
    }
}
