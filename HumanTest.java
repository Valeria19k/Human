package com.company;

public class HumanTest {
    public static void main(String[] args) {
        Human a = new Human();
        a.getHead().setHairColor("black");
        a.getLeg().setLegLength(97);
        a.getHand().setHandLength(54);
        System.out.println(a);
    }
}
