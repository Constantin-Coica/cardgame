package com.card.game.classes;

 class Card {
    private String suit;
    private String symbol;
    protected int value;



    protected Card(String suit, String symbol, int value){
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }

    protected String getSuit() {
        return suit;
    }

    private void setSuit(String suit) {
        this.suit = suit;
    }

    protected String getSymbol() {
        return symbol;
    }

    private void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    protected int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

}
