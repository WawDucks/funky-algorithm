package org.example;

import org.example.nQueens.NQueens;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NQueensTest {


    @Test
    void initialTest() {
        NQueens nQueens = new NQueens();

        List<List<String>> result_4 = nQueens.solveNQueens(4);
        List<List<String>> expected_4 = Arrays.asList(
                Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
                Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));

        Assertions.assertEquals(expected_4, result_4);

        List<List<String>> result_1 = nQueens.solveNQueens(1);
        List<List<String>> expected_1 = List.of(
                List.of("Q")
        );
        Assertions.assertEquals(expected_1, result_1);
    }

}