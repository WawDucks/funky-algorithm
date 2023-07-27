package org.example;

import org.example.min_meeting_rooms.MinMeetingRooms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMeetingRoomsTest {
    @Test
    public void testMinMeetingRooms() {

        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        int minRooms1 = MinMeetingRooms.minMeetingRooms(intervals1);
        Assertions.assertEquals(2, minRooms1);

        int[][] intervals2 = {{7, 10}, {2, 4}};
        int minRooms2 = MinMeetingRooms.minMeetingRooms(intervals2);
        Assertions.assertEquals(1, minRooms2);
    }

}