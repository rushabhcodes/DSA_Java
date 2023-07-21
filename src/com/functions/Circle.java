package com.functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double r = input.nextDouble();
        System.out.println("The circumference of the circle is "+ circumference(r));
        System.out.println("The area of the circle is "+ area(r));
    }
    static double circumference(double r){
        double Circumference;
        Circumference = 2*Math.PI*r;
        return Circumference;
    }
    static double area(double r){
        double Area;
        Area = Math.PI*r*r;
        return Area;
    }
}
