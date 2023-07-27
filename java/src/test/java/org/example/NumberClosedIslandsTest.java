package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.number_of_closed_islands.NumberClosedIslands.closedIsland;

public class NumberClosedIslandsTest {
    @Test
    public void testClosedIsland() {
        int[][] grid1 = {
                {1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0}
        };
        int result1 = closedIsland(grid1);
        Assertions.assertEquals(2, result1);

        int[][] grid2 = {
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0}
        };
        int result2 = closedIsland(grid2);
        Assertions.assertEquals(1, result2);

        int[][] grid3 = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };
        int result3 = closedIsland(grid3);
        Assertions.assertEquals(2, result3);
    }
}