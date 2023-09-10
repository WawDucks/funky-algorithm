package org.example;


import org.example.climbing_stairs.ClimbingStairs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClimbingStairsTest {
    @Test
    public void valid() {
        Assertions.assertEquals(1, ClimbingStairs.climbStairs(1));
        Assertions.assertEquals(2, ClimbingStairs.climbStairs(2));
        Assertions.assertEquals(3, ClimbingStairs.climbStairs(3));
        Assertions.assertEquals(5, ClimbingStairs.climbStairs(4));
        Assertions.assertEquals(9, ClimbingStairs.climbStairs(5));
    }

}