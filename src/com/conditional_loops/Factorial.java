package com.conditional_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter a number:");
        int n = input.nextInt();
        while(n!=0){
            fact = fact * n;
            n--;
        }
        System.out.println("The factorial is "+ fact);
    }
}