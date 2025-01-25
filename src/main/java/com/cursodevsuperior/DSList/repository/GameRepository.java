package com.cursodevsuperior.DSList.repository;

import com.cursodevsuperior.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
