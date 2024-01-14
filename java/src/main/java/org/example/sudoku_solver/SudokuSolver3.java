package org.example.sudoku_solver;

public class SudokuSolver3 {
    public static boolean isValidSudoku(char[][] board) {
        return dfs(board);
    }

    private static boolean dfs(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (isValidSudoku(board)) {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for(int i = 0; i < 9; i++) {
            if (board[row][i] == c) {
                return false;
            } 
        }
        
        for(int i = 0; i < 9; i++) {
            if (board[i][col] == c) {
                return false;
            }
        }
        
        int subBoxRow = 3 * (row/3);
        int subBoxCol = 3 * (col/3);
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (board[subBoxRow + i][subBoxCol + j] == c) {
                    return false;
                }
            }    
        }
        return true;
    }
}