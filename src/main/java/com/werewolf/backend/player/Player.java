package com.werewolf.backend.player;

import com.werewolf.backend.characters.Character;

public class Player {
    private String pseudo;
    private Character character;

    public Player(String pseudo) {
        this.pseudo = pseudo;
    }

    public Player(String pseudo, Character character) {
        this(pseudo);
        this.character = character;
    }

    public void logPlayerInformations() {
        System.out.println("Player pseudo : " + this.getPseudo());
        this.character.logCharacterInformations();
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return this.character;
    }
    public String getPseudo() {
        return pseudo;
    }
}
