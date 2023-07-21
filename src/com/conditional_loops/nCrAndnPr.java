package com.conditional_loops;

import java.util.Scanner;

public class nCrAndnPr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = input.nextInt();
        System.out.print("Enter the value of r:");
        int r = input.nextInt();
        long nCr = factorial(n)/(factorial(r)*factorial(n-r));
        long nPr = factorial(n)/factorial(n-r);
        System.out.println("The value of nCr: "+ nCr);
        System.out.println("The value of nPr: "+ nPr);
    }
    public static long factorial(int n) {
        long fact = 1;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
