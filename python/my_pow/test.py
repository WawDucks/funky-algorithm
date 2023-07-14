import unittest

class MyPowTestCase(unittest.TestCase):
    def test_case1(self):
        x = 2.00000
        n = 10
        expected = 1024.00000
        result = pow(x, n)
        self.assertAlmostEqual(result, expected, places=5)

    def test_case2(self):
        x = 2.10000
        n = 3
        expected = 9.26100
        result = pow(x, n)
        self.assertAlmostEqual(result, expected, places=5)

    def test_case3(self):
        x = 2.00000
        n = -2
        expected = 0.25000
        result = pow(x, n)
        self.assertAlmostEqual(result, expected, places=5)

if __name__ == '__main__':
    unittest.main()


class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertEqual(True, False)  # add assertion here


if __name__ == '__main__':
    unittest.main()
