package com.company;

public class Leg {
    public int legLength;
    Leg(){
    }
    Leg(int legLength){
        this.legLength=legLength;
    }
    public void setLegLength(int legLength) {
        this.legLength = legLength;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + legLength +
                '}';
    }
}
