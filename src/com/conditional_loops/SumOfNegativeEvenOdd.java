package com.conditional_loops;

import java.util.Scanner;

public class SumOfNegativeEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, nsum = 0, osum=0, esum=0;
        do{
            n = input.nextInt();
            if(n < 0){
                nsum +=n;
            } else if (n%2 ==0) {
                esum+=n;
            }else osum+=n;

        }while (n != 0);
        System.out.println("The sum of negative numbers is: "+ nsum);
        System.out.println("The sum of even numbers is: "+ esum);
        System.out.println("The sum of odd numbers is: "+ osum);

    }
}
