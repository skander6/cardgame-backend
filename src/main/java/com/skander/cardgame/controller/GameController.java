package com.skander.cardgame.controller;

import com.skander.cardgame.model.Hand;
import com.skander.cardgame.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameController {
    @Autowired
    private final GameService gameService;


    @GetMapping(value = "getCards")
    public Hand getHand() {

        return new Hand();
    }


}

