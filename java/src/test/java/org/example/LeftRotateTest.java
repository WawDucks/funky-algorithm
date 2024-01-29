package org.example;

import org.example.left_rotate.LeftRotate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.left_rotate.LeftRotate.rotLeft;
import static org.junit.jupiter.api.Assertions.*;

class LeftRotateTest {
    @Test
    void test() {
        List<Integer> actual = Arrays.asList(1,2,3,4,5);
        int d = 2;
        List<Integer> expected = Arrays.asList(3,4,5,1,2);

        Assertions.assertEquals(rotLeft(actual,d), expected);
    }

}