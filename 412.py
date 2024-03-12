# LeetCode 412 Fizz Buzz
# Reference: https://www.youtube.com/watch?v=GfVoxKFpDV0

class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        
        answer = []

        for i in range(1, n+1):
            if i % 3 == 0 and i % 5 == 0:
                temp = "FizzBuzz"
            elif i % 3 == 0:
                temp = "Fizz"
            elif i % 5 == 0:
                temp = "Buzz"
            else:
                temp = str(i)
                
            answer.append(temp)
        
        return answer