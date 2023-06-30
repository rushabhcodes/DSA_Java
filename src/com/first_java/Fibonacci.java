package com.first_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0, b=1 , c;
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i =0; i< n-2; i++){
            c = a+b;
            a =b;
            b= c;
            System.out.println(c);
        }
    }
}
