// LeetCode 202 Happy Number
// Reference: https://www.youtube.com/watch?v=LkD0D0Xy-ro

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        
        // create a HashSet for visited numbers
        Set<Integer> usedIntegers = new HashSet<>();
        while (true){

            //Find the sum of squares
            int sum = 0;
            
            while ( n != 0){
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            //If sum is 1, return true
            if (sum == 1){ return true;}

            // Else the number is the current sum
            n = sum;

            // Check if we have already encountered the number
            if (usedIntegers.contains(n)){
                
                return false;
            }
            usedIntegers.add(n);

        }

    }
}
