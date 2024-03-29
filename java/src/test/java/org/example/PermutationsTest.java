package org.example;

import org.example.permutations.Permutations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTest {
    @Test
    public void valid_test() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));
        List<List<Integer>> result = Permutations.generatePermutations(nums);
        Assertions.assertEquals(expected.size(), result.size());
        Assertions.assertTrue(result.containsAll(expected));
    }
}