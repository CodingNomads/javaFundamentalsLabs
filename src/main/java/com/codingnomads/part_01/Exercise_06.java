package com.codingnomads.part_01;

/**
 * Part 1 Exercise 6:
 * <p>
 * Write the necessary code to print out the result of the following:
 * <p>
 * 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 17; i = i + 2) {
            sum = sum + i;

        }

        System.out.println(sum);

    }

}