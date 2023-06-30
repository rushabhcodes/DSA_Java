package com.conditional_loops;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int p = input.nextInt();
        System.out.print("Enter the commission amount: ");
        int c = input.nextInt();
        float percent = (float) c*100/p;
        System.out.println("The commission percent is "+ percent);
    }
}
