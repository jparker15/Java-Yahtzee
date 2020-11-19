package com.atsignjar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cup {
    private ArrayList<Die> dice = new ArrayList<>();

    public Cup (int size){
        for (int count = 0; count < size; count++){
            dice.add(new Die());
        }
    }

    public void roll(Random rand){
        // for each die in dice
        for (var die: dice) {
            die.roll(rand);
        }
    }
    // single roll die
    public void roll (Random rand, int choice){
        dice.get(choice).roll(rand);
    }

    public void roll (Random rand, List<Integer> choices){
        for (int choice: choices) {
            dice.get(choice).roll(rand);
//            roll(rand,choice);
        }
    }

    @Override
    public String toString(){
        String output = "";
        for (Die die:dice) {
            output += die.getValue() + "";
        }
        return output.trim();
    }
}
