package org.example;

import org.example.group_anagrams.GroupAnagrams;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupAnagramsTest {

    @Test
    public void valid_test() {
        // Input
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Expected output
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("eat", "tea", "ate"));
        expected.add(List.of("tan", "nat"));
        expected.add(List.of("bat"));

        // Actual
        List<List<String>> actual = GroupAnagrams.groupAnagrams(strs);

        Set<List<String>> expectedSet = new HashSet<>(expected);
        Set<List<String>> actualSet = new HashSet<>(actual);
        Assert.assertEquals(expectedSet, actualSet);
    }

}