package com.conditional_loops;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char ch = input.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel.");
        }else System.out.println(ch + " is a consonant.");

    }
}
