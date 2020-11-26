package com.company.jwd.task1.daysnumber_yeartype_func;

import org.junit.Assert;
import org.junit.Test;

public class DaysYearFunctionTest {

    DaysYearFunction testFunction = new DaysYearFunction();

    @Test
    public void findDaysNumberYearType1() {
        int year = 2020;
        int month = 2;
        String expectedResult = "Year is leap.Days in month = 29.";

        String realResult = testFunction.findDaysNumberYearType(year,month);
        Assert.assertEquals(expectedResult,realResult);
    }

    @Test
    public void findDaysNumberYearType2() {
        int year = 2019;
        int month = 8;

        String expectedResult = "Year is not leap.Days in month = 31.";
        String realResult = testFunction.findDaysNumberYearType(year,month);
        Assert.assertEquals(expectedResult,realResult);
    }
}
