package com.werewolf.backend.test;

import com.werewolf.backend.characters.CharacterName;
import com.werewolf.backend.characters.impl.Villager;
import com.werewolf.backend.characters.impl.Werewolf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharactersTest {
    private Villager villager;
    private Werewolf werewolf;

    @Before
    public void setup() {
        villager = new Villager();
        werewolf = new Werewolf();
    }

    @Test
    public void getTheRightCharacterName(){
        assertEquals(CharacterName.VILLAGER, villager.getCharacterName());
        assertEquals(CharacterName.WEREWOLF, werewolf.getCharacterName());

        assertEquals("villager", CharacterName.VILLAGER.getCharacterName());
        assertEquals("werewolf", CharacterName.WEREWOLF.getCharacterName());
    }

    @Test
    public void charactersVoteTest() {
        Villager villager1 = new Villager();
        assertEquals(0, villager1.getNumberOfVotes());

        villager.vote(villager1);
        assertEquals(1, villager1.getNumberOfVotes());
        assertEquals(villager1, villager.getHasVotedFor());

        villager.cancelVote();
        assertEquals(0, villager1.getNumberOfVotes());
    }

    @Test
    public void lifeOfCharacterTest() {
        assertTrue(villager.isAlive());
        villager.setDead();
        assertFalse(villager.isAlive());
    }
}
