package org.example.left_rotate;

import java.util.List;

public class LeftRotate {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        reverse(a, 0, d - 1);
        reverse(a, d, a.size() - 1);
        reverse(a, 0, a.size() - 1);
        return a;
    }

    public static void reverse(List<Integer> nums, int start, int end) {
        while (start < end) {
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }
    }
}
