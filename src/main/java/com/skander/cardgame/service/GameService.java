package com.skander.cardgame.service;

import com.skander.cardgame.model.Game;
import com.skander.cardgame.model.Hand;
import com.skander.cardgame.utils.CardUtils;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class GameService {


    public Hand getHand() {
        var game=new Game();
        var deck = CardUtils.generateAllDeckCards();
        Collections.shuffle(deck);
        var RandomCards = deck.stream().limit(CardUtils.CARD_NUMBER).collect(Collectors.toList());
        return new Hand(RandomCards, game.sortCards(RandomCards));
    }


}

