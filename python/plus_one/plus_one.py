
from typing import List

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        carry = 1  # Initialize the carry to 1 since we want to increment by one.

        for i in range(n - 1, -1, -1):
            total = digits[i] + carry
            digits[i] = total % 10  # Update the current digit.
            carry = total // 10  # Calculate the carry for the next iteration.

        # If there's still a carry after the loop, insert it as the most significant digit.
        if carry:
            digits.insert(0, carry)

        return digits