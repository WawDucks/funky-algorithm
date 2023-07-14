package org.example.number_of_island;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    checkIsland(grid, i, j);
                }
            }
        }
        return counter;
    }

    private static void checkIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        checkIsland(grid, i + 1, j);
        checkIsland(grid, i - 1, j);
        checkIsland(grid, i, j + 1);
        checkIsland(grid, i, j - 1);
    }
}
