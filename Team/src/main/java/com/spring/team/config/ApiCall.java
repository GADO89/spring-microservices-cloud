package com.spring.team.config;

import com.amazonaws.ClientConfiguration;
import com.spring.team.model.Team;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "football-players", url ="localhost:8888")
@FeignClient(name = "football-players", url = "localhost:8888",
        configuration = ClientConfiguration.class)
public interface ApiCall {

    @GetMapping("/football-players/buy/{from}/player/{to}")
    public Team getFootballPlayer(@PathVariable String from,@PathVariable String to);


}
