package com.company.jwd.task1.lastnumber_func;

public class LastNumberFunction {

    public int findLastNumber(int number) {
        int result = Math.abs(number % 10);
        switch (result) {
            case 0:
                result = 0;
                break;
            case 1:
            case 9:
                result = 1;
                break;
            case 2:
            case 8:
                result = 4;
                break;
            case 3:
            case 7:
                result = 9;
                break;
            case 4:
            case 6:
                result = 6;
                break;
            case 5:
                result = 5;
                break;
        }
        return result;
    }
}
