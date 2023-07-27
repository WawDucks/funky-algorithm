package org.example;

import org.example.unique_path.UniquePath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathTest {
    @Test
    public void valid() {
        Assertions.assertEquals(3, UniquePath.uniquePaths(3, 2));
        Assertions.assertEquals(28, UniquePath.uniquePaths(3, 7));
        Assertions.assertEquals(20, UniquePath.uniquePaths(4, 4));
    }

}