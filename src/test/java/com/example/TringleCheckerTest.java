package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sergey Shushkov on 11.06.2017.
 * ClearScale Java Team
 */
public class TringleCheckerTest extends Assert {

    @Test
    public void equiTest(){
        TringleChecker.TriangleType result = TringleChecker.checking(2, 2 ,2);
        assertEquals(result, TringleChecker.TriangleType.EQUILATERAL);
    }

    @Test
    public void isoTest(){
        TringleChecker.TriangleType result = TringleChecker.checking(2, 2 ,3);
        assertEquals(result, TringleChecker.TriangleType.ISOSCELES);
    }

    @Test
    public void scaleTest(){
        TringleChecker.TriangleType result = TringleChecker.checking(2, 3 ,4);
        assertEquals(result, TringleChecker.TriangleType.SCALENE);
    }

    @Test(expectedExceptions  = IllegalArgumentException.class)
    public void testNegotiation(){
        TringleChecker.TriangleType result = TringleChecker.checking(-1, 0 ,-1);
    }

    @Test(expectedExceptions  = IllegalArgumentException.class)
    public void testExistence(){
        TringleChecker.TriangleType result = TringleChecker.checking(1, 4 ,10);
    }

}
