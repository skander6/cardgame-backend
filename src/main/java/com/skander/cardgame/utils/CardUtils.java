package com.skander.cardgame.utils;

import com.skander.cardgame.model.Card;
import com.skander.cardgame.model.Color;
import lombok.experimental.UtilityClass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@UtilityClass
public class CardUtils {
   private final int START_VALUE = 1;
   private final int MAX_VALUE = 14;
   public static final int CARD_NUMBER = 10;
   private static final Random RANDOM = new Random();
   public static final List<Color> colorOrder = getRandomColors();
   public static final List<Integer> valuesOrder = getRandomValuesWithRepetition();

   //Generate the whole Card
    public static List<Card> generateAllDeckCards() {
        return IntStream.range(1, 14)
                .mapToObj(value -> List.of(
                        new Card(value, Color.TREFLE),
                        new Card(value, Color.COEUR),
                        new Card(value, Color.CARREAUX),
                        new Card(value, Color.PIQUE)
                        ))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    };

    List<Color> getRandomColors() {
        var colors = Arrays.asList(Color.values());
        Collections.shuffle(colors);
        return colors;
    }



    private static List<Integer> getRandomValuesWithRepetition() {
        return IntStream.range(0, CARD_NUMBER)
                .map(i -> RANDOM.nextInt(MAX_VALUE - START_VALUE) + START_VALUE)
                .boxed()
                .collect(Collectors.toList());
    }
}
