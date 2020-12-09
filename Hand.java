package com.company;

public class Hand {
    public int handLength;
    Hand(){
    }
    Hand(int handLength){
        this.handLength=handLength;
    }
    public void setHandLength(int handLength) {
        this.handLength = handLength;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handLength=" + handLength +
                '}';
    }
}
