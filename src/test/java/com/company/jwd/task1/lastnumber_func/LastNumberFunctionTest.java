package com.company.jwd.task1.lastnumber_func;

import org.junit.Assert;
import org.junit.Test;

public class LastNumberFunctionTest {

    LastNumberFunction testFunction = new LastNumberFunction();

    @Test
    public void findLastNumberTest1() {
        int x = 222;
        int expectedNumber = 4;

        int realLastnumber = testFunction.findLastNumber(x);
        Assert.assertEquals(expectedNumber,realLastnumber);
    }

    @Test
    public void findLastNumberTest2() {
        int x = 8;
        int expectedNumber = 4;

        int realLastnumber = testFunction.findLastNumber(x);
        Assert.assertEquals(expectedNumber,realLastnumber);
    }
}
