package com.spring.team.team.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.team.team.model.Team;

@RestController
@RequestMapping("/team-players")
public class TeamController {


    @GetMapping("/buy/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable String from, @PathVariable String to){
        Team team=new Team(1L,"from","to",500,"NONE","50");
        return team;
    }
}
