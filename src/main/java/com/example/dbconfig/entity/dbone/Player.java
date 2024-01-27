package com.example.dbconfig.entity.dbone;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String Name;
    private Double rating;

    public Player(String name, Double rating) {
        Name = name;
        this.rating = rating;
    }

    public Player() {

    }
}
