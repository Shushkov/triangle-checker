package com.example;

/**
 * Created by Sergey Shushkov on 11.06.2017.
 * ClearScale Java Team
 */
public class TringleChecker {

    public static void main(String[] args) {
        if (args.length<3) {
            System.err.println("Please pass triangle edge length as arguments");
        } else {

            Integer a = Integer.valueOf(args[0]);
            Integer b = Integer.valueOf(args[1]);
            Integer c = Integer.valueOf(args[2]);

            try {
                TriangleType triangleType = checking(a, b, c);

                switch (triangleType) {
                    case EQUILATERAL:
                        System.out.println("this triangle is equilateral");
                        break;
                    case ISOSCELES:
                        System.out.println("this triangle is isosceles");
                        break;
                    case SCALENE:
                        System.out.println("this triangle is scalene");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    /**
    *  Checking triangle is equilateral, isosceles or scalene
    * */
    public static TriangleType checking(int a, int b, int c){
        if (a < 1 || b < 1 || c < 1){
            throw new IllegalArgumentException("edges length must be greater than 0");
        }

        if ((a+b) > c && (a+c) > b && (b+c) > a) {
            if (a == b && b == c){
                return TriangleType.EQUILATERAL;
            } else if ((a == b) || (b == c) || (a == c)){
                return TriangleType.ISOSCELES;
            } else {
                return TriangleType.SCALENE;
            }
        } else {
            throw new IllegalArgumentException("Triangle with given params doesn't exists");
        }
    }

    public enum TriangleType{
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
    }
}
