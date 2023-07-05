package org.example.multiply_strings;

public class MultiplyStrings {
    public static String multiplyStrings(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        // m+n represents the max possible length of the val
        int[] result = new int[m + n];

        for (int i = n - 1; i >= 0; i--) {
            int carry = 0;
            //extracting character from string
            int digit2 = num2.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int digit1 = num1.charAt(j) - '0';
                int temp = result[i+j+1] + (digit1*digit2) + carry;
                result[i+j+1] = temp % 10;
                carry = temp/10;
            }
            result[i] += carry;
        }
        StringBuilder sb = new StringBuilder();
        for (int digit: result) {
            sb.append(digit);
        }
        while (sb.length() > 0 && sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
