//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
//Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of costumers: ");
        int customer = in.nextInt();

        System.out.print("Enter the number of banks: ");
        int banks = in.nextInt();

        int[][] accounts = new int[customer][banks];

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Enter the amount of customer " + (i+1) + ":" );
            for (int j = 0; j < accounts[i].length; j++) {
                System.out.print("Bank " + (j+1) + ":" );
                accounts[i][j] = in.nextInt();
            }
        }

        int richest = maximumWealth(accounts);
        System.out.println("The richest costumers wealth is " + richest);

    }

    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account) {
                temp += i;
                if (richest < temp) {
                    richest = temp;
                }
            }
        }
        return richest;

    }
}
