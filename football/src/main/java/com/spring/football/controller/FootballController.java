package com.spring.football.controller;

import com.spring.football.dao.PlayerTeamDao;
import com.spring.football.model.PlayerTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Football-players")
public class FootballController {

    @Autowired
    private PlayerTeamDao playerTeamDao;

    @GetMapping("/buy/{from}/player/{to}")
    public PlayerTeam byPlayer(@PathVariable String from, @PathVariable String to){
      PlayerTeam playerTeam=   playerTeamDao.findByFromAndTo(from, to);

        return playerTeam  ;
    }
}
