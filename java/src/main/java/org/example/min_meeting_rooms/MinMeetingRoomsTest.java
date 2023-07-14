package org.example.min_meeting_rooms;

import org.junit.Assert;
import org.junit.Test;

public class MinMeetingRoomsTest {
    @Test
    public void testMinMeetingRooms() {

        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        int minRooms1 = MinMeetingRooms.minMeetingRooms(intervals1);
        Assert.assertEquals(2, minRooms1);

        int[][] intervals2 = {{7, 10}, {2, 4}};
        int minRooms2 = MinMeetingRooms.minMeetingRooms(intervals2);
        Assert.assertEquals(1, minRooms2);
    }

}