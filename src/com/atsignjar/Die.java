package com.atsignjar;

import java.util.Random;

public class Die {
    private int value;
    private int sides;

    public Die (){
        sides = 6;
        value =1;
    }

    public void roll (Random rand) {
        value = rand.nextInt(sides) + 1; //1 - 6

    }

    public int getValue(int value){
        return value;
    }

}

