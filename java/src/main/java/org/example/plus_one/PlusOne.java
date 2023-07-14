package org.example.plus_one;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            res[i] = sum %10;
            carry = sum/10;
        }
        if (carry == 1) {
            res = new int[n+1];
            res[0] = 1;
        }
        return res;
    }
}
