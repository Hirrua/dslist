package com.cursodevsuperior.DSList.controller;

import com.cursodevsuperior.DSList.dto.GameListDTO;
import com.cursodevsuperior.DSList.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    public List<GameListDTO> findAllList() {
        return gameListService.findAllGamesList();
    }
}
