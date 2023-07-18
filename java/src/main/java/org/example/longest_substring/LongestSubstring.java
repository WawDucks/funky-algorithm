package org.example.longest_substring;

import java.util.ArrayList;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int counter = 0;
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                char temp = s.charAt(j);
                if (!arr.contains(temp)) {
                    arr.add(temp);
                    if (counter < j - i + 1) {
                        counter = j - i + 1;
                    }
                } else {
                    arr.clear();
                    break;
                }
            }
        }
        return counter;
    }
}
