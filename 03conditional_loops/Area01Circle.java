package com.nabin;

import java.util.Scanner;

public class Area01Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radious of the Circle in");
        double r = in.nextDouble();
        System.out.println("Area of Circle is = " + (3.14137 * r * r));
    }
}
