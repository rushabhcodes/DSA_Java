package com.conditional_loops;

import java.util.Scanner;

public class EvenAugust {
    public static void main(String[] args) {
        int August = 31;
        int count = 0;
        for (int i=1; i<=August; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Even days in august are: "+ count);
    }
}
