package org.example;

import org.example.longest_substring.LongestSubstring;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringTest {
    @Test
    public void test() {
        Assert.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, LongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

}