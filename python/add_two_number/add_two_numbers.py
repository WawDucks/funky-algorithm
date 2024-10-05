from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        sum_head = ListNode()
        current = sum_head
        carry = 0
        while l1 or l2 or carry:
            val_1 = l1.val if l1 else 0
            val_2 = l2.val if l2 else 0
            carry, digit = divmod(val_1 + val_2 + carry, 10)
            # digit = (val_1 + val_2 + carry) // 10
            # carry = (val_1 + val_2 + carry) % 10
            current.next = ListNode(val=digit)
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            current = current.next
        
        return sum_head.next