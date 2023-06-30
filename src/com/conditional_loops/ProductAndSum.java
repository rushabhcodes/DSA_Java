package com.conditional_loops;

import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();
        int sum =0, product =1;
        while (n!=0){
            int digit = n%10;
            product *= digit;
            sum += digit;
            n/=10;
        }
        int result = product - sum;
        System.out.println("The difference between product and sum is "+ result);
    }
}
