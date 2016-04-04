package com.happy;

/**
 * Created by Happy on 4/3/2016.
 */
public class Card {

    String suit;
    String rank;
    private final String suits[] = {"Hearts", "Spades", "Diamond", "Clubs"};


    private final String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    int value;

    Card(String suit, String rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getValue(String rank) {
        for (int i = 0; i < rank.length(); i++) {
            if (this.ranks[i].equals(this.rank)) {
                value = i + 1;
            }


        }
        return value;
    }




    public String getSuit() {

        return suit;
    }

    public void setSuit(String suit) {

        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {

        this.rank = rank;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString(){

        return this.rank  + " of " + suit;
    }
}





