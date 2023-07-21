package com.functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        EvenOdd(n);
    }
    static void EvenOdd(int n) {
        int result;
        result = (n%2==0)?0:1;
        if(result ==0){
            System.out.println(n+ " is an even number");
        }
        else System.out.println(n+ " is an odd number");
    }

}
