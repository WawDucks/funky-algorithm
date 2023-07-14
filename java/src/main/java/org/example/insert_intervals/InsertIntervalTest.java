package org.example.insert_intervals;

import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {
    @Test
    public void valid_test() {
        int[][] actual = new int[][]{{1, 3}, {6, 9}};
        int[][] expected = new int[][]{{1, 5}, {6, 9}};
        int[] input = new int[]{2, 5};

        Assert.assertArrayEquals(expected, InsertInterval.insert(actual, input));
    }

    @Test
    public void valid_test2() {
        int[][] actual = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[][] expected = new int[][]{{1, 2}, {3, 10}, {12, 16}};
        int[] input = new int[]{4, 8};

        Assert.assertArrayEquals(expected, InsertInterval.insert(actual, input));
    }
  @Test
    public void invalid_test() {
        int[][] actual = new int[][]{{1, 2}, {3, 5}, {6, 7}, {12, 16}};
        int[][] expected = new int[][]{{1, 2}, {3, 10}, {12, 16}};
        int[] input = new int[]{4, 8};

        Assert.assertNotEquals( expected, InsertInterval.insert(actual, input));
    }

}