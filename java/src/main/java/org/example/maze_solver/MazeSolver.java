package org.example.maze_solver;

public class MazeSolver {
    private static final int[] DIRECTIONS = {0, 1, 0, -1, 0};

    public boolean solveMaze(int[][] maze) {
        // starting point for depth first search
        return dfs(maze, 0, 0);
    }

    private boolean dfs(int[][] maze, int row, int col) {
        // check if we reach the goal
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return true;
        }

        for (int i = 0; i < 4; i++) {
            int newRow = DIRECTIONS[i];
            int newCol = DIRECTIONS[i + 1];

            // check if the position is not wall
            if (newRow >= 0 && newRow < maze.length && newCol >= 0 && newRow < maze[0].length && maze[newRow][newCol] == 0) {
                // mark it 
                maze[newRow][newCol] = 2;
            }

            if (dfs(maze, newRow, newCol)) {
                return true;
            }
            maze[newRow][newCol] = 0;
        }
        return false;
    }
}