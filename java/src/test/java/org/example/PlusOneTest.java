package org.example;

import org.example.plus_one.PlusOne;
import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{1,2,4}, PlusOne.plusOne(new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{1,0}, PlusOne.plusOne(new int[]{9}));
        Assert.assertArrayEquals(new int[]{1,0, 0}, PlusOne.plusOne(new int[]{9,9}));
    }
}