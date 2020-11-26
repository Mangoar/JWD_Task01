package com.company.jwd.task1.square_diff_func;

import org.junit.Assert;
import org.junit.Test;

public class SquareDiffFunctionTest {

    SquareDiffFunction testFunction = new SquareDiffFunction();

    @Test
    public void findSquareDiff1() {
        double square = 25;

        String expectedResult = "Difference between squares = 2,0 times";
        String realResult = testFunction.findSquareDiff(square);
        Assert.assertEquals(expectedResult,realResult);
    }
}
