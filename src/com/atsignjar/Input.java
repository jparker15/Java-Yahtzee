package com.atsignjar;


import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);

    static public void welcome(){
        System.out.println("Welcome.\n Yahtzeeee!");
    }

    //TODO: add try catch add exceptions // parseInt
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

    static public ArrayList<Integer> getChoices(){
        ArrayList<Integer> choices = new ArrayList<>();

        System.out.println("Choose a dice to re-roll?");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        for (String number: inputArray){
            choices.add(Integer.parseInt(number) -1 );
        }

        return choices;
    }
}
