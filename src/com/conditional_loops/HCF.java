package com.conditional_loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        int HCF = 1;
        for(int i = a; i > 0; i--){
            if(a%i==0 && b%i ==0){
                HCF = i;
                break;
            }
        }
        System.out.println("HCF: " + HCF);
    }
}
