package com.werewolf.backend.test;

import com.werewolf.backend.characters.api.Villager;
import com.werewolf.backend.characters.api.Werewolf;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharacterTest {
    @Test
    public void getTheRightCharacterName(){
        Villager villager = new Villager();
        Werewolf werewolf = new Werewolf();

        assertEquals(villager.getCharacterName(), "Villager");
        assertEquals(werewolf.getCharacterName(), "Werewolf");
    }
}
