package com.company.jwd.task1.time_seconds_func;

import org.junit.Assert;
import org.junit.Test;

public class TimeSecondsFunctionTest {

    TimeSecondsFunction testFunction = new TimeSecondsFunction();

    @Test
    public void findTimeWithSecond1() {
        int number = 7895;

        String expectedResult = "2.11.35";
        String realResult = testFunction.findTimeWithSecond(number);
        Assert.assertEquals(expectedResult, realResult);
    }
}
