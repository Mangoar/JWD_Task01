package com.company.jwd.task1.table_tg_func;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TableTgFunctionTest {

    TableTgFunction tableTgFunction = new TableTgFunction();

    @Test
    public void createTableTg1() {
        boolean expectedResult = true;

        int a = 1;
        int b = 8;
        int h = 3;

        List<Double> list1 = new ArrayList<Double>();

        for (int i = a; i< b+1 ; i += h)
        {
            list1.add(Math.tan(i));
        }

        List<Double> list2 = tableTgFunction.createTableTg(a,b,h);

        boolean realResult = (list1.equals(list2));
        Assert.assertEquals(expectedResult, realResult);

    }

}
