package com.first_java;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = input.nextInt();

        if(n % 2 == 0){
            System.out.println(n+" is an even number.");
        }else System.out.println(n+" is not an even number.");
    }
}
