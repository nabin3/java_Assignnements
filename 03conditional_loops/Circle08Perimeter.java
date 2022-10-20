package com.nabin;

import java.util.Scanner;

public class Circle08Perimeter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double r = in.nextDouble();
        double perimeter = 2 * 3.14 * r;
        System.out.println("Now perimeter of this circle is = " + perimeter);
    }
}
