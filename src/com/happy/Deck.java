package com.happy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Happy on 4/3/2016.
 */
public class Deck {

    ArrayList<Card> cards = new ArrayList<Card>();

    private final String suits[] = {"Hearts", "Spades", "Diamond", "Clubs"};

    private final String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    //int totalCard = 52;
    //card deck[];
    //Random rand = new Random();

    public Deck(){
        //int i = 0;
        for (int i = 0; i<suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(suits[i], ranks[j]));
            }

        }
//shuffle deck
        shuffle();

    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        return this.cards.remove(0);

    }
    public final Card getcard(){
        cards.get(0);

        return cards.get(0);
    }
}



