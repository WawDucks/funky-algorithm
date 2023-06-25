package org.example.fibonacci_sequence;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequenceTest {
    @Test
    public void test_initial_check() {
        Assert.assertEquals(0, FibonacciSequence.fibonacciSequence(0));
    }

    @Test
    public void test_valid_input() {
        Assert.assertEquals(55, FibonacciSequence.fibonacciSequence(10));
    }

    @Test
    public void test_invalid_result() {
        Assert.assertNotEquals(50, FibonacciSequence.fibonacciSequence(10));
    }
}