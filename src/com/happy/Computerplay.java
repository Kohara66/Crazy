package com.happy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Happy on 4/3/2016.
 */
public class Computerplay extends Player {
    private final Hand myTurn;

    public Computerplay(String name) {
        super(name);
        myTurn = new Hand();
        hasCC = true;
    }



    //Todo: add code for computers automatic playing
    public void play(){
        int cardsInHand = myTurn.inhand();
        for (Card card : myTurn.cards){
            if (card.rank == Main.topcard.cards.get(0).rank) {
                Main.topcard.addTopcard(card);
                myTurn.removecard(card);

                break;
            }
            else if (card.suit == Main.topcard.cards.get(0).suit){
                Main.topcard.addTopcard(card);
                myTurn.removecard(card);
                break;
            }

        }
        int newCardsInHand = myTurn.inhand();
        if (cardsInHand == newCardsInHand){
            myTurn.addcard(Main.Deck.draw());
        }
        System.out.println("Computer is done playing.");//show when the  computer done playing its turn
    }
}














