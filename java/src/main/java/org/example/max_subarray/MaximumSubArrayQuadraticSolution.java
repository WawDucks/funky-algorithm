package org.example.max_subarray;

public class MaximumSubArrayQuadraticSolution {
    public static int maxSubArrayQuadric(int[] input) {
        int n = input.length;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int currentSum = 0;
            for(int j = i; j < n; j++) {
                currentSum += input[j];
                
                if (currentSum > max_sum) {
                    max_sum = currentSum;
                }
            }
        }
        return max_sum;
    }
}