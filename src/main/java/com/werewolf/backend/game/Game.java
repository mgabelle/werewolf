package com.werewolf.backend.game;

import com.werewolf.backend.characters.Character;
import com.werewolf.backend.characters.api.Villager;
import com.werewolf.backend.characters.api.Werewolf;

import java.util.ArrayList;

public class Game {
    private int numberOfVillagers = 0;
    private int numberOfWerewolfs = 0;
    private ArrayList<Character> characters;

    public Game(int numberOfVillagers, int numberOfWerewolfs) {
        characters.add(new Villager());
        characters.add(new Werewolf());
    }

    public void addCharacter(Character character) {
        this.characters.add(character);
    }

    public void addMultipleCharacters(ArrayList<Character> characters) {
        this.characters.addAll(characters);
    }
/**
    public static <T extends Character> ArrayList<T> generateListCharacter(int numberOfCharacters) {
        ArrayList<T> characters = new ArrayList<T>();
        for (int n = 0; n < numberOfCharacters; n++) {
            characters.add(new T());
        }
    }
 */
}
