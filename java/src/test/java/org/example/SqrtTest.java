package org.example;

import org.example.sqrt.Sqrt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtTest {
    @Test
    public void valid() {
        Assertions.assertEquals(2, Sqrt.mySqrt(4));
        Assertions.assertEquals(2, Sqrt.mySqrt(8));
    }

}