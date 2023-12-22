package com.example.TeamManagementSystem.dao;

import com.example.TeamManagementSystem.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<Players,Integer> {
}
