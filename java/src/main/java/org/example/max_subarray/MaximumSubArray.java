package org.example.max_subarray;

public class MaximumSubArray {
    public static int maxSubArray(int[] input) {
        int maxSum = input[0];
        int tempSum = input[0];

        for (int i = 1; i < input.length; i++) {
            tempSum = Math.max(input[i], tempSum + input[i]);
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }
}
