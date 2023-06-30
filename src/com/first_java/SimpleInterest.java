package com.first_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float p = input.nextFloat();
        System.out.print("Enter the rate: ");
        float r = input.nextFloat();
        System.out.print("Enter the time: ");
        float t = input.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("The Simple Interest is "+ si);
    }
}
