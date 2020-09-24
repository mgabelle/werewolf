package com.werewolf.backend.main;

import com.werewolf.backend.characters.api.Villager;

public class LaunchGame {
    public static void main(String[] args) {
        Villager villager1 = new Villager();
        villager1.setDead();
        villager1.logCharacter();
    }
}
