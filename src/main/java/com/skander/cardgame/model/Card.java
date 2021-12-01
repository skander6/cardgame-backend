package com.skander.cardgame.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import net.minidev.json.annotate.JsonIgnore;
import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;
import java.util.Optional;

@Getter
@EqualsAndHashCode
public class Card {
    private final int value;
    private final Color color;
    private CardKind symbol;


    public Card(int value, Color color) {
        this.value = value;
        this.color = color;
        getSymbol().ifPresent(sym->this.symbol=sym);
    }

    //Get the symbol of the card
    public Optional<CardKind> getSymbol(){
        for(CardKind card : CardKind.values()){
            if(card.getSymbol().equals(Integer.toString(this.value))){
                return Optional.of(card);
            }
        }
        return Optional.empty();

    }

}
