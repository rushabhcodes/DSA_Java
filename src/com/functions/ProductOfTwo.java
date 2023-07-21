package com.functions;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number number: ");
        int a = input.nextInt();
        System.out.print("Enter Second number number: ");
        int b = input.nextInt();
        System.out.println("The product of "+ a+" and "+b+" is "+ produce(a,b));
    }
    static int produce(int a,int b){
        return a*b;
    }
}
