package com.cursodevsuperior.DSList.service;

import com.cursodevsuperior.DSList.dto.GameMinDTO;
import com.cursodevsuperior.DSList.entities.Game;
import com.cursodevsuperior.DSList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }
}
