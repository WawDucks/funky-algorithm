package org.example.min_path_sum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumPathSumTest {
    @Test
    public void valid_test() {
        int[][] grid1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int expected1 = 7;
        Assert.assertEquals(expected1, MinimumPathSum.minPathSum(grid1));

        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}};
        int expected2 = 12;
        Assert.assertEquals(expected2, MinimumPathSum.minPathSum(grid2));
    }

}