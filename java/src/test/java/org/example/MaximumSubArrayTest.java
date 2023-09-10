package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.max_subarray.MaximumSubArray.maxSubArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubArrayTest {
    @Test
    public void testMaxSubArray() {
        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected1 = 6;
        int result1 = maxSubArray(nums1);
        Assertions.assertEquals(expected1, result1);

        // Test case 2
        int[] nums2 = {1, -2, 3, -4, 5};
        int expected2 = 5;
        int result2 = maxSubArray(nums2);
        Assertions.assertEquals(expected2, result2);

        // Test case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        int expected3 = -1;
        int result3 = maxSubArray(nums3);
        Assertions.assertEquals(expected3, result3);
    }
}