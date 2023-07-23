//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements on of the array:");
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        int[] shuffled = shuffle(nums, n);

        System.out.println(Arrays.toString(shuffled));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[n];
        for(int i =0; i < n/2; i++){
            shuffled[i * 2] = nums[i];
            shuffled[i * 2 + 1] = nums[n/2+i];
        }
        return shuffled;
    }
}
