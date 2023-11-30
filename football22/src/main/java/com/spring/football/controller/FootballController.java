package com.spring.football.controller;

import com.spring.football.model.PlayerTeam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Football-players")
public class FootballController {

    @GetMapping("/buy")
    public PlayerTeam byPlayer(){
        return new PlayerTeam(1,"Barce","City",500,600);
    }
}
