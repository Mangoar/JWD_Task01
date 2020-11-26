package com.company.jwd.task1.point_distance_func;

import org.junit.Assert;
import org.junit.Test;

public class PointDistanceFunctionTest {

    PointDistanceFunction testFunction = new PointDistanceFunction();

    @Test
    public void findPointDistanse1() {
        int x1 = 2;
        int y1 = 4;
        int x2 = 4;
        int y2 = 8;

        String expectedResult = "A is closer";
        String realResult = testFunction.findPointDistanse(x1,y1,x2,y2);
        Assert.assertEquals(expectedResult,realResult);
    }

    @Test
    public void findPointDistanse2() {
        int x1 = -2;
        int y1 = -2;
        int x2 = 2;
        int y2 = 2;

        String expectedResult = "Both are equal close";
        String realResult = testFunction.findPointDistanse(x1,y1,x2,y2);
        Assert.assertEquals(expectedResult,realResult);
    }
}
