package com.example.TeamManagementSystem.service;


import com.example.TeamManagementSystem.dao.PlayersRepository;
import com.example.TeamManagementSystem.entity.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersServiceImpl implements PlayersService {

    @Autowired
    private PlayersRepository playersRepository;

    public PlayersServiceImpl(PlayersRepository playersRepository){
        this.playersRepository=playersRepository;
    }

    @Override
    public List<Players> findAllPlayers() {
      return playersRepository.findAll();
    }
}
