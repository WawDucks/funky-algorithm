package org.example;

import org.example.merge_intervals.MergeIntervals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {
    @Test
    public void valid_test() {
        int [][] input = {{1,3}, {2,6}, {8, 10}, {15, 18}};
        int [][] output = {{1,6}, {8, 10}, {15, 18}};

        Assertions.assertArrayEquals(output, MergeIntervals.merge(input));
    }

    @Test
    public void invalid_test() {
        int [][] input = {{1,3}, {2,6}, {8, 10}, {15, 18}};
        int [][] output = {{1,3}, {2,6}, {8, 10}, {15, 18}};

        Assertions.assertNotEquals(output, MergeIntervals.merge(input));
    }

}