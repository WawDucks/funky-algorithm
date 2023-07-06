package org.example.my_pow;

public class MyPow {
    public static double myPow(double x, int n) {
        long N = n;
        if (N == 0) {
            return 1.0;
        }

        if (N<0) {
            x = 1.0 / x;
            N = -N;
        }

        double res = 1.0;
        while (N>0) {
            if (N % 2 == 1) {
                res *= x;
            }
            x *= x;
            N /= 2;
        }
        return res;
    }
}
