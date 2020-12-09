package com.company;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(){
        head = new Head();
        leg = new Leg();
        hand=new Hand();
    }
    public Head getHead() {
        return head;
    }
    public void setHead(Head head)
    {
        this.head = head;
    }

    public Leg getLeg(){
        return leg;
    }
    public void setLeg(Leg leg){
        this.leg = leg;
    }

    public Hand getHand(){
        return hand;
    }
    public void setHand(Hand hand){
        this.hand = hand;
    }

    public String toString(){
        return "Human{"+
                "head=" + head.toString() +
                ",leg=" + leg.toString()+
                ",hand=" + hand.toString() + '}';

    }
}
