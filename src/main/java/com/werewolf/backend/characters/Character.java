package com.werewolf.backend.characters;

public abstract class Character {
    protected CharacterName characterName;
    protected Character hasVotedFor;
    protected boolean isAlive = true;
    protected int numberOfVotes;

    public Character(CharacterName characterName){
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

    public CharacterName getCharacterName() {
        return this.characterName;
    }

    public int getNumberOfVotes() { return  this.numberOfVotes; }

    public Character getHasVotedFor() { return this.hasVotedFor; }

    public boolean isAlive() { return this.isAlive; }
}
