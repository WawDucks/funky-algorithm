package org.example;

import org.example.two_sum.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{1,2}, TwoSum.twoSum(new int[]{3,2,4}, 6));
        Assert.assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(new int[]{2,7,11,15}, 9));
        Assert.assertArrayEquals(new int[]{1,2}, TwoSum.twoSum(new int[]{2,5,5,11}, 10));
    }
}