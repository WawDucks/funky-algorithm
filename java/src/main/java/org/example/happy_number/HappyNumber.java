package org.example.happy_number;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n > 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += Math.pow(digit, 2);
                n /= 10;
            }
            n = sum;
        }
        return true;
    }

}
