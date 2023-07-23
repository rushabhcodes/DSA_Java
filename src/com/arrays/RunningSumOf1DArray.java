//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//Specifically, ans is the concatenation of two nums arrays.
//Return the array ans.
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements on of the array:");
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        int[] ans = runningSum(nums);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j<= i; j++){
                ans[i] += nums[j];
            }
        }
        return ans;
    }
}
