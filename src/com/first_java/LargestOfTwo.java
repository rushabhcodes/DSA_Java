package com.first_java;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First numbers: ");
        long n1 = input.nextLong();
        System.out.print("Enter Second numbers: ");
        long n2 = input.nextLong();

        if(n1>n2){
            System.out.println("The greatest number is "+ n1);
        }else System.out.println("The greatest number is "+ n2);
    }
}
