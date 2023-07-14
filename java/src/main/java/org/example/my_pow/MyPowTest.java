package org.example.my_pow;

import org.junit.Assert;
import org.junit.Test;

public class MyPowTest {
    private static final double DELTA = 0.0001; // Acceptable margin of error

    @Test
    public void testMyPow() {
        // Test case 1
        double x1 = 2.0;
        int n1 = 10;
        double expected1 = 1024.0;
        double result1 = MyPow.myPow(x1, n1);
        Assert.assertEquals(expected1, result1, DELTA);

        // Test case 2
        double x2 = 2.1;
        int n2 = 3;
        double expected2 = 9.261;
        double result2 = MyPow.myPow(x2, n2);
        Assert.assertEquals(expected2, result2, DELTA);

        // Test case 3
        double x3 = 2.0;
        int n3 = -2;
        double expected3 = 0.25;
        double result3 = MyPow.myPow(x3, n3);
        Assert.assertEquals(expected3, result3, DELTA);

        // Test case 4
        double x4 = 1.0;
        int n4 = 100;
        double expected4 = 1.0;
        double result4 = MyPow.myPow(x4, n4);
        Assert.assertEquals(expected4, result4, DELTA);


        // Test case 5
        double x5 = -2.0;
        int n5 = 5;
        double expected5 = -32.0;
        double result5 = MyPow.myPow(x5, n5);
        Assert.assertEquals(expected5, result5, DELTA);
    }

}