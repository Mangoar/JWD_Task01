package com.company.jwd.task1.table_tg_func;

import java.util.ArrayList;
import java.util.List;

public class TableTgFunction {

    public List<Double> createTableTg(int a, int b, int h) {
        List<Double> list = new ArrayList<Double>();
        for (int i = a; i < b + 1; i += h) {

            list.add(Math.tan(i));
        }
        printTable(list);
        return  list;
    }

    public void printTable(List<Double> listTg){
        System.out.println("----------------------");
        System.out.println("| x | tg(x)");
        System.out.println("----------------------");

        for (int i = 0; i < listTg.size(); i ++) {
            System.out.println("| " + i + " | " + listTg.get(i));
            System.out.println("----------------------");
        }

    }
}
