package com.spring.football.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.football.model.PlayerTeam;

@Repository
public interface PlayerTeamDao extends JpaRepository<PlayerTeam, Long> {

      public PlayerTeam findByFromAndTo(String from, String to);
}
