package com.conditional_loops;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        int original_rice = input.nextInt();
        System.out.print("Enter the discount percent: ");
        float rate = input.nextFloat();
        float discount_price = original_rice - original_rice * rate/100;
        System.out.println("The discounted price will be "+ discount_price);
    }
}
