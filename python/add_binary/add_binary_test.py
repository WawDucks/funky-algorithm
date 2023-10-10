import unittest
from python.add_binary.add_binary import Solution

class TestSolution(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_case_1(self):
        self.assertEqual(self.solution.addBinary("11", "1"), "100")

    def test_case_2(self):
        self.assertEqual(self.solution.addBinary("1010", "1011"), "10101")

    def test_case_3(self):

        self.assertEqual(self.solution.addBinary("1111", "1111"), "11110")


if __name__ == '__main__':
    unittest.main()