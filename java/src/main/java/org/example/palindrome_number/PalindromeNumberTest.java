package org.example.palindrome_number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {
    @Test
    public void test() {
        Assert.assertTrue( PalindromeNumber.isPalindrome(121));
        Assert.assertFalse( PalindromeNumber.isPalindrome(10));
        Assert.assertFalse( PalindromeNumber.isPalindrome(-121));
    }
}