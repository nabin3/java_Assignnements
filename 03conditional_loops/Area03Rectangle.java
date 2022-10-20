package com.nabin;

import java.util.Scanner;

public class Area03Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle");
        double l = in.nextDouble();
        double w = in.nextDouble();
        System.out.println("Area of rectangle is = " + (l * w));
    }
}
