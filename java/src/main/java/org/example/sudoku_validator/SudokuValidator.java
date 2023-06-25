package org.example.sudoku_validator;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
    public static boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int row = 0; row < 9; row++) {
            if (isValid(board[row])) {
                return false;
            }
        }

        // Check columns
        for (int col = 0; col < 9; col++) {
            char[] column = new char[9];
            for (int row = 0; row < 9; row++) {
                column[row] = board[row][col];
            }
            if (isValid(column)) {
                return false;
            }
        }

        // Check sub-boxes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char[] subBox = new char[9];
                int index = 0;
                for (int row = i * 3; row < (i + 1) * 3; row++) {
                    for (int col = j * 3; col < (j + 1) * 3; col++) {
                        subBox[index++] = board[row][col];
                    }
                }
                if (isValid(subBox)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(char[] nums) {
        Set<Character> digits = new HashSet<>();
        for (char num : nums) {
            if (num != '.') {
                if (digits.contains(num)) {
                    return true;
                }
                digits.add(num);
            }
        }
        return false;
    }
}