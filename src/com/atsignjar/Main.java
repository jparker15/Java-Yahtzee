package com.atsignjar;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Die die = new Die ();
        Random rand = new Random();
        Cup cup = new Cup (5);

        cup.roll(rand);
        System.out.println(cup);


        while (true){
            cup.roll(rand, Input.getChoice());
            if(Input.getChoice() > 0 && Input.getChoice() <= 5){
                System.out.println(cup);
                break;
            }
            System.out.println("please enter a value between 1 and 5 ");

        }


    }
}
