package com.spring.team.controller;

import com.spring.team.model.Team;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/team-players")
public class TeamController {

    @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable String from, @PathVariable String to){
    Team team=new Team(1,from,to,100,"NONE","50");
    return team;
    }
}
