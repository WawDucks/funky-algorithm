package org.example.search_in_rotated_sorted_array;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        // Base check
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // in the end of this loop left == right == pivot
        int pivot = left;
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int realMid = (mid + pivot) % nums.length;
            
            if (nums[realMid] == target) {
                return realMid;
            }
            
            if (nums[realMid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
}