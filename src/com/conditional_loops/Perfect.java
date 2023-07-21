package com.conditional_loops;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum =0;
        int i;
        for (i = 1 ; i < n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println(n+ " is a Perfect number");
        }else
            System.out.println(n+ " is not Perfect number");

    }
}
