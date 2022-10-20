package com.nabin;

import java.util.Scanner;

public class Rectangle10Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two sides of rectangle");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double perimeter = 2 * (a + b);
        System.out.println("Perimeter of this rectangle is = " + perimeter);
    }
}
