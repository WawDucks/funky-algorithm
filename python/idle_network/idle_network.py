from typing import List
from collections import defaultdict, deque

def networkBecomesIdle(edges: List[List[int]], patience: List[int]) -> int:
    # n - num of servers
    # edges = [[0,1],[1,2]]
    # 1 sec - time messages travels
    # patience = [0,2,1]
    # len(patience) = n
    # path reverse

    graph = defaultdict(list) 
    for u, v in edges:
        graph[u].append(v)
        graph[v].append(u)
    # graph = {0:[1], 1:[0, 2], 2: [1]}
    
    # init BFS
    distances = [None] * len(patience) # distances = [None, None, None]
    distances[0] = 0 # distance = [0, None, None]
    queue = deque()
    queue.append(0)

    while queue:
        u = queue.popleft()
        for v in graph[u]:
            if distances[v] == None:
                distances[v] = distances[u] + 1 # distances = [0, 1, 2]
                queue.append(v) # queue = [2]
    
    res = 0

    for i in range(1, len(patience)):
        round_trip = distances[i] * 2
        if round_trip <= patience[i]:
            last_delivery = round_trip
        else:
            last_sent = ((round_trip - 1) // patience[i]) * patience[i]
            last_delivery = last_sent + round_trip
        res = max(res, last_delivery)
    return res + 1

edges = [[0,1],[1,2]]
patience = [0,2,1]

edges = [[0,1],[0,2],[1,2]]
patience = [0,10,10]
