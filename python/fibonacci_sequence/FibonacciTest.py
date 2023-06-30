import unittest

from Fibonacci import Fibonacci


class FibonacciSequenceTest(unittest.TestCase):

    def test_initial_check(self):
        self.assertEqual(Fibonacci.fibonacci(0), [])


def test_valid_input(self):
    self.assertEqual(Fibonacci.fibonacci(10), [0, 1, 1, 2, 3, 5, 8, 13, 21, 34])


def test_invalid_result(self):
    self.assertNotEqual(Fibonacci.fibonacci(5), [0, 1, 1, 2, 3])


if __name__ == '__main__':
    unittest.main()
