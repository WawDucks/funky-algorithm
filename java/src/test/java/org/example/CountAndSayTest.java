package org.example;

import org.example.count_and_say.CountAndSay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {
    @Test
    public void valid_test() {
        Assertions.assertEquals("1", CountAndSay.countAndSay(1));
        Assertions.assertEquals("1211", CountAndSay.countAndSay(4));
    }

    @Test
    public void invalid_test() {
        Assertions.assertNotEquals("1", CountAndSay.countAndSay(2));
    }

    @Test
    public void valid_test_recursive() {
        Assertions.assertEquals("1", CountAndSay.countAndSayRecursive(1));
        Assertions.assertEquals("1211", CountAndSay.countAndSayRecursive(4));
    }

    @Test
    public void invalid_test_recursive() {
        Assertions.assertNotEquals("1", CountAndSay.countAndSayRecursive(2));
    }
}