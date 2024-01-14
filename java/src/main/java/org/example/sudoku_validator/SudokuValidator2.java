package org.example.sudoku_validator;

import java.util.HashSet;

public class SudokuValidator2 {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char current_value = board[i][j];
                if (current_value != '.') {
                    if (!seen.add(current_value + " found in row " + i) ||
                        !seen.add(current_value + " found in col" + j) ||
                        !seen.add(current_value + " found in sub box " + i/3 + "-" + j/3)
                    ) return false;
                }
            }
        }
        return true;
    }
}