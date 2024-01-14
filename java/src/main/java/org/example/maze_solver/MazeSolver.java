package org.example.maze_solver;

public class MazeSolver {
    private static final int[] DIRECTIONS = {0, 1, 0, -1, 0};

    public static boolean solveMaze(int[][] maze) {
        return dfs(maze, 0, 0);
    }

    private static boolean dfs(int[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return true;
        }

        for (int i = 0; i < 4; i++) {
            int newRow = row + DIRECTIONS[i];
            int newCol = col + DIRECTIONS[i + 1];

            if (newRow >= 0 && newRow < maze.length && newCol >= 0 && newCol < maze[0].length && maze[newRow][newCol] == 0) {

                maze[newRow][newCol] = 2;

                if (dfs(maze, newRow, newCol)) {
                    return true;
                }

                maze[newRow][newCol] = 0;
            }

        }
        return false;
    }
}