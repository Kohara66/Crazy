package com.happy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Happy on 4/3/2016.
 */
public class Game {
    int twoplayer = 2;
    int givecard = 7;
    int eachplayer = 5;
    Card topcard;
    int players;
    int computer;
    Deck Deck = new Deck();
    //player player[] = new player[eachplayer];

    public  ArrayList<Player> Deal(){
        Player player;
        ArrayList<Player> playerList = new ArrayList<Player>();
        String playerName;

        Scanner s = new Scanner(System.in);
        System.out.println("How many players?");
        players = s.nextInt();
        System.out.println("computer playing");
        computer = s.nextInt();

        //Todo maybe create one player and one computer or ask
        if (players > 2) {

            for (int i = 0; i < players; i++) {
                System.out.println("Do you want the player to be :\n1-human\n2- computer");
                int playerSelection = s.nextInt();
                Hand hand = new Hand();
                System.out.println("Player name?");// either human or computer
                playerName = s.next();
                if (playerSelection == 1) {
                    player = new Player(playerName);
                }
                else {
                    player = new Computerplay(playerName);
                }
                for (int j = 0; j<givecard; j++){
                    hand.addcard(Deck.draw());
                }
                player.myTurn = hand;
                playerList.add(player);
            }
        }

        else if (players == 2){

            for (int i = 0; i < 2; i++) {
                System.out.println("Do you want the player to be :\n1-human\n2-computer");
                int playerSelection = s.nextInt();
                Hand hand = new Hand();
                System.out.println("Player name?");
                playerName = s.next();
                if (playerSelection == 1) {
                    player = new Player(playerName);
                }
                else {
                    player = new Computerplay(playerName);
                }
                for (int j = 0; j<givecard; j++){
                    hand.addcard(Deck.draw());
                }
                player.myTurn = hand;
                playerList.add(player);

            }

        }
        else {
            System.out.println("Has to be at least 2 players");
        }

        return playerList;
    }


}







