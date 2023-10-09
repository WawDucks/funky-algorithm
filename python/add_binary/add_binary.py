class Solution:
    def addBinary(self, a: str, b: str) -> str:
        result = ""
        carry = 0
        a_i = len(a) - 1
        b_i = len(b) - 1
        
        while a_i >= 0 or b_i >= 0 or carry:
            digit_a = int(a[a_i]) if a_i >= 0 else 0
            digit_b = int(b[b_i]) if b_i >= 0 else 0
            digit = digit_a + digit_b + carry
            
            if digit > 1:
                result = str(digit % 2) + result
                carry = 1
            else:
                result = str(digit) + result
                carry = 0
            
            a_i -= 1
            b_i -= 1
        
        return result