package com.spring.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.football.Dao.PlayerTeamDao;
import com.spring.football.model.PlayerTeam;

@RestController
@RequestMapping("/football-players")
public class FootballPlayer {


    @Autowired
    private PlayerTeamDao playerTeamDao;
    @GetMapping("/buy/{from}/player/{to}")
    public PlayerTeam buyPlayer(@PathVariable String from, @PathVariable String to){
        PlayerTeam playerTeam=playerTeamDao.findByFromAndTo(from, to);
        return playerTeam;
    }


}
