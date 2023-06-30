package com.conditional_loops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total runs: ");
        int runs = in.nextInt();
        System.out.print("Enter the number of matches played: ");
        int matches = in.nextInt();
        System.out.print("Enter the number of not-out: ");
        int not_out = in.nextInt();

        float avg = (float)runs/(matches-not_out);
        System.out.println("The running average of the player is: "+ avg);
    }
}
