# LeetCode 36 Valid Sudoku
# Reference: https://www.youtube.com/watch?v=TjFXEUCMqI8

import collections


class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        cols = collections.defaultdict(set)
        rows = collections.defaultdict(set)
        squares = collections.defaultdict(set)

        for r in range(9):
            for c in range(9):
                if board[r][c] == ".":
                    continue # ignore the empty cell
                if (board[r][c] in rows[r] or # repetition in rows
                    board[r][c] in cols[c] or # repitition in cols
                    board[r][c] in squares[(r//3, c//3)]): # repetiton in squares
                    return False
                
                cols[c].add(board[r][c])
                rows[c].add(board[r][c])
                squares[(r//3, c//3)].add(board[r][c])
        return True
                
