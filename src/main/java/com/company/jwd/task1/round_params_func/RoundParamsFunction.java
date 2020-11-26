package com.company.jwd.task1.round_params_func;

public class RoundParamsFunction {


    public String countRoundParameters(int r) {
        double C = 2 * 3.14 * r;
        double S = 3.14 * Math.pow(r, 2);
        return "C=" + String.format("%.2f", C) + ",S=" + String.format("%.2f", S);
    }
}
