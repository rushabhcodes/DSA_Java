package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();

        System.out.println("Enter the numbers");

        int[] nums = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("Number " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }

        System.out.println("Numbers smaller than the current number are: " + Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
