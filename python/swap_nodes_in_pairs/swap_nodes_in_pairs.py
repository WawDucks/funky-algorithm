class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy
        while head and head.next:
            left = head
            right = head.next

            # Swap nodes
            prev.next = right # head
            left.next = right.next
            right.next = left

            prev = left
            head = left.next
        return dummy.next


def createLinkedList(values):
        if not values:
            return None
        
        # Initialize the head of the linked list
        head = ListNode(values[0])
        current = head
        
        # Create nodes for the remaining values and link them together
        for val in values[1:]:
            current.next = ListNode(val)
            current = current.next
        return head
        
# [1,2,3,4]
            
head = createLinkedList(values = [1,2,3,4])

solution = Solution()
print(solution.swapPairs(head).val)  
