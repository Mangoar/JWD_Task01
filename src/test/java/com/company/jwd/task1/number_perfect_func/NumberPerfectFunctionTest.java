package com.company.jwd.task1.number_perfect_func;

import org.junit.Assert;
import org.junit.Test;

public class NumberPerfectFunctionTest {

    NumberPerfectFunction testFunction = new NumberPerfectFunction();

    @Test
    public void isNumberPerfect1() {
        int number = 28;

        boolean expectedResult = true;
        boolean realResult = testFunction.isNumberPerfect(number);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test
    public void isNumberPerfect2() {
        int number = 35;

        boolean expectedResult = false;
        boolean realResult = testFunction.isNumberPerfect(number);
        Assert.assertEquals(expectedResult, realResult);
    }
}
