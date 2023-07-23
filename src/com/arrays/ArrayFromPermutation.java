//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements on of the array:");
        for (int i = 0; i < n; i++){
           nums[i] = in.nextInt();
        }

        int[] ans = buildArray(nums, n);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] nums, int n){
        int[] ans = new int[n];
        for (int i = 0; i < n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
