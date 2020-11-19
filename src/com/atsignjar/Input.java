package com.atsignjar;


import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);

    static public void welcome(){
        System.out.println("Welcome.\n Yahtzeeee!");
    }
    static public int getChoice(){
        int choice;
        while (true){
            System.out.println("Choose a die between 1 and 5 to re-roll");
            choice = scanner.nextInt();
            if(choice > 0 && choice <= 5){
                break;
            }
            System.out.println("enter a value between 1 and 5");
        }
        return choice - 1;
    }
}
