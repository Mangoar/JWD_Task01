package com.company.jwd.task1.square_diff_func;

public class SquareDiffFunction {

    public String findSquareDiff(double square) {
        double biggerSide = Math.sqrt(square);
        double smallerSide = Math.sqrt(2 * Math.pow(biggerSide / 2, 2));
        double smallSquare = Math.pow(smallerSide, 2);
        double diff = square / smallSquare;
        System.out.println("Square of smaller square = " + String.format("%.3f", smallSquare));
//        System.out.println("Difference between squares = " + String.format("%.1f",diff) + " times");
        return "Difference between squares = " + String.format("%.1f", diff) + " times";
    }
}
