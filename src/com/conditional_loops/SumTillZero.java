package com.conditional_loops;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to add.");
        System.out.println("Press 0 to print sum.");
        int n;
        do {
            n = input.nextInt();
            sum += n;
        }
        while (n != 0);
        System.out.println(sum);
    }
}

