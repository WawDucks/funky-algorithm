package org.example.happy_number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {
    @Test
    public void test() {
        Assert.assertTrue(HappyNumber.isHappy(19));
        Assert.assertFalse(HappyNumber.isHappy(5));
        Assert.assertTrue(HappyNumber.isHappy(7));
    }

}