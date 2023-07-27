package org.example;

import org.example.longest_substring.LongestSubstring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringTest {
    @Test
    public void test() {
        Assertions.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

}