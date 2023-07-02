package org.example.count_and_say;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {
    @Test
    public void valid_test() {
        Assert.assertEquals("1", CountAndSay.countAndSay(1));
        Assert.assertEquals("1211", CountAndSay.countAndSay(4));
    }

    @Test
    public void invalid_test() {
        Assert.assertNotEquals("1", CountAndSay.countAndSay(2));
    }

    @Test
    public void valid_test_recursive() {
        Assert.assertEquals("1", CountAndSay.countAndSayRecursive(1));
        Assert.assertEquals("1211", CountAndSay.countAndSayRecursive(4));
    }

    @Test
    public void invalid_test_recursive() {
        Assert.assertNotEquals("1", CountAndSay.countAndSayRecursive(2));
    }
}