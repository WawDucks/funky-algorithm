package org.example;

import org.example.min_path_sum.MinimumPathSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumPathSumTest {
    @Test
    public void valid_test() {
        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int expected1 = 7;
        Assertions.assertEquals(expected1, MinimumPathSum.minPathSum(grid1));

        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};
        int expected2 = 12;
        Assertions.assertEquals(expected2, MinimumPathSum.minPathSum(grid2));
    }

}