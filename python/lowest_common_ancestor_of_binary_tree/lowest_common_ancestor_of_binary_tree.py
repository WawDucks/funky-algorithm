class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

def lowestCommonAncestor(root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
    if not root or root == p or root == q:
        return root
    
    left = lowestCommonAncestor(root.left, p, q)
    right = lowestCommonAncestor(root.right, p, q)

    if left and right:
        return root
    return left or right


# Build the tree    5 2
#       3
#      / \
#     5   1
#    / \ / \
#   6  2 0  8
#     / \
#    7   4



root = TreeNode(3)
root.left = TreeNode(5)
root.right = TreeNode(1)
root.left.left = TreeNode(6)
root.left.right = TreeNode(2)
root.right.left = TreeNode(0)
root.right.right = TreeNode(8)
root.left.right.left = TreeNode(7)
root.left.right.right = TreeNode(4)

# Nodes to find LCA of:
p = root.left.right.left   # node 7
q = root.left.right.right  # node 4

# Test LCA of 7 and 4
lca = lowestCommonAncestor(root, p, q)
print("LCA of 7 and 4 is:", lca.val)  # Output: 2