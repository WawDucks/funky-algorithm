package org.example;

import org.example.plus_one.PlusOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneTest {
    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{1,2,4}, PlusOne.plusOne(new int[]{1,2,3}));
        Assertions.assertArrayEquals(new int[]{1,0}, PlusOne.plusOne(new int[]{9}));
        Assertions.assertArrayEquals(new int[]{1,0, 0}, PlusOne.plusOne(new int[]{9,9}));
    }
}