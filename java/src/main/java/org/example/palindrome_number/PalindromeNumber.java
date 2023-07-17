package org.example.palindrome_number;

import javax.management.StandardEmitterMBean;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        char ch;
        String input = String.valueOf(x);
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            sb.append(ch);
        }
        return sb.reverse().toString().equals(input);
    }
}
