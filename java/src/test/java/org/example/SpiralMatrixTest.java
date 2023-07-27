package org.example;

import org.example.spiral_matrix.SpiralMatrix;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SpiralMatrixTest {

    @Test
    public void valid() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> output = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        Assert.assertEquals(output, SpiralMatrix.spiralOrder(input));
    }

    @Test
    public void valid2() {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> output = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        Assert.assertEquals(output, SpiralMatrix.spiralOrder(input));
    }
}