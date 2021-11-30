package com.skander.cardgame.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
@Getter
public enum CardKind {
    AS("1"), VALET("11"), DAME("12"), ROI("13"),
    DEUX("2"),TROIX("3"),QUATRE("4"),CINQ("5"),
    SIX("6"),SEPT("7"),HUIT("8"),NEUF("9"),DIX("10");
    private final String symbol;


}