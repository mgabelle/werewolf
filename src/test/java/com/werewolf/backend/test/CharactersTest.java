package com.werewolf.backend.test;

import com.werewolf.backend.characters.impl.Villager;
import com.werewolf.backend.characters.impl.Werewolf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        assertEquals(villager.getCharacterName(), "Villager");
        assertEquals(werewolf.getCharacterName(), "Werewolf");
    }

    @Test
    public void charactersVoteTest() {
        Villager villager1 = new Villager();
        assertEquals(villager1.getNumberOfVotes(),0);

        villager.vote(villager1);
        assertEquals(villager1.getNumberOfVotes(), 1);
        assertEquals(villager.getHasVotedFor(), villager1);

        villager.cancelVote();
        assertEquals(villager1.getNumberOfVotes(), 0);
    }
}
