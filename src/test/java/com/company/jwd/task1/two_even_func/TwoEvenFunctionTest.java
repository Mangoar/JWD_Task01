package com.company.jwd.task1.two_even_func;

import org.junit.Assert;
import org.junit.Test;

public class TwoEvenFunctionTest {

    TwoEvenFunction testFunction = new TwoEvenFunction();

    @Test
    public void ifTwoEven1() {
        int a = 1;
        int b = 3;
        int c = 4;
        int d = 5;

        boolean expectedResult = false;
        boolean realResult = testFunction.ifTwoEven(a, b, c, d);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test
    public void ifTwoEven2() {
        int a = 4;
        int b = 1;
        int c = 8;
        int d = 9;

        boolean expectedResult = true;
        boolean realResult = testFunction.ifTwoEven(a, b, c, d);
        Assert.assertEquals(expectedResult, realResult);
    }
}
