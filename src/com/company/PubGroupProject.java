package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PubGroupProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What are you drinking?");
        System.out.println("1 - Beer Hansa");
        System.out.println("2 - Cider Grans");
        System.out.println("3 - Cider Strongbow");
        System.out.println("4 - Gin Tonic");
        System.out.println("5 - Bacardi Special");
        int drinkName = input.nextInt();

        System.out.println("Are you a student? Students get 10% discount!");
        System.out.println("1 = true");
        System.out.println("2 = false");
        int student = input.nextInt();

        System.out.println("How many drinks?");
        int amount = input.nextInt();

        if (drinkName != 1 && drinkName != 2 && drinkName != 3 && drinkName != 4
                && drinkName != 5) {
            System.out.println("No such drink");
        } else {
            computeCost(drinkName, student, amount);
            System.out.println("You have to pay eur:");
            System.out.println(computeCost(drinkName, student, amount));
        }
    }

    public static String computeCost(int drink, int student, int amount) {

        if (amount > 2 && (drink == 4 || drink == 5)) {
            System.out.println("Too many drinks, max 2.");

        }

        double price = 0;
        if (drink == 1) {
            price = 1.50;
        }
        else if (drink == 2) {
            price = 2.40;
        }
        else if (drink == 3) {
            price = 3.30;
        }
        else if (drink == 4) {
            price = ingredient6() + ingredient5() + ingredient4();
        }
        else if (drink == 5) {
            price = ingredient6() / 2 + ingredient1() + ingredient2() + ingredient3();
        }
        if (student == 1 && (drink == 2 || drink == 1 || drink == 3)) {
            price = price - price / 10;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(price * amount);
    }

    //one unit of rum
    private static double ingredient1() {
        return 4.20;
    }

    //one unit of grenadine
    private static double ingredient2() {
        return 1.50;
    }

    //one unit of lime juice
    private static double ingredient3() {
        return 1.20;
    }

    //one unit of green stuff
    private static double ingredient4() {
        return 0.70;
    }

    //one unit of tonic water
    private static double ingredient5() {
        return 2.50;
    }

    //one unit of gin
    private static double ingredient6() {
        return 4.40;
    }
}
//Irina Jaskova
//Anda Paegle Kadike
//Liene Malkalne

