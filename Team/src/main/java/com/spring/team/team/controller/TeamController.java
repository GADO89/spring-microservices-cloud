package com.spring.team.team.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.team.team.model.Team;

@RestController
@RequestMapping("/team-players")
public class TeamController {


    @GetMapping("/team/{fromValue}/player/{toValue}")
    public Team teamWithPlayer(@PathVariable String from, @PathVariable String to){
        Map<String, String> urlAttribute=new HashMap<>();
        urlAttribute.put(from,"fromValue");
        urlAttribute.put(to,"toValue");
        ResponseEntity <Team> teamresponseEntity= new RestTemplate().getForEntity(
                "http://localhost:8888/football-players/buy/{fromValue}/player/{toValue}",
                Team.class,
                urlAttribute
        );
        Team teamResponse=teamresponseEntity.getBody();
        Team team=new Team(teamResponse.getId(),teamResponse.getFromValue(),teamResponse.getToValue(),teamResponse.getMoneyTeam(),"NONE","50");
        return team;
    }
}





//@GetMapping("/team/{from}/player/{to}")
//public Team teamWithPlayer(@PathVariable String from, @PathVariable String to){
//
//    Team team=new Team(1L,from,to,100,"NONE","50");
//    return team;
//}