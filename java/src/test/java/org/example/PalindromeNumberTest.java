package org.example;

import org.example.palindrome_number.PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    @Test
    public void test() {
        Assert.assertTrue( PalindromeNumber.isPalindrome(121));
        Assert.assertFalse( PalindromeNumber.isPalindrome(10));
        Assert.assertFalse( PalindromeNumber.isPalindrome(-121));
    }
}