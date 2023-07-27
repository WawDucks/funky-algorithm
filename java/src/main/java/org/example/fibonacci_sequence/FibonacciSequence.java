package org.example.fibonacci_sequence;

public class FibonacciSequence {
    public static int fibonacciSequence(int n) {
        // initial check
        if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;
        int c;

        for (int i = 2; i <=n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
