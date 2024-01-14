package org.example;

import org.example.sudoku_solver.SudokuSolver;
import org.example.sudoku_solver.SudokuSolver2;
import org.example.sudoku_solver.SudokuSolver3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SudokuSolverTest {
    @Test
    public void valid_test() {
        char[][] actual = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Assertions.assertTrue(SudokuSolver.isValidSudoku(actual));
        Assertions.assertTrue(SudokuSolver2.isValidSudoku(actual));
        Assertions.assertTrue(SudokuSolver3.isValidSudoku(actual));
    }

    @Test
    public void invalid_test() {
        char[][] actual = {
                {'5', '3', '3', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Assertions.assertFalse(SudokuSolver.isValidSudoku(actual));
        Assertions.assertFalse(SudokuSolver2.isValidSudoku(actual));
        Assertions.assertFalse(SudokuSolver3.isValidSudoku(actual));
    }
}