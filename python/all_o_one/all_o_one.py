class Node:
    def __init__(self, freq):
        self.freq = freq
        self.prev = None
        self.next = None
        self.keys = set()
    

class AllOne:
    def __init__(self):
        self.key_freq = {}
        self.freq_node = {}
        self.head = Node(0)
        self.tail = Node(0)
        self.head.next = self.tail
        self.tail.prev = self.head
    
    def insert_after(self, new_node, insert_after):
        new_node.prev = insert_after
        new_node.next = insert_after.next
        insert_after.next.prev = new_node
        insert_after.next = new_node

    def remove_node(self, curr_node):
        curr_node.prev.next = curr_node.next
        curr_node.next.prev = curr_node.prev      

    def inc(self, key: str) -> None:
        curr_count = self.key_freq.get(key, 0)
        new_count = curr_count + 1
        self.key_freq[key] = new_count
        curr_node = self.freq_node.get(curr_count)
        new_node = self.freq_node.get(new_count)
        if not new_node:
            new_node = Node(new_count)
            self.freq_node[new_count] = new_node
            insert_after = curr_node if curr_node else self.head
            self.insert_after(new_node, insert_after)
        new_node.keys.add(key)
        if curr_node:
            curr_node.keys.remove(key)
            if not curr_node.keys:
                self.remove_node(curr_node)
                del self.freq_node[curr_count]

    def dec(self, key: str) -> None:
        curr_count = self.key_freq[key]
        new_count = curr_count - 1

        curr_node = self.freq_node[curr_count]

        if new_count == 0:
            del self.key_freq[key]
        else:
            self.key_freq[key] = new_count
            new_node = self.freq_node.get(new_count)  
            if not new_node:
                new_node = Node(new_count)
                self.freq_node[new_count] = new_node
                self.insert_after(new_node, curr_node.prev)              
            new_node.keys.add(key)
        curr_node.keys.remove(key)

        if not curr_node.keys:
            self.remove_node(curr_node)
            del self.freq_node[curr_count]
            
    def getMaxKey(self) -> str:
        return next(iter(self.tail.prev.keys)) if self.tail.prev != self.head else ""

    def getMinKey(self) -> str:
        return next(iter(self.head.next.keys)) if self.head.next != self.tail else ""



# Example usage of the AllOne data structure

all_one = AllOne()

# Step 1: Insert keys
all_one.inc("a")        # "a": 1
all_one.inc("b")        # "b": 1
all_one.inc("b")        # "b": 2
all_one.inc("c")        # "c": 1
all_one.inc("c")        # "c": 2
all_one.inc("c")        # "c": 3

# Step 2: Check max and min
print(all_one.getMaxKey())  # Expected: "c"
print(all_one.getMinKey())  # Expected: "a"

# Step 3: Increase "a" to balance with "b"
all_one.inc("a")        # "a": 2

# Step 4: Now a and b have same count (2), c still higher
print(all_one.getMaxKey())  # Expected: "c"
print(all_one.getMinKey())  # Expected: "a" or "b"

# Step 5: Decrease c
all_one.dec("c")        # "c": 2
print(all_one.getMaxKey())  # Expected: "a" or "b" or "c" (all 2)
print(all_one.getMinKey())  # Expected: "a" or "b" or "c"

# Step 6: Decrease "c" two more times — it should be removed
all_one.dec("c")        # "c": 1
all_one.dec("c")        # removed

print(all_one.getMaxKey())  # Expected: "a" or "b"
print(all_one.getMinKey())  # Expected: "a" or "b"

# Step 7: Remove everything
all_one.dec("a")
all_one.dec("a")
all_one.dec("b")
all_one.dec("b")

print(all_one.getMaxKey())  # Expected: ""
print(all_one.getMinKey())  # Expected: ""
