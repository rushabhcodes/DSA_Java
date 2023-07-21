package com.functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        int i = 2;
        while (i<n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
