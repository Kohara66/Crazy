package com.happy;

/**
 * Created by Happy on 4/3/2016.
 */
public class Player {
    String name;
    Hand myTurn;
    boolean hasCC;


    public Player( String name){
        this.myTurn =  new Hand();
        this.name = name;
        hasCC = false;
    }
    public void  ci(Card c){
        myTurn.getcard(c);// to get card from deck

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getHand(){

        return myTurn.nameofcard();
    }

    public void show(){
        System.out.println(this.myTurn);
    }


    public void play() {
        System.out.println("Not a computer");
    }
}




