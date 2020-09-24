package com.werewolf.backend.characters;

import java.util.ArrayList;

public abstract class Character {
    protected String characterName;
    protected boolean isAlive = true;
    protected Character hasVotedFor;
    protected int numberOfVotes = 0;

    public Character(String characterName){
        this.characterName = characterName;
    }

    public void vote(Character character) {
        this.hasVotedFor = character;
        character.numberOfVotes += 1;
    }

    public void cancelVote() {
        this.hasVotedFor.numberOfVotes -= 1;
        this.hasVotedFor = null;
    }

    public void setDead() {
        this.isAlive = false;
        this.killedMessage();
    }

    public void killedMessage() {
        System.out.println(String.format("The %s has been killed", this.characterName));
    }

    public void logCharacter() {
        System.out.println("Character type : " + this.characterName);
        System.out.println("Is alive : " + this.isAlive);
    }

    public String getCharacterName() {
        return this.characterName;
    }
}
