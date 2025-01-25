package com.cursodevsuperior.DSList.service;

import com.cursodevsuperior.DSList.dto.GameListDTO;
import com.cursodevsuperior.DSList.entities.GameList;
import com.cursodevsuperior.DSList.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAllGamesList() {
        List<GameList> entities = gameListRepository.findAll();
        return entities.stream().map(GameListDTO::new).toList();
    }
}
