class Solution:
    def isValidSudoku(self, board):
        # Check rows
        for row in board:
            if not self.is_valid(row):
                return False

        # Check columns
        for col in range(9):
            column = [board[i][col] for i in range(9)]
            if not self.is_valid(column):
                return False

        # Check sub-boxes
        for i in range(0, 9, 3):
            for j in range(0, 9, 3):
                sub_box = [board[x][y] for x in range(i, i + 3) for y in range(j, j + 3)]
                if not self.is_valid(sub_box):
                    return False

        return True
    def is_valid(self, nums):
        seen = set()
        for num in nums:
            if num != ".":
                if num in seen:
                    return False
                seen.add(num)
        return True
