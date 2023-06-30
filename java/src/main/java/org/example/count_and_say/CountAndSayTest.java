package org.example.count_and_say;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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
}