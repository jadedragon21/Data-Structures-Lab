package com.tts;

import java.util.Scanner;

public class TwilightMathPlusZone {
    private final static int DEFLT_SIZE = 5;
    private double[] numberZone;
    private final Scanner redQueenInSpace = new Scanner(System.in);

    public TwilightMathPlusZone(int mathSizeMatters) {
        newList(mathSizeMatters);
        playMathsIntro();
        grabNumbers();
        visualizeList();
        showMaths();
    }

    public TwilightMathPlusZone() {
        this(DEFLT_SIZE);
    }

    private void newList(int dimensions) {
        numberZone = new double[dimensions];
    }

    private void playMathsIntro() {
        System.out.println("I'm going to ask you for " + numberZone.length + " numbers, and then we'll inspect them like Math Inspector Gadget!");
    }

    private double getSum() {
        double sum = 0;
        for (double numbr : numberZone)
            sum += numbr;
        return sum;
    }

    private double grabProduct() {
        double prdct = 1;
        for (double numbr : numberZone
        ) {
            prdct *= numbr;
        }
        return prdct;
    }

    private double getLargest() {
        double largestNum = numberZone[0];
        for (double numbr : numberZone
        ) {
            if (numbr > largestNum) largestNum = numbr;
        }
        return largestNum;
    }

    private double getSmallest() {
        double smallestNum = numberZone[0];
        for (double numbr : numberZone
        ) {
            if (numbr < smallestNum) smallestNum = numbr;
        }
        return smallestNum;
    }

    private void grabNumbers() {
        for (int i = 0; i < numberZone.length; i++) {
            double userTheWay = 0.666;
            boolean entryMindWipe = false;
            while (!entryMindWipe) {
                System.out.print("Please enter number #" + (i + 1) + ": ");
                try {
                    userTheWay = Double.parseDouble(redQueenInSpace.nextLine());
                    entryMindWipe = true;
                } catch (NumberFormatException Erroar) {
                    System.out.println("Doh! You got the error: " + Erroar);
                    System.out.println("That's not the way to type it in! One more time...");
                    entryMindWipe = false;
                }
            }
            System.out.println("Congrats! Adding " + userTheWay + " to the list!");
            numberZone[i] = userTheWay;
        }
    }

    private void visualizeList() {
        System.out.println("The mystical number list: ");
        System.out.println(listBuilder(numberZone));
    }

    private String listBuilder(double[] ordinalList) {
        StringBuilder bobTheBuilder = new StringBuilder();
        for (int i = 0; i < ordinalList.length; i++
        ) {
            bobTheBuilder.append(ordinalList[i]);
            if (i < ordinalList.length - 1) {
                bobTheBuilder.append(", ");
            }
        }
        return bobTheBuilder.toString();
    }

    private void showMaths() {
        System.out.println("--- The Twilight Math Plus Zone ---");
        System.out.println("Sum of all numbers: " + getSum());
        System.out.println("Product of all numbers: " + grabProduct());
        System.out.println("Largest of all numbers: " + getLargest());
        System.out.println("Smallest of all numbers: " + getSmallest());
        System.out.println("You have left the Twilight Math Plus Zone");
        System.out.println("You shall pass to the Main Menu");
    }
}


