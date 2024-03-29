package org.example;

import org.example.combination_sum.CombinationSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationSumTest {

    @Test
    public void valid_test() {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        List<List<Integer>> result1 = CombinationSum.combinationSum(candidates1, target1);
        List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(2, 2, 3), List.of(7));

        Assertions.assertEquals(expected1, result1);
    }


    @Test
    public void valid_test_2() {
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        List<List<Integer>> result2 = CombinationSum.combinationSum(candidates2, target2);
        List<List<Integer>> expected2 = Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5));

        Assertions.assertEquals(expected2, result2);
    }

    @Test
    public void edge_case_test_3() {
        int[] candidates4 = {2, 4, 6};
        int target4 = 1;
        List<List<Integer>> result3 = CombinationSum.combinationSum(candidates4, target4);
        List<List<Integer>> expected3 = List.of();

        Assertions.assertEquals(expected3, result3);
    }


}