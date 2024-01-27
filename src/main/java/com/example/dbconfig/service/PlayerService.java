package com.example.dbconfig.service;

import com.example.dbconfig.entity.dbone.Player;
import com.example.dbconfig.repository.dbone.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Scheduled(fixedDelay = 1000)
    public void run(){
        playerRepository.save(new Player("Sam", 563.1));
    }
}
