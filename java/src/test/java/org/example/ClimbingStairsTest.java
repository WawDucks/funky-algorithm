package org.example;


import org.example.climbing_stairs.ClimbingStairs;
import org.junit.Assert;
import org.junit.Test;


public class ClimbingStairsTest {
    @Test
    public void valid() {
        Assert.assertEquals(1, ClimbingStairs.climbStairs(1));
        Assert.assertEquals(2, ClimbingStairs.climbStairs(2));
        Assert.assertEquals(3, ClimbingStairs.climbStairs(3));
        Assert.assertEquals(5, ClimbingStairs.climbStairs(4));
        Assert.assertEquals(9, ClimbingStairs.climbStairs(5));
    }

}