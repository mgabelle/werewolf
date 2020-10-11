package com.werewolf.backend.characters;

public enum CharacterName {
    VILLAGER("villager"),
    WEREWOLF("werewolf");

    private String characterName;

    CharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }
}
