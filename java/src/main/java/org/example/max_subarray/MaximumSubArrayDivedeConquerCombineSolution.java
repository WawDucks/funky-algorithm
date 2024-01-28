package org.example.max_subarray;

public class MaximumSubArrayDivedeConquerCombineSolution {
    public static int maxSubArray(int[] input) {
        int low = 0;
        int high = input.length - 1;

        return findMaxSubArray(input, low, high)[2];
    }

    private static int[] findMaxSubArray(int[] input, int low, int high) {
        if (low == high) {
            return new int[]{low, high, input[low]};
        } else {
            int mid = (low + high) / 2;

            int[] L = findMaxSubArray(input, low, mid);
            int[] R = findMaxSubArray(input, mid + 1, high);
            int[] C = findMaxCrossingSubArray(input, low, mid, high);

            if (L[2] >= R[2] && L[2] >= C[2]) {
                return L;
            } else if (R[2] >= L[2] && R[2] >= C[2]) {
                return R;
            } else {
                return C;
            }
        }
    }

    private static int[] findMaxCrossingSubArray(int[] input, int low, int mid, int high) {
        
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = mid;
        for (int i = mid; i >= low; i--) {
            sum = sum + input[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = mid;
        for (int i = mid + 1; i <= high; i++) {
            sum = sum + input[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }
        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }
}