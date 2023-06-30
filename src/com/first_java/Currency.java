package com.first_java;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your amount in INR");
        double INR = input.nextDouble();
        System.out.println(INR +" INR is "+INR*0.012+" USD");
    }
}
