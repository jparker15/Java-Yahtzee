package com.atsignjar;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Die die = new Die ();
        Random rand = new Random();
        Cup cup = new Cup (5);



        Input.welcome();
        Input.demo();
//        cup.roll(rand);
//        System.out.println(cup);
////        cup.roll(rand, Input.getChoices());
////        System.out.println(cup);
//
//       cup.roll(rand, Input.getChoices());
//        System.out.println(cup);
    }
}
