package org.example;

import org.example.multiply_strings.MultiplyStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyStringsTest {

    @Test
    public void valid_test() {
        Assertions.assertEquals("6", MultiplyStrings.multiplyStrings("2", "3"));
        Assertions.assertEquals("56088", MultiplyStrings.multiplyStrings("123", "456"));
    }

    @Test
    public void base_test() {
        Assertions.assertEquals("121932631112635269", MultiplyStrings.multiplyStrings("123456789", "987654321"));
    }
}