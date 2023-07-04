package org.example.combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, ArrayList<Integer> combination, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            combination.add(candidates[i]);
            backtrack(result, combination, candidates, target - candidates[i], i);
            combination.remove(combination.size() - 1);
        }
    }
}
