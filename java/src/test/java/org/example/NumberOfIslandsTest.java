package org.example;

import org.example.number_of_island.NumberOfIslands;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

    @Test
    public void valid_test() {
        char[][] input = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int result = 1;
        Assertions.assertEquals(result, NumberOfIslands.numIslands(input));



        char[][] input2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result2 = 3;
        Assertions.assertEquals(result2, NumberOfIslands.numIslands(input2));
    }
}