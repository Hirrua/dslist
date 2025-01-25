package com.cursodevsuperior.DSList.service;

import com.cursodevsuperior.DSList.dto.GameDTO;
import com.cursodevsuperior.DSList.dto.GameMinDTO;
import com.cursodevsuperior.DSList.entities.Game;
import com.cursodevsuperior.DSList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames() {
        List<Game> entities = gameRepository.findAll();
        return entities.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findOneGameById(Long id) throws NoSuchElementException {
        Game entity = gameRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Game not found"));
        return new GameDTO(entity);
    }
}
