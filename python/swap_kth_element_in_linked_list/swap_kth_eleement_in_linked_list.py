class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def swapNodes(self, head: ListNode | None, k: int) -> ListNode | None:
        slow = fast = head

        for i in range(k-1):
            if not fast.next:
                return head
            fast = fast.next
        
        first = fast
        fast = fast.next

        while fast:
            slow = slow.next
            fast = fast.next

        first.val = slow.val
        slow.val = first.val
        
        return head

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
        

# run
# [1,2,3,4,5]
            
head = createLinkedList(values = [1,2,3,4,5])

solution = Solution()
print(solution.swapNodes(head, 2).val)  
