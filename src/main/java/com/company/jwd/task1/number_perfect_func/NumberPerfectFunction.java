package com.company.jwd.task1.number_perfect_func;

public class NumberPerfectFunction {

    public boolean isNumberPerfect(int x) {
        int number = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                number += i;
            }
        }
        if (number == x) {
            return true;
        } else {
            return false;
        }
    }
}
