package org.example.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame implements Comparable<Card>{
    private List<Card> deckOfCards;
    private String name;
    private String[] suits = {"\u2660","\u2665","\u2666","\u2663"};

    public CardGame(String name){
        this.name = name;
        deckOfCards = new ArrayList<>();
        for(int i = 2; i<15; i++){
            for(int j = 0; j<suits.length;j++){
                switch (i){
                    case 11:
                        deckOfCards.add(new Card(suits[j],"J",i));
                        break;
                    case 12:
                        deckOfCards.add(new Card(suits[j],"Q",i));
                        break;
                    case 13:
                        deckOfCards.add(new Card(suits[j],"K",i));
                        break;
                    case 14:
                        deckOfCards.add(new Card(suits[j],"A",i));
                        break;
                    default:
                        deckOfCards.add(new Card(suits[j],Integer.toString(i),i));
                }
            }
        }
    }

    public List<Card> getDeck(){
        return deckOfCards;
    }

    public void printEachDeckCard(){
        for(Card card : getDeck()){
            System.out.println(card.toString());
        }
    }

    public Card dealCard(){
        return getDeck().get(getDeck().size()-1);
    }

    public List<Card> shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }


    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
