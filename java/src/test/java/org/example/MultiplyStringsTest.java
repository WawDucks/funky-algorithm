package org.example;

import org.example.multiply_strings.MultiplyStrings;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyStringsTest {

    @Test
    public void valid_test() {
        Assert.assertEquals("6", MultiplyStrings.multiplyStrings("2", "3"));
        Assert.assertEquals("56088", MultiplyStrings.multiplyStrings("123", "456"));
    }

    @Test
    public void base_test() {
        Assert.assertEquals("121932631112635269", MultiplyStrings.multiplyStrings("123456789", "987654321"));
    }
}