package com.spring.team.controller;

import com.spring.team.config.ApiCall;
import com.spring.team.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/team-players")
public class TeamController {

    @Autowired
    private ApiCall apiCall;

    @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable String from, @PathVariable String to) {
        Map<String, String> urlAttribute = new HashMap<>();
        urlAttribute.put("from", from);
        urlAttribute.put("to", to);
        ResponseEntity<Team> teamResponseEntity = new RestTemplate().getForEntity(
                "http://localhost:8888/football-players/buy/{from}/player/{to}",
                Team.class,
                urlAttribute
        );
        Team teamResponse = teamResponseEntity.getBody();
        Team team = new Team(teamResponse.getId(), teamResponse.getFrom(), teamResponse.getTo(), teamResponse.getMoneyTeam(), "NONE", "50");
        return team;
    }

    @GetMapping("/teamNew/{from}/player/{to}")
    public Team teamWithPlayerNew(@PathVariable String from,@PathVariable String to){


        Team teamResponse = apiCall.getFootballPlayer(from, to);
        teamResponse.setNote("no");
        teamResponse.setMoneyTeam(20);
       // Team team = new Team(teamResponse.getId(),teamResponse.getFrom(),teamResponse.getTo(),teamResponse.getMoneyTeam(),"NONE","50");
        return teamResponse;
    }


}


  /*  @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable String from, @PathVariable String to) {
        Team team = new Team(1, from, to, 100, "NONE", "50");
        return team;
    }*/



/*

 @GetMapping("/team/{from}/player/{to}")
 public Team teamWithPlayer(@PathVariable String from, @PathVariable String to){
 Map<String, String> urlAttribute=new HashMap<>();
 urlAttribute.put("from",from);
 urlAttribute.put("to",to);

 ResponseEntity<Team> teamResponseEntitye= new RestTemplate().getForEntity(
 "http://localhost:8888/Football-players/buy/from/player/to",
 Team.class,
 urlAttribute
 );
 Team teamResponse=teamResponseEntitye.getBody();
 Team team=new Team(teamResponse.getId(),teamResponse.getFrom(),teamResponse.getTo(),teamResponse.getMoneyTeam(),"NONE","50");
 return team;
 }
 */

