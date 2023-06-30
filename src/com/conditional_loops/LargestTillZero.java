package com.conditional_loops;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        int largest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to compare.");
        System.out.println("Press 0 to print largest.");
        int n;
        do {
            n = input.nextInt();
            if(largest < n){
                largest = n;
            }
        }
        while (n != 0);
        System.out.println(largest);
    }
}

