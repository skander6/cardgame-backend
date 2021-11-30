package com.skander.cardgame.model;

import com.skander.cardgame.utils.CardUtils;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Game {

    public List<Color> colorOrder() {
        return CardUtils.colorOrder;
    }

    public List<Integer> valuesOrder() {
        return CardUtils.valuesOrder;
    }

    public List<Card> sortCards(Collection<Card> randomCards) {
        return randomCards.stream().sorted(comparator()).collect(Collectors.toList());
    }

    //The comparing logic for the sort, is to compare according to the color then according to the values
    private Comparator<Card> comparator() {
        Comparator<Card> colorComparator = Comparator.comparingInt(card -> colorOrder().indexOf(card.getColor()));
        Comparator<Card> valuesComparator = Comparator.comparingInt(card -> valuesOrder().indexOf(card.getValue()));
        return colorComparator.thenComparing(valuesComparator);
    }

}

