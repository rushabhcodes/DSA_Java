package com.conditional_loops;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to give.");
        int sum =0;
        int n= input.nextInt();
        for(int i =0; i< n; i++){
            System.out.print("Enter input:");
            sum += input.nextInt();
        }
        int avg = sum/n;
        System.out.println("The average og given numbers will be "+avg);
    }
}
