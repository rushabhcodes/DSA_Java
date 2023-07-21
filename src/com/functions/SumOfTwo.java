package com.functions;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number number: ");
        int a = input.nextInt();
        System.out.print("Enter Second number number: ");
        int b = input.nextInt();
        System.out.println("The sum of "+ a+" and "+b+" is "+ sum(a,b));
    }
    static int sum(int a,int b){
        return a+b;
    }
}
