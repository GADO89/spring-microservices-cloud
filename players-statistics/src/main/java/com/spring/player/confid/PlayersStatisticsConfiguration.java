package com.spring.player.confid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("players.statistics")
public class PlayersStatisticsConfiguration {

    private int numberTeams;
    private int numberPlayers;

    private String country;

    public PlayersStatisticsConfiguration() {
    }

    public PlayersStatisticsConfiguration(int numberTeams, int numberPlayers, String country) {
        this.numberTeams = numberTeams;
        this.numberPlayers = numberPlayers;
        this.country = country;
    }

    public int getNumberTeams() {
        return numberTeams;
    }

    public void setNumberTeams(int numberTeams) {
        this.numberTeams = numberTeams;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
