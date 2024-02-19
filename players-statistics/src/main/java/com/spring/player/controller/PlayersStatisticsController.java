package com.spring.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.player.confid.PlayersStatisticsConfiguration;
import com.spring.player.moel.PlayersStatistics;
@RestController
@RequestMapping("/players-management")
public class PlayersStatisticsController {

    @Autowired
    private PlayersStatisticsConfiguration playersStatisticsConfiguration;

    @GetMapping("/statistics")
    public PlayersStatistics getPlayersStatistics(){
        return new PlayersStatistics(playersStatisticsConfiguration.getNumberTeams(),playersStatisticsConfiguration.getNumberPlayers(),playersStatisticsConfiguration.getCountry());
    }

}
