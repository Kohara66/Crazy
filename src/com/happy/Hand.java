package com.happy;

import java.util.ArrayList;

/**
 * Created by Happy on 4/3/2016.
 */
public class Hand {
    ArrayList<Card> cards = new ArrayList<Card>();


    public int inhand() {
        int cardhand = this.cards.size();
        return cardhand;
    }

    public void showH() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }

    }

    public void addcard(Card acard) {
        cards.add(acard);

    }
    public void removecard(Card removecard){

        cards.remove(removecard);
    }
    public void getcard(Card ca){
        cards.add(ca);
    }
    public String nameofcard(){
        return this.cards.get(0).toString();

    }
    public String toString(){
        return this.cards.toString();
    }
}






