package com.conditional_loops;

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Equilateral Triangle");
        System.out.println("3. Parallelogram");
        System.out.println("4. Rectangle");
        System.out.println("5. Square");
        System.out.println("6. Rhombus");

        int n = input.nextInt();

        switch (n) {
            case 1 -> {
                System.out.print("Enter the radius: ");
                double radius = input.nextDouble();
                double perimeter = 2 *Math.PI * radius;
                System.out.println("The perimeter of the circle is " + perimeter);
            }
            case 2 -> {
                System.out.print("Enter the value of side: ");
                double side = input.nextDouble();
                double perimeter = 3 * side;
                System.out.println("The perimeter of equilateral triangle is " + perimeter);
            }
            case 3 -> {
                System.out.print("Enter the value of first side: ");
                double s1 = input.nextDouble();
                System.out.print("Enter the value of second side: ");
                double s2 = input.nextDouble();
                double perimeter = 2 * (s1 + s2);
                System.out.println("The perimeter of parallelogram is " + perimeter);
            }
            case 4 -> {
                System.out.print("Enter the value of base: ");
                double base = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double perimeter = 2*(base + height);
                System.out.println("The perimeter of rectangle is " + perimeter);
            }
            case 5 -> {
                System.out.print("Enter the value of side: ");
                double side = input.nextDouble();
                double perimeter = 4*side;
                System.out.println("The perimeter of square is " + perimeter);
            }
            case 6 ->{
                System.out.print("Enter the value of side: ");
                double side = input.nextDouble();
                double perimeter = 4* side;
                System.out.println("The perimeter of rhombus is " + perimeter);
            }
            default ->
                System.out.println("Invalid Input");
        }
    }

}
