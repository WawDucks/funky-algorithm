package org.example;

import org.example.spiral_matrix_II.SpiralMatrixII;
import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixIITest {
    @Test
    public void valid_test() {
        int input = 3;
        int[][] output = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        Assert.assertArrayEquals(output, SpiralMatrixII.generateMatrix(input));
    }

    @Test
    public void valid_test2() {
        int input = 1;
        int[][] output = new int[][]{{1}};
        Assert.assertArrayEquals(output, SpiralMatrixII.generateMatrix(input));
    }

}