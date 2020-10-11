package com.werewolf.backend.test;

import com.werewolf.backend.characters.CharacterName;
import com.werewolf.backend.characters.impl.Villager;
import com.werewolf.backend.characters.impl.Werewolf;
import com.werewolf.backend.player.Player;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private static String PSEUDO_TEST = "myPseudo";

    @Test
    public void getPlayerPseudo() {
        Player player = new Player(PSEUDO_TEST);
        assertEquals(PSEUDO_TEST, player.getPseudo());
    }

    @Test
    public void assignCharacterToPlayer() {
        Player player = new Player(PSEUDO_TEST);
        assertNull(player.getCharacter());

        Werewolf werewolf = new Werewolf();
        player.setCharacter(werewolf);
        assertEquals(werewolf, player.getCharacter());

        Player player1 = new Player(PSEUDO_TEST, new Villager());
        assertEquals(CharacterName.VILLAGER, player1.getCharacter().getCharacterName());
    }
}