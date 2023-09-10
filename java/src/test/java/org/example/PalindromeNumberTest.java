package org.example;

import org.example.palindrome_number.PalindromeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    @Test
    public void test() {
        Assertions.assertTrue( PalindromeNumber.isPalindrome(121));
        Assertions.assertFalse( PalindromeNumber.isPalindrome(10));
        Assertions.assertFalse( PalindromeNumber.isPalindrome(-121));
    }
}