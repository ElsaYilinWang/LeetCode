# LeetCode 118 Pascal's triangle
# Reference: https://www.youtube.com/watch?v=nPVEaB3AjUM

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = [[1]]

        for i in range(numRows - 1): # res has 1 row
            temp = [0] + res[-1] + [0]
            row = []

            for j in range(len(res[-1]) + 1):
                row.append(temp[j] + temp[j+1])
            
            res.append(row)
            
        return res

