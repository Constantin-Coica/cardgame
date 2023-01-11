package com.card.game;

import com.card.game.classes.Snap;

public class Main {
    public static void main(String[] args) {
        Snap snap = new Snap("Test");
        snap.shuffleDeck();
        snap.run();


    }
}