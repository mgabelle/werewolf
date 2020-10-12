package com.werewolf.backend.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@EnableAutoConfiguration
public class LaunchGame {
    @RequestMapping("/")
    String werewolfWelcome() {
        return "Welcome to the werewolf App";
    }

    public static void main(String[] args) {
        SpringApplication.run(LaunchGame.class, args);
    }
}
