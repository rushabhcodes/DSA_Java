package com.first_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        
        String s1 = input.next();
        int flag = 0, len = s1.length();
        for (int i =0; i< len/2; i++)
        {
            if(s1.charAt(i)!=s1.charAt(len-i-1)){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(s1+" is a palindrome");
        }
        else System.out.println(s1+" is not a palindrome");
    }
}
