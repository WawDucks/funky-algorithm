package org.example;

import org.example.happy_number.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {
    @Test
    public void test() {
        Assert.assertTrue(HappyNumber.isHappy(19));
        Assert.assertFalse(HappyNumber.isHappy(5));
        Assert.assertTrue(HappyNumber.isHappy(7));
    }

}