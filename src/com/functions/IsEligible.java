package com.functions;

import java.util.Scanner;

public class IsEligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(is18Above(age)){
            System.out.println("You are eligible");
        }
        else System.out.println("You are not eligible");
    }

    static boolean is18Above(int n) {
        boolean result;
        return result = n >= 18;
    }
}
