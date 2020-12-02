package com.atsignjar;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);
    protected static Cup cup = new Cup(5);
    protected static Random rand = new Random();

    static public void welcome(){

        while(true){
            System.out.println("Welcome to Yahztee! \nWould you like to play?");
            String answer = scanner.nextLine();
            if(answer.toLowerCase().contains("n")){
                break;
            }
            System.out.println("First Hand:");
            cup.roll(rand);
            System.out.println(cup);
            System.out.println("Would you like to re-roll your hand?");
            String reroll = scanner.nextLine();
            if(reroll.toLowerCase().contains("n")){
                break;
            }
            getChoices();
            System.out.println(cup);
            System.out.println("Would you like to re-roll a specific die?");
            String singleroll = scanner.nextLine();
            if(singleroll.toLowerCase().contains("n")){
                break;
            }
            getChoice();



        }


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


        System.out.println("Choose numbers of dice to re-roll?");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        for (String number: inputArray){
            choices.add(Integer.parseInt(number) -1 );
        }
        return choices;
    }
}
