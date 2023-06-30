package com.conditional_loops;

import java.util.Scanner;

public class VolumeOfShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Cone");
        System.out.println("2. Prism");
        System.out.println("3. Cylinder");
        System.out.println("4. Sphere");
        System.out.println("5. Pyramid");
        
        int n = input.nextInt();

        switch (n) {
            case 1 -> {
                System.out.print("Enter the radius: ");
                double radius = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double volume = Math.PI * Math.pow(radius,2) * (height/3);
                System.out.println("The volume of the cone is " + volume);
            }
            case 2 -> {
                System.out.print("Enter the area of base: ");
                double base_area = input.nextDouble();
                System.out.print("Enter the length of prism: ");
                double length = input.nextDouble();
                double volume = base_area * length;
                System.out.println("The volume of prism is " + volume);
            }
            case 3 -> {
                System.out.print("Enter the value of radius: ");
                double radius = input.nextDouble();
                System.out.print("Enter the value of height: ");
                double height = input.nextDouble();
                double volume = Math.PI * Math.pow(radius,2) * height;
                System.out.println("The volume of cylinder is " + volume);
            }
            case 4 -> {

                System.out.print("Enter the value of radius: ");
                double radius = input.nextDouble();
                double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
                System.out.println("The volume of sphere is " + volume);
            }
            case 5 -> {
                System.out.print("Enter the area of base: ");
                double base_area = input.nextDouble();
                System.out.print("Enter the height of the pyramid: ");
                double height = input.nextDouble();
                double volume = base_area * height * (1.0/3.0);
                System.out.println("The volume of prism is " + volume);
            }
            default ->
                    System.out.println("Invalid Input");
        }
    }

}
