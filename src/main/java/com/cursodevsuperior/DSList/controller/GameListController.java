package com.cursodevsuperior.DSList.controller;

import com.cursodevsuperior.DSList.dto.GameListDTO;
import com.cursodevsuperior.DSList.dto.GameMinDTO;
import com.cursodevsuperior.DSList.service.GameListService;
import com.cursodevsuperior.DSList.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping("/lists")
    public List<GameListDTO> findAllList() {
        return gameListService.findAllGamesList();
    }

    @GetMapping("/lists/{id}/games")
    public List<GameMinDTO> findByList(@PathVariable Long id) {
        return gameService.findGamesByList(id);
    }
}
