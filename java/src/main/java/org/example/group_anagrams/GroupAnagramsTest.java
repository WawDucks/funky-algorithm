package org.example.group_anagrams;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

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