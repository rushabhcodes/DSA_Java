package com.conditional_loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to give.");
        int sum =0;
        int n= input.nextInt();
        for(int i =0; i< n; i++){
            System.out.print("Enter input:");
            sum += input.nextInt();
        }
        System.out.println("The sum of given numbers will be "+ sum);

    }
}
