package com.example;

import com.trianglechecker.domain.Triangle;
import com.trianglechecker.domain.TriangleType;
import com.trianglechecker.process.Checker;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sergey Shushkov on 11.06.2017.
 * ClearScale Java Team
 */
public class TriangleCheckerTest extends Assert {

    @Test
    public void equiTest(){

        Triangle triangle = new Triangle(2, 2 ,2);
        TriangleType result = Checker.checking(triangle);
        assertEquals(result, TriangleType.EQUILATERAL);
    }

    @Test
    public void isoTest(){
        Triangle triangle = new Triangle(2, 2 ,3);
        TriangleType result = Checker.checking(triangle);
        assertEquals(result, TriangleType.ISOSCELES);
    }

    @Test
    public void scaleTest(){
        Triangle triangle = new Triangle(2, 3 ,4);
        TriangleType result = Checker.checking(triangle);
        assertEquals(result, TriangleType.SCALENE);
    }

    @Test(expectedExceptions  = IllegalArgumentException.class)
    public void testNegotiation(){
        Triangle triangle = new Triangle(-1, 0 ,-1);
        TriangleType result = Checker.checking(triangle);
    }

    @Test(expectedExceptions  = IllegalArgumentException.class)
    public void testExistence(){
        Triangle triangle = new Triangle(1, 4 ,10);
        TriangleType result = Checker.checking(triangle);
    }

}
