package com.company.jwd.task1.count_func;

public class CountFunction {

    public double countFunction(int x) {
        if (x < 3) {
            return (1 / (Math.pow(x, 3) - 6));
        } else {
            return ((-1) * Math.pow(x, 2) + 3 * x + 9);
        }
    }
}
