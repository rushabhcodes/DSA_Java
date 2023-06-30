package com.conditional_loops;

import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral Triangle");

        int n = input.nextInt();

        switch (n) {
            case 1 -> {
                System.out.print("Enter the radius: ");
                double radius = input.nextDouble();
                double area = Math.PI * Math.pow(radius, 2);
                System.out.println("The area of the circle is " + area);
            }
            case 2 -> {
                System.out.print("Enter the value of base: ");
                double base = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double area = 0.5 * base * height;
                System.out.println("The area of triangle is " + area);
            }
            case 3 -> {
                System.out.print("Enter the value of base: ");
                double base = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double area = base * height;
                System.out.println("The area of rectangle is " + area);
            }
            case 4 -> {
                System.out.print("Enter the value of base: ");
                double base = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double area = 0.5 * base * height;
                System.out.println("The area of isosceles triangle is " + area);
            }
            case 5 -> {
                System.out.print("Enter the value of base: ");
                double base = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double area = base * height;
                System.out.println("The area of parallelogram is " + area);
            }
            case 6 ->{
                System.out.print("Enter the value of base: ");
                double base = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double area = base * height;
                System.out.println("The area of rhombus is " + area);
            }
            case 7 -> {
                System.out.print("Enter the value of side: ");
                double side = input.nextDouble();
                double area = (Math.sqrt(3)/4)*Math.pow(side,2);
                System.out.println("The area of the equilateral triangle is " + area);
            }
            default ->
                System.out.println("Invalid Input");
        }
    }
}