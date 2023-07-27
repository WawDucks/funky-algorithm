package org.example;

import org.example.unique_path.UniquePath;
import org.junit.Assert;
import org.junit.Test;

public class UniquePathTest {
    @Test
    public void valid() {
        Assert.assertEquals(3, UniquePath.uniquePaths(3, 2));
        Assert.assertEquals(28, UniquePath.uniquePaths(3, 7));
        Assert.assertEquals(20, UniquePath.uniquePaths(4, 4));
    }

}