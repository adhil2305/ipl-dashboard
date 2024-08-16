package io.hit.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.hit.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
