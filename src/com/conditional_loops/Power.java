package com.conditional_loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();
        int result = 1;
        while (power !=0){
            result *= base;
            power--;
        }
        System.out.println("The answer is "+result);
    }
}
