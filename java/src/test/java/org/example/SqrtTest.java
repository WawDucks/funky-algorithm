package org.example;

import org.example.sqrt.Sqrt;
import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {
    @Test
    public void valid() {
        Assert.assertEquals(2, Sqrt.mySqrt(4));
        Assert.assertEquals(2, Sqrt.mySqrt(8));
    }

}