package com.conditional_loops;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = inputs.next();
        int len = str.length();
        int i = 0;
        String rev = "";
        char ch;
        while(len != 0){
            ch = str.charAt(len - 1);
            rev = rev + ch;
            i++;
            len--;

        }
        System.out.println(rev);
    }
}
