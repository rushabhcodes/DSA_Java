package com.conditional_loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        int i;
        int LCM;
        for (i =b; true; i++){
            if(i%a==0 && i%b==0) {
                LCM = i;
                break;
            }
        }
        System.out.println("LCM: "+ LCM);
    }
}
