package com.card.game.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame{
    private List<Card> deckOfCards;
    protected String name;
    private String[] suits = {"♠","♥","♦","♣"};


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
        Card dealtCard = deckOfCards.get(getDeck().size()-1);
        deckOfCards.remove(deckOfCards.size()-1);
        return dealtCard;
    }

    public List<Card> shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

    public void sortDeckInNumberOrder(){
        List<Card> orderedCards = new ArrayList(deckOfCards.stream().sorted(Comparator.comparingInt(Card::getValue)).collect(Collectors.toList()));
        deckOfCards = orderedCards;
    }

    public void sortDeckIntoSuits(){
        List<Card> orderedCards = new ArrayList<>();
        sortDeckInNumberOrder();
        for(int i =0; i<suits.length; i++){
            for(int j = 0; j<deckOfCards.size(); j++){
                if(suits[i].equals(deckOfCards.get(j).getSuit())){
                    orderedCards.add(deckOfCards.get(j));
                }
            }
        }
        deckOfCards = orderedCards;
    }




}
