package org.example.sudoku_solver;

import java.util.HashSet;
import java.util.Set;

public class SudokuSolver {
    public static boolean isValidSudoku(char[][] board) {
        if (board.length == 0) {
            return false;
        }
        

        //rows
        for (int row = 0; row < 9; row++) {
            if (hasDuplicate(board[row])) {
                return false;
            }
        }

        //columns
        for (int col = 0; col < 9; col++) {
            char[] column = new char[9];
            for (int row = 0; row < 9; row++) {
                column[row] = board[row][col];
            }
            if (hasDuplicate(column)) {
                return false;
            }
        }

        //sub-boxes
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                char[] subBox = new char[9];
                int index = 0;
                for (int row = j * 3; row < (j + 1) * 3; row++) {
                    for (int col = k * 3; col < (k + 1) * 3; col++) {
                        subBox[index++] = board[row][col];
                    }
                }
                if (hasDuplicate(subBox)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasDuplicate(char[] chars) {
        Set<Character> digits = new HashSet<>();
        for (char chr : chars) {
            if (chr != '.') {
                if (digits.contains(chr)) {
                    return true;
                }
                digits.add(chr);
            }
        }
        return false;
    }
}