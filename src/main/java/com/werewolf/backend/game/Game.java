package com.werewolf.backend.game;

import com.werewolf.backend.characters.impl.Villager;
import com.werewolf.backend.characters.impl.Werewolf;

import java.util.Collections;
import java.util.List;

public class Game {
    private int numberOfVillagers;
    private int numberOfWerewolfs;
    private List<Player> playerList;

    public Game(List<Player> playerList) {
        this.playerList = playerList;
        setNumberOfRoles();
        assignCharacters(playerList);
    }

    //We want 30% of werewolves
    private void setNumberOfRoles() {
        numberOfWerewolfs = Math.floorDiv(playerList.size(), 3);
        numberOfVillagers = playerList.size() - numberOfWerewolfs;
    }

    private void assignCharacters(List<Player> playerList) {
        Collections.shuffle(playerList);
        playerList.subList(0, numberOfWerewolfs).forEach(player -> player.setCharacter(new Werewolf()));
        playerList.subList(numberOfWerewolfs, numberOfVillagers).forEach(player -> player.setCharacter(new Villager()));
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public int getNumberOfVillagers() {
        return numberOfVillagers;
    }

    public int getNumberOfWerewolfs() {
        return numberOfWerewolfs;
    }
}
