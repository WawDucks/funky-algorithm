package org.example.merge_intervals;

import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        int[] currentInterval = intervals[0];
        res.add(currentInterval);

        for (int[] interval : intervals) {
            int currentBegin = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextBegin) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                res.add(currentInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
