package com.company.jwd.task1.daysnumber_yeartype_func;

import java.util.GregorianCalendar;

public class DaysYearFunction {

    public String findDaysNumberYearType(int year, int month) {

        String yearResult = "";
        String monthResult = "";

        GregorianCalendar cal = (
                GregorianCalendar) GregorianCalendar.getInstance();

        if (cal.isLeapYear(year)) {
            yearResult = "Year is leap.";
        } else {
            yearResult = "Year is not leap.";
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                monthResult = "Days in month = 31.";
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                monthResult = "Days in month = 30.";
                break;
            }
            case 2: {
                if (cal.isLeapYear(year)) {
                    monthResult = "Days in month = 29.";
                } else {
                    monthResult = "Days in month = 28.";
                }
                break;
            }
        }
        return yearResult + monthResult;
    }
}

