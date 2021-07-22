package com.atsignjar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cup {
    public ArrayList<Die> dice = new ArrayList<>();

    public Cup (){

    }

    public void roll(Random rand){
        // for each die in dice
        for (var die: dice) {

        }
    }
    // single roll die
    public void roll (Random rand, int choice){

    }

    public void roll (Random rand, List<Integer> choices){
        for (int choice: choices) {

//            roll(rand,choice);
        }
    }

    @Override
    public String toString(){
        String output = "";
        for (Die die:dice) {
            output += die.value + "";
        }
        return output.trim();
    }
}
