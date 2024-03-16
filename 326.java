// LeetCode 326 Power of Three
// Reference: https://www.youtube.com/watch?v=GNb8vSyw-WE

class Solution {
    public boolean isPowerOfThree(int n) {

        while (n >= 3) {
            if (n % 3 != 0){
                return false;
            }
            n = n / 3;
        }

        return n == 1;
        
    }
}