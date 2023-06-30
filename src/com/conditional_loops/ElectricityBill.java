package com.conditional_loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        int unit = input.nextInt();
        System.out.print("Enter the rate per unit: ");
        float rate = input.nextFloat();
        float bill = rate * unit;
        System.out.println("The Electricity bill will be: "+ bill);
    }
}
