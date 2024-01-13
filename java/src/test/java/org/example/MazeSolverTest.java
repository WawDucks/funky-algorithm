package org.example;

import org.example.maze_solver.MazeSolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeSolverTest {

    @Test
    public void initialValidTest() {
        int[][] maze = {
                {0, 1, 1, 1},
                {0, 0, 1, 0},
                {1, 0, 0, 0},
                {1, 1, 1, 0},
        };
        Assertions.assertTrue(MazeSolver.solveMaze(maze));
    }

    @Test
    public void initialInvalidTest() {
        int[][] maze = {
                {1, 1, 1, 1},
                {1, 1, 1, 0},
                {1, 1, 1, 0},
                {1, 1, 1, 1},
        };
        Assertions.assertFalse(MazeSolver.solveMaze(maze));
    }
}