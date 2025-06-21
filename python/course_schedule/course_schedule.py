from collections import deque
from typing import List


class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph = {i: [] for i in range(numCourses)}
        in_degree = [0] * numCourses
        
        for course, prereq in prerequisites:
            graph[prereq].append(course)
            in_degree[course] += 1
        
        queue = deque([i for i in range(numCourses) if in_degree[i] == 0])
        processed_courses = 0
        
        while queue:
            course = queue.popleft()
            processed_courses += 1
            
            # For each neighbor (dependent course), reduce its in-degree
            for neighbor in graph[course]:
                in_degree[neighbor] -= 1
                # If in-degree becomes 0, add to queue
                if in_degree[neighbor] == 0:
                    queue.append(neighbor)
        
        # If we processed all courses, return True, otherwise False (cycle detected)
        return processed_courses == numCourses
