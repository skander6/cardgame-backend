package com.skander.cardgame.utils;

import com.skander.cardgame.model.Card;
import com.skander.cardgame.model.Color;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CardUtilsTest {

    @DisplayName("Should Give a one completed Card")
    @Test
    void generateAllDeckCards() {
        var cards = CardUtils.generateAllDeckCards();
        assertThat(cards).containsOnly(
                new Card(1, Color.TREFLE),
                new Card(2, Color.TREFLE),
                new Card(3, Color.TREFLE),
                new Card(4, Color.TREFLE),
                new Card(5, Color.TREFLE),
                new Card(6, Color.TREFLE),
                new Card(7, Color.TREFLE),
                new Card(8, Color.TREFLE),
                new Card(9, Color.TREFLE),
                new Card(10, Color.TREFLE),
                new Card(11, Color.TREFLE),
                new Card(12, Color.TREFLE),
                new Card(13, Color.TREFLE),

                new Card(1, Color.CARREAUX),
                new Card(2, Color.CARREAUX),
                new Card(3, Color.CARREAUX),
                new Card(4, Color.CARREAUX),
                new Card(5, Color.CARREAUX),
                new Card(6, Color.CARREAUX),
                new Card(7, Color.CARREAUX),
                new Card(8, Color.CARREAUX),
                new Card(9, Color.CARREAUX),
                new Card(10, Color.CARREAUX),
                new Card(11, Color.CARREAUX),
                new Card(12, Color.CARREAUX),
                new Card(13, Color.CARREAUX),

                new Card(1, Color.COEUR),
                new Card(2, Color.COEUR),
                new Card(3, Color.COEUR),
                new Card(4, Color.COEUR),
                new Card(5, Color.COEUR),
                new Card(6, Color.COEUR),
                new Card(7, Color.COEUR),
                new Card(8, Color.COEUR),
                new Card(9, Color.COEUR),
                new Card(10, Color.COEUR),
                new Card(11, Color.COEUR),
                new Card(12, Color.COEUR),
                new Card(13, Color.COEUR),

                new Card(1, Color.PIQUE),
                new Card(2, Color.PIQUE),
                new Card(3, Color.PIQUE),
                new Card(4, Color.PIQUE),
                new Card(5, Color.PIQUE),
                new Card(6, Color.PIQUE),
                new Card(7, Color.PIQUE),
                new Card(8, Color.PIQUE),
                new Card(9, Color.PIQUE),
                new Card(10, Color.PIQUE),
                new Card(11, Color.PIQUE),
                new Card(12, Color.PIQUE),
                new Card(13, Color.PIQUE)
        );
    }

}