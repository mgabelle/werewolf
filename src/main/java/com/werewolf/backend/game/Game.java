package com.werewolf.backend.game;

import com.werewolf.backend.characters.impl.Villager;
import com.werewolf.backend.characters.impl.Werewolf;
import com.werewolf.backend.manage.GameManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int numberOfVillagers;
    private int numberOfWerewolfs;
    private Status status = Status.NOT_STARTED;
    private List<Player> playerList;

    public Game(){
        addGameToList(this);
    }

    public Game(List<Player> playerList) {
        this.playerList = playerList;
        setNumberOfRoles();
        assignCharacters(playerList);
        addGameToList(this);
    }

    //We want 30% of werewolves
    private void setNumberOfRoles() {
        numberOfWerewolfs = Math.floorDiv(playerList.size(), 3);
        numberOfVillagers = playerList.size() - numberOfWerewolfs;
    }

    public void assignCharacters(List<Player> playerList) {
        Collections.shuffle(playerList);
        playerList.subList(0, numberOfWerewolfs).forEach(player -> player.setCharacter(new Werewolf()));
        playerList.subList(numberOfWerewolfs, numberOfVillagers).forEach(player -> player.setCharacter(new Villager()));
    }

    public void start() {
        this.setStatus(Status.STARTED);
    }

    public void end() {
        this.setStatus(Status.ENDED);
    }

    public void addGameToList(Game game) {
        GameManager.addGame(game);
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    private void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() { return this.status; }
}
