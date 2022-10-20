package com.nabin;

import java.util.Scanner;

public class Area04IsoscelsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of equal sideis and base");
        double e = in.nextDouble();
        double b = in.nextDouble();
        double s = (e*e - b*b / 4) * b / 2;
        System.out.println("Area of Isoscels triangle is = " + s);
    }
}
