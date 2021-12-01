package com.skander.cardgame.service;

import com.skander.cardgame.model.Card;
import com.skander.cardgame.model.Game;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class GameServiceTest {
    private GameService gameService = new GameService();
    @Test
    @DisplayName("Should get a list of random and sorted cards")
    void getHand() {
        var game = new Game();
        var hand = gameService.getHand();


        Comparator<Card> colorComparator = Comparator.comparingInt(card -> game.colorOrder().indexOf(card.getColor()));
        Comparator<Card> valuesComparator = Comparator.comparingInt(card -> game.valuesOrder().indexOf(card.getValue()));

        assertThat(hand).isNotNull();
        assertThat(hand.getSortedCards()).hasSize(10);
        assertThat(hand.getSortedCards()).isSortedAccordingTo(colorComparator.thenComparing(valuesComparator));
    }
}