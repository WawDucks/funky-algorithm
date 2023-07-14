package org.example.min_meeting_rooms;

import java.util.Arrays;

public class MinMeetingRooms {
    public static int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];

        //Extract the start times and end times into separate arrays
        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int minRooms = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (startTimes[i] < endTimes[endIndex]) {
                minRooms++;
            } else {
                endIndex++;
            }
        }
        return minRooms;
    }
}
