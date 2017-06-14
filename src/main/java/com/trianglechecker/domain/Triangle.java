package com.trianglechecker.domain;

/**
 * @author Created by Sergey Shushkov on 14.06.2017.
 * ClearScale Java Team
 *
 * Class present triangle abstraction with 3 sides (a, b, c) as field
 * and type field {@link TriangleType} determine type of it
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    private TriangleType type;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleType getType() {
        return type;
    }

    public void setType(TriangleType type) {
        this.type = type;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
