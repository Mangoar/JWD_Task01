package com.company.jwd.task1.count_func;

import org.junit.Assert;
import org.junit.Test;

public class CountFunctionTest {

    CountFunction testFunction = new CountFunction();

    @Test
    public void countFunction1() {
        int x = 2;

        double expectedResult = 0.5;
        double realResult = testFunction.countFunction(x);
        Assert.assertEquals(expectedResult, realResult, 0.00001);
    }

    @Test
    public void countFunction2() {
        int x = 4;

        double expectedResult = 5.0;
        double realResult = testFunction.countFunction(x);
        Assert.assertEquals(expectedResult, realResult, 0.00001);
    }
}
