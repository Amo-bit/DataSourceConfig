package com.example.dbconfig.repository.dbone;

import com.example.dbconfig.entity.dbone.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
