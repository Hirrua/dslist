package com.cursodevsuperior.DSList.controller;

import com.cursodevsuperior.DSList.dto.GameDTO;
import com.cursodevsuperior.DSList.dto.GameMinDTO;
import com.cursodevsuperior.DSList.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public List<GameMinDTO> findAll() {
        return gameService.findAllGames();
    }

    @GetMapping("/games/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findOneGameById(id);
    }
}
