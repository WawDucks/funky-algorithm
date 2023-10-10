import unittest
from python.plus_one.plus_one import Solution

class TestSolution(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_easy_case_1(self):
        digits = [1,2,3]
        self.assertEqual(self.solution.plusOne(digits), [1,2,4])
    
    def test_easy_case_2(self):
        digits = [4,3,2,1]
        self.assertEqual(self.solution.plusOne(digits), [4,3,2,2])

    def test_single_9_digit(self):
        digits = [9]
        self.assertEqual(self.solution.plusOne(digits), [1,0])
    
    def test_99(self):
        digits = [9,9]
        self.assertEqual(self.solution.plusOne(digits), [1,0,0])
    
    def test_999(self):
        digits = [9,9,9]
        self.assertEqual(self.solution.plusOne(digits), [1,0,0,0])
    
    def test_partial_trailing(self):
        digits = [4,8,9,9]
        self.assertEqual(self.solution.plusOne(digits), [4,9,0,0])

if __name__ == '__main__':
    unittest.main()