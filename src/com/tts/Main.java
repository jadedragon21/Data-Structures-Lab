package com.tts;

import java.util.Scanner;

public class Main {

    private final static Scanner redQueenInSpace = new Scanner(System.in);

    public static void main(String[] args) {

        boolean correctAnswer = false;
        String userReply = "";

        System.out.println("Loopy Napping Lab!\nWelcome to the fun that is this exercise!\nDo you wanna play a game?");
        pressEnterKey();

        boolean forgingAhead = true;

        while (forgingAhead) {
            int usersChoice = 0;
            correctAnswer = false;
            while (!correctAnswer) {
                System.out.println("Welcome to the Main Menu.\nWhich program would you like to run?");
                System.out.println("1. Twilight Math Plus Zone");
                System.out.println("2. Stan's Car Dealership in Space!");
                System.out.println("Q. Exiting Stage Right");
                userReply = redQueenInSpace.nextLine();

                try {
                    usersChoice = Integer.parseInt(userReply);
                    correctAnswer = true;
                } catch (NumberFormatException erroar) {
                    if (userReply.contains("q")) {
                        correctAnswer = true;
                        forgingAhead = false;
                        System.out.println("I quit...this program that is...Gotcha!");
                    } else {
                        System.out.println("Doh! There was an error: " + erroar);
                        System.out.println("That reply was wrong. Please try again...");
                        correctAnswer = false;
                    }
                }

            }
            switch (usersChoice) {
                case 0 -> System.out.println("Look behind you, a Three-Headed Space Monkey!");
                case 1 -> beginMathPlus();
                case 2 -> beginStansCarDealershipInSpace();
                default -> System.out.println("There are only 3 options!  Enter the correct one, three-headed space monkey! You replied with: " + userReply);
            }


        }

        System.out.println("You have been nowhere and everywhere. You've seen nothing and everything.");
    }

    private static void beginMathPlus() {
        System.out.println("You have entered the Twilight Math Plus Zone! Be confused and amazed! ");
        pressEnterKey();
        new TwilightMathPlusZone();
    }

    private static void beginStansCarDealershipInSpace() {
        System.out.println("Launching Stan's Car Dealership into SPACE!");
        pressEnterKey();

        new StansCareDealership();
    }

    private static void pressEnterKey() {
        System.out.print("Press the Enter key to continue on this wonderful confusing journey of programming...");
        redQueenInSpace.nextLine();
    }
}