//Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
package com.arrays;

import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("Number " + (i+1) + ": ");
            arr[i] = in.nextInt();
        }

        System.out.println("The number of good pairs are " + numIdenticalPairs(arr));

    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;

    }
}
