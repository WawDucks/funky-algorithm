package org.example.max_subarray;

public class MaximunSubArrayCubicSolution {
    public static int maxSubArrayCubic(int[] input) {
        int n = input.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int currentSum = 0;
                for(int k = i; k <= j; k++) {
                    currentSum += input[k];   
                }
                
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }    
}