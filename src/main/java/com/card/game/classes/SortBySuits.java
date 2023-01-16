package com.card.game.classes;

import java.util.Comparator;

public class SortBySuits implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSuit().compareTo(card2.getSuit());
    }
}
