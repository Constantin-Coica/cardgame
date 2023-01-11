package com.card.game.classes;

import com.card.game.classes.Card;
import com.card.game.classes.CardGame;

import java.util.Scanner;

public class Snap extends CardGame {
    private Scanner scanner = new Scanner(System.in);
    public Snap(String name) {
        super(name);
    }

    public void run(){
        shuffleDeck();
        System.out.println("Welcome to snap. First card:");
        Card previousCard = dealCard();
        System.out.println(previousCard);
        while(getDeck().size()>0){
            System.out.println("Press Enter");
            scanner.nextLine();
            Card currentCard = dealCard();
            System.out.println(currentCard);
            if (previousCard.getSymbol().equals(currentCard.getSymbol())){
                System.out.println("SNAP");
                break;
            }
            previousCard = currentCard;
        }
        System.out.println("END GAME.");
    }
}
