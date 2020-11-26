package com.company.jwd.task1.time_seconds_func;

public class TimeSecondsFunction {

    public String findTimeWithSecond(int sec) {
        int hours = sec / 3600;
        int seconds = sec - hours * 3600;
        int minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        return hours + "." + minutes + "." + seconds;
    }
}
