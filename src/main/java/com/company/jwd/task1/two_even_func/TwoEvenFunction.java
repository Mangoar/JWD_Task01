package com.company.jwd.task1.two_even_func;

public class TwoEvenFunction {

    public boolean ifTwoEven(int a, int b, int c, int d) {
        int[] mas = new int[]{a, b, c, d};
        boolean result = false;
        int evenCount = 0;
        for (int i = 0; i < 4; i++) {
            if (mas[i] % 2 == 0) {
                evenCount++;
                if (evenCount == 2) {
                    result = true;
                }
            }
        }
        return result;
    }
}
