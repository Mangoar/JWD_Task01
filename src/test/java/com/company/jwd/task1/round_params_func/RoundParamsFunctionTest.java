package com.company.jwd.task1.round_params_func;

import org.junit.Assert;
import org.junit.Test;

public class RoundParamsFunctionTest {

    RoundParamsFunction testFunction = new RoundParamsFunction();

    @Test
    public void countRoundParameters1() {
        int r = 5;

        String expectedResult = "C=31,40,S=78,50";
        String realResult = testFunction.countRoundParameters(r);
        Assert.assertEquals(expectedResult, realResult);
    }
}
