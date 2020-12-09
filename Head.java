package com.company;

public class Head {
    String hairColor;
    Head(){

    }
    Head(String hairColor){
        this.hairColor=hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                '}';
    }
}
