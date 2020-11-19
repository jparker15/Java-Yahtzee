package com.atsignjar;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Die die = new Die ();
        Random rand = new Random();

        die.roll(rand);
        System.out.println(die);


    }
}
