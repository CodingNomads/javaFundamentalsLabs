package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 * <p>
 * Receive the following arguments from the user:
 * - miles to drive
 * - MPG of the car
 * - Price per gallon of fuel
 * <p>
 * Display the cost of the trip in the console.
 */

public class Exercise_12 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Miles");
        double miles = keyboard.nextDouble();

        System.out.println("Enter Miles Consumption Per Miles");
        double mpg = keyboard.nextDouble();

        System.out.println("Enter Fuel Price Per Gallon");
        double price = keyboard.nextDouble();

        double cost = miles * mpg * price;

        System.out.println("Cost of the Trip: " + cost);

    }

}