package com.first_java;

import java.util.Scanner;

public class ArmstrongBtwTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long temp, digit,sum;
        int len;

        System.out.print("Enter First numbers: ");
        long n1 = input.nextLong();
        System.out.print("Enter Second numbers: ");
        long n2 = input.nextLong();

        for (long i =n1; i<=n2; i++){
            temp = i;
            len = 0;
            sum =0;
            while(temp != 0){
                temp /= 10;
                len++;
            }
            temp = i;
            while ( temp != 0){
                digit = temp % 10;
                sum += Math.pow(digit,len);
                temp /=10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}