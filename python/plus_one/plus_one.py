from typing import List

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
      n = len(digits)
      for i in range(n - 1, -1, -1):
          digits[i] += 1
          if digits[i] == 10:
              digits[i] = 0
          else:
              return digits  
      digits.insert(0, 1)
    
      return digits