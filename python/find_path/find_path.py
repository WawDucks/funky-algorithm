from typing import List


class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        # def dfs(node, g, viseted):
        #     visited[node]=1
        #     for i in g[node]:
        #         if not visited[i]:
        #             rec(i,g,vis)
        # g=[[] for _ in range(n)]
        # for i in edges:
        #     g[i[0]].append(i[1])
        #     g[i[1]].append(i[0])
        # visited=[0 for i in range(n)]
        # dfs(source,g,visited)
        # return visited[destination]
        
        neighbors = {i: [] for i in range(n)}
        for a, b in edges:
            neighbors[a].append(b)
            neighbors[b].append(a)
        
        def dfs(node, visited):
            if node == destination:
                return True
            visited.add(node)
            for neighbor in neighbors[node]:
                if neighbor not in visited:
                    if dfs(neighbor, visited):
                        return True

            return False
        return dfs(source, set())

# Case 1
# n = 6
# edges = [[0, 1], [0, 2], [0, 3], [1, 4], [2, 5]]
# source = 0
# destination = 5

# Case 2
n = 3
edges = [[0,1],[1,2],[2,0]]
source = 0
destination = 2

s = Solution()
print(s.validPath(n, edges, source, destination))
