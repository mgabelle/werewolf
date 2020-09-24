package com.werewolf.backend.game;

import com.werewolf.backend.characters.Character;
import com.werewolf.backend.characters.api.Villager;
import com.werewolf.backend.characters.api.Werewolf;

import java.util.LinkedList;

public class Game {
    private LinkedList<Character> characters;

    public Game(int numberOfVillagers, int numberOfWerewolfs) {
        characters.add(new Villager());
        characters.add(new Werewolf());
    }

    public void removeCharacter(Character character) {
        this.characters.remove(character);
    }

    public void addCharacter(Character character) {
        this.characters.add(character);
    }
}
