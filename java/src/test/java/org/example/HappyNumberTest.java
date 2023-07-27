package org.example;

import org.example.happy_number.HappyNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {
    @Test
    public void test() {
        Assertions.assertTrue(HappyNumber.isHappy(19));
        Assertions.assertFalse(HappyNumber.isHappy(5));
        Assertions.assertTrue(HappyNumber.isHappy(7));
    }

}