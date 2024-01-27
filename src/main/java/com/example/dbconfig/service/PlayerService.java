package com.example.dbconfig.service;

import com.example.dbconfig.entity.dbone.Player;
import com.example.dbconfig.repository.dbone.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Scheduled(fixedDelay = 1000)
    public void run(){
        val player = Player.builder().name("Sam").rating(563.1).build();
        log.info("Execute for player: {}", player);
        playerRepository.save(player);
    }
}
