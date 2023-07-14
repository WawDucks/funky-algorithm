package org.example.merge_intervals;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTest {
    @Test
    public void valid_test() {
        int [][] input = {{1,3}, {2,6}, {8, 10}, {15, 18}};
        int [][] output = {{1,6}, {8, 10}, {15, 18}};

        Assert.assertArrayEquals(output, MergeIntervals.merge(input));
    }

    @Test
    public void invalid_test() {
        int [][] input = {{1,3}, {2,6}, {8, 10}, {15, 18}};
        int [][] output = {{1,3}, {2,6}, {8, 10}, {15, 18}};

        Assert.assertNotEquals(output, MergeIntervals.merge(input));
    }

}