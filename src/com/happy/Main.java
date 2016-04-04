package com.happy;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static TopCard topcard = new TopCard();
    public  static  Deck Deck;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Game Game = new Game();
        Deck = Game.Deck;
        ArrayList<Player> playerList;
        boolean won = false;
        //Game Loop
        while (true) {
            playerList = Game.Deal();

            topcard.addTopcard(Deck.draw()); //draw card from deck
            //Play Loop
            while (!won) for (Player p : playerList) {
                if (p.hasCC) {
                    p.play();
                    if (p.myTurn.cards.isEmpty()) {
                        System.out.println(p.getName() + " Voila! You Won!"); // shows  who wins the game
                        won = true;
                    }
                    break;
                }

                p.show();
                topcard.shows();
                int cards;

                do {

                    System.out.println("1-draw a card and continue\n2-try to play a card"); //if you want play the card you hold or
                    // draw card so this code let's  you to draw or play
                    System.out.println("Enter your selection"); //let's you the select either 1 to draw or 2 to play
                    while (!s.hasNextInt()) {
                        System.out.println("That is not the correct selection");//if you select different word or number from option you have
                        // so it doesn't let you select other keyword
                        s.next();
                    }
                    cards = s.nextInt();
                }
                while (cards <= 1 && cards > 2);//this option to select 1 or 2


                if (cards == 1) {
                    //  if you select 1 is to  draw card
                    p.myTurn.addcard(Deck.draw());
                }
                if (cards == 2) {
                    // if you select 2 it lets you to play
                    p.show();
                    for (int i = 0; i < p.myTurn.cards.size(); i++) {
                        System.out.print(i + "\t\t\t");

                    }

                    System.out.println();
                    System.out.println("What card do you want to play?"); //this give option what card you want to play
                    int play;
                    do {
                        System.out.println("What card you want to play?");
                        System.out.println("Enter card to play");//lets you to enter card
                        while (!s.hasNextInt()) {
                            System.out.println("That is not the card");
                            s.next();
                        }
                        play = s.nextInt();

                    } while (play <= 0 && play > p.myTurn.inhand());
                    int oldSize = topcard.cards.size();
                    Card toAdd = p.myTurn.cards.get(play);
                    topcard.addTopcard(toAdd);
                    int newSize = topcard.cards.size();
                    if (oldSize == newSize) {
                        int decision;

                        do {
                            System.out.println("You don't have anything to play");
                            System.out.println("1-draw a card\n2-Pass");
                            System.out.println("Enter your selection");     // codes gives option draw card or pass next player
                            while (!s.hasNextInt()) {
                                System.out.println("That is not the selection");
                                s.next();
                            }
                            decision = s.nextInt();
                        }
                        while (decision <= 1 && decision > 2);


                        if (decision == 1) {
                            p.myTurn.addcard(Deck.draw());
                        }
                    } else {
                        p.myTurn.removecard(toAdd);
                    }
                }
                if (p.myTurn.cards.isEmpty()) {
                    System.out.println(p.getName() + "Voila! You Won!");
                    won = true;
                    break;
                }
            }
            won = false;

            System.out.println("play again enter y");
            String name = s.next();

            if (!name.equals("y")) {
                break;

            }
        }

    }
}




