from typing import List
from collections import deque


class SnakeGame:
    def __init__(self, width: int, height: int, food: List[List[int]]):
        self.width = width
        self.height = height
        self.food = food # [(row, col)]
        self.food_index = 0
        self.snake = deque([(0, 0)]) # [(row, col)]
        self.snake_set = {(0, 0)}
        self.score = 0
    
    def move(self, directions: str) -> int:
        head_row, head_col = self.snake[0]
        if directions == "U":
            head_row -= 1 
        elif directions == "D":
            head_row += 1
        elif directions == "L":
            head_col -= 1
        elif directions == "R":
            head_col += 1
        
        new_head = (head_row, head_col)

        if head_row < 0 or head_row >= self.height or head_col < 0 or head_col >= self.width:
            return -1
        
        tail = self.snake[-1]
        if new_head in self.snake_set and new_head != tail:
            return -1
        
        if self.food_index < len(self.food) and new_head == self.food[self.food_index]:
            self.food_index += 1
            self.score += 1
        else:
            self.snake.pop()
            self.snake_set.remove(tail)

        self.snake.appendleft(new_head)
        self.snake_set.add(new_head)
    
        return self.score



food = [(2,0), (0,0), (0,2), (2,2)]
moves = ["D", "D", "R", "U", "U", "L", "D", "R", "R", "U"]

game = SnakeGame(3, 3, food)
           
for move in moves:
    print(game.move(move)) 