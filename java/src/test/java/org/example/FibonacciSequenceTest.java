package org.example;


import org.example.fibonacci_sequence.FibonacciSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {
    @Test
    public void test_initial_check() {
        Assertions.assertEquals(0, FibonacciSequence.fibonacciSequence(0));
    }

    @Test
    public void test_valid_input() {
        Assertions.assertEquals(55, FibonacciSequence.fibonacciSequence(10));
    }

    @Test
    public void test_invalid_result() {
        Assertions.assertNotEquals(50, FibonacciSequence.fibonacciSequence(10));
    }
}