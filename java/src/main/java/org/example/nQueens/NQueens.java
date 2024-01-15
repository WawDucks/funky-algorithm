package org.example.nQueens;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    private int size;
    private final List<List<String>> solutions = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        size = n;
        char[][] board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '.';
            }
        }
        backtracking(board, 0);
        return solutions;
    }

    private void backtracking(char[][] board, int colIndex) {
        if (colIndex == size) {
            solutions.add(construct(board));
            return;
        }

        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            if (validate(board, rowIndex, colIndex)) {
                board[rowIndex][colIndex] = 'Q';
                backtracking(board, colIndex + 1);
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    private boolean validate(char[][] board, int x, int y) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[j][i] == 'Q' && (x + y == i + j || x + i == y + j || x == j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String s = new String(board[i]);
            result.add(s);
        }
        return result;
    }
}