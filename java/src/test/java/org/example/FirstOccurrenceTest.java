package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FirstOccurrenceTest {
    @Test
    public void test1() {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";

        Assert.assertEquals(0, FirstOccurrence.strStr(haystack1, needle1));
    }

    @Test
    public void test2() {
        String haystack2 = "leetcode";
        String needle2 = "leeto";

        Assert.assertEquals(-1, FirstOccurrence.strStr(haystack2, needle2));
    }
}
