package com.functions;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.print("First number: ");
        int a = input.nextInt();
        System.out.print("Second number: ");
        int b = input.nextInt();
        System.out.print("Third number: ");
        int c = input.nextInt();

        int Max = max(a,b,c);
        int Min = min(a,b,c);
        System.out.println("The largest number is "+ Max);
        System.out.println("The smallest number is "+ Min);
    }
    static int max(int x, int y, int z) {
        int maxima;
        maxima = (x > y)?((x>z)?x:z):((y>z)?y:z);
        return maxima;
    }

    static int min(int x, int y, int z) {
        int minima;
        minima = (x < y)?((x<z)?x:z):((y<z)?y:z);
        return minima;
    }
}
