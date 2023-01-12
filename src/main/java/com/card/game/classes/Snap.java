package com.card.game.classes;

import com.card.game.classes.Card;
import com.card.game.classes.CardGame;

import java.util.*;

public class Snap extends CardGame {
    private Scanner scanner = new Scanner(System.in);
    public Snap(String name) {
        super(name);
    }

    public void run(){
        List<Player> players = new ArrayList<>();
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        players.add(player1);
        players.add(player2);
        shuffleDeck();
        System.out.println("Welcome to snap. Here's the first card:" );
        Card previousCard = dealCard();
        System.out.println(previousCard);
        Random random = new Random();
        int currentPlayer = random.nextInt(2) ;
        for(int i =0; i<players.size(); i++){
            if(players.get(i).getId() == currentPlayer+1){
                players.get(i).setTurn();
            }
        }
        while(getDeck().size()>0){
            for(int i = 0; i<players.size(); i++){
                if(players.get(i).isTurn()){
                    System.out.println("Player " + players.get(i).getId() + "'s turn:");
                    break;
                }
            }
            System.out.println("Press Enter");
            scanner.nextLine();
            Card currentCard = dealCard();
            System.out.println(currentCard);
            if (previousCard.getSymbol().equals(currentCard.getSymbol())){
                System.out.println("SNAP");
                for(int i = 0; i<players.size(); i++){
                    if(players.get(i).isTurn()){
                        players.get(i).getInput();
                        break;
                    }
                }
                break;
            }

            for(int i = 0; i<players.size(); i++){
                    players.get(i).setTurn();
            }

            previousCard = currentCard;
        }
        System.out.println("END GAME.");
    }
}
