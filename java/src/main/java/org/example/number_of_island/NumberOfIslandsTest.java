package org.example.number_of_island;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(result, NumberOfIslands.numIslands(input));



        char[][] input2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result2 = 3;
        Assert.assertEquals(result2, NumberOfIslands.numIslands(input2));
    }
}