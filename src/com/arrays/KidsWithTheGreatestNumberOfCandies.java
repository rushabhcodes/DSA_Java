//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//Note that multiple kids can have the greatest number of candies.
package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of kids: ");
        int n = in.nextInt();
        System.out.println("Enter the amount of candies for each kid");

        int[] candies = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("Kid " + (i+1) + ": ");
            candies[i] = in.nextInt();
        }

        System.out.print("Enter the number of extra candies: ");
        int extraCandies = in.nextInt();

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        for (int candy : candies) {
            if (greatest < candy) {
                greatest = candy;
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= greatest);
        }
        return result;
    }
}
