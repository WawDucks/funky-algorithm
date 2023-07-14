package org.example.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> generatePermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> permutation, int[] nums) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }

        for (int num : nums) {
            if (permutation.contains(num)) {
                continue;
            }

            permutation.add(num);
            backtrack(result, permutation, nums);
            permutation.remove(permutation.size() - 1);
        }
    }
}
