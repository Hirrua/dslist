package com.cursodevsuperior.DSList.controller;

import com.cursodevsuperior.DSList.entities.Game;
import com.cursodevsuperior.DSList.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public List<Game> findAll() {
        return gameService.findAllGames();
    }
}
