package org.example.sqrt;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {
    @Test
    public void valid() {
        Assert.assertEquals(2, Sqrt.mySqrt(4));
        Assert.assertEquals(2, Sqrt.mySqrt(8));
    }

}