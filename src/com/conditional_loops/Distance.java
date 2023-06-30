package com.conditional_loops;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of firsts point:");
        System.out.print("x1 = ");
        int x1 = input.nextInt();
        System.out.print("y1 = ");
        int y1 = input.nextInt();

        System.out.println("Enter the co-ordinates of second point:");
        System.out.print("x2 = ");
        int x2 = input.nextInt();
        System.out.print("y2 = ");
        int y2 = input.nextInt();

        double distnce = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.println("The distance between the points is "+distnce);
    }
}
