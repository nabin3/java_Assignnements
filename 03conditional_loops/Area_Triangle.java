package com.nabin;

import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // with base and heigh
        System.out.println("enter base and height of triangle");
        float ba = in.nextFloat();
        float he = in.nextFloat();
        System.out.println("Area = " + area_h(ba, he));

        // with 3 sides
        System.out.println("enter three sides of triangle");
        float x = in.nextInt();
        float y = in.nextFloat();
        float z = in.nextFloat();
        System.out.println("Area = " + area_s(x, y, z));
    }
    static float area_h(float b, float h) {
        return (b * h / 2);
    }
    static double area_s(float a, float b, float c) {
        double ar = 0;
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            float s = (a + b + c) / 2;
            ar = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        } else {
            System.out.println("Your input is not valid");
        }
        return ar;
    }
}
