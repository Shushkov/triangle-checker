package com.trianglechecker.process;

import com.trianglechecker.domain.Triangle;
import com.trianglechecker.domain.TriangleType;

/**
 * @author Created by Sergey Shushkov on 14.06.2017.
 * ClearScale Java Team
 *
 */
public class Checker {

    /**
     *  Checking triangle by its sides
     *
     * @param triangle - The object to be examined
     * @return type {@link TriangleType} calculated by passed object parameters
     *
     * */
    public static TriangleType checking(Triangle triangle){

        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();

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
}
