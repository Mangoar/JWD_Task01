package com.company.jwd.task1.point_distance_func;

public class PointDistanceFunction {
    public String findPointDistanse(int x1, int y1, int x2, int y2) {
        double dist1 = Math.sqrt(Math.pow(0 - x1, 2) + Math.pow(0 - y1, 2));
        double dist2 = Math.sqrt(Math.pow(0 - x2, 2) + Math.pow(0 - y2, 2));
        if (dist1 < dist2) {
            return "A is closer";
        } else if (dist1 > dist2) {
            return "B is closer";
        } else {
            return "Both are equal close";
        }
    }
}
