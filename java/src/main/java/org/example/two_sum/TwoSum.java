package org.example.two_sum;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int sum;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (i != j) {
                    if (sum == target) {
                        list.add(i);
                        list.add(j);
                        return list.stream().mapToInt(k -> k).toArray();
                    }
                }
            }
        }
        return new int[]{};
    }
}
