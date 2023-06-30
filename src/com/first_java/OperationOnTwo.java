package com.first_java;

import java.util.Scanner;

public class OperationOnTwo {
    public static void main(String[] args) {
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First numbers: ");
        double n1 = input.nextDouble();
        System.out.println("Enter Second numbers: ");
        double n2 = input.nextDouble();

        System.out.println("Choose an operator: '+' '-' '*' '/'");
        char operator = input.next().charAt(0);
        
        if(operator == '+'){
            result = n1 + n2; 
        } else if (operator == '-') {
            result = n1 -n2;
        }
        else if (operator == '*') {
            result = n1 * n2;
        }
        else if (operator == '/') {
            result = n1/n2;
        }else System.out.println("Invalid input");
        System.out.println("The value of "+n1 + operator + n2 + " is " +
                result+".");
    }
}