package com.conditional_loops;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original value: ");
        float v1 = input.nextFloat();
        System.out.print("Enter the rate of depreciation: ");
        float r = input.nextFloat();
        System.out.print("Enter the time passed: ");
        float t = input.nextFloat();
        float D = (float)(v1 * Math.pow((1 - r / 100), t));
        System.out.println("The depreciated value is "+ D);
    }

}
