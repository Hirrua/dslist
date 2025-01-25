package com.cursodevsuperior.DSList.repository;

import com.cursodevsuperior.DSList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
