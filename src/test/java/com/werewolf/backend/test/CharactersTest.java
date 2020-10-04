package com.werewolf.backend.test;

import com.werewolf.backend.characters.impl.Villager;
import com.werewolf.backend.characters.impl.Werewolf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharactersTest {
    @Test
    public void getTheRightCharacterName(){
        Villager villager = new Villager();
        Werewolf werewolf = new Werewolf();

        assertEquals(villager.getCharacterName(), "Villager");
        assertEquals(werewolf.getCharacterName(), "Werewolf");
    }
}
