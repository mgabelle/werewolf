package com.werewolf.backend.characters;

public abstract class Character {
    protected String characterName;
    protected Character hasVotedFor;

    protected boolean isAlive = true;
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

    public void logCharacterInformations() {
        System.out.println("Character name : " + this.characterName);
        System.out.println("Is alive : " + this.isAlive);
    }

    public String getCharacterName() {
        return this.characterName;
    }
}
