//LeetCode 69 Sqrt(x)
// Reference: https://leetcode.com/problems/sqrtx/solutions/3212506/c-binary-search-easiest-beginner-friendly-sol/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/* Approach
 * If x is 0, return 0.
 
 * Initialize first to 1 and last to x.
 
 * While first is less than or equal to last, do the following:
a. Compute mid as first + (last - first) / 2.
b. If mid * mid equals x, return mid.
c. If mid * mid is greater than x, update last to mid - 1.
d. If mid * mid is less than x, update first to mid + 1.

* Return last.
 */

class Solution {
    public int mySqrt(int x) {

        if(x == 0) {return 0;}

        int first = 1, last = x;

        while (first <= last){
            int mid = first + (last - first) / 2;

            if (mid == x / mid){
                return mid;

            } else if (mid > x / mid){
                last = mid - 1;

            } else if (mid < x / mid){
                first = mid + 1;
            }

        }
        // The last return statement handles the case 
        //when no exact integer square root is found within the range, 
        // i.e. the true square root is a floating point value between 'left' and 'right', 
        //and we want to round it down to the smaller number out of the 2.
        //The loop terminates when (left > right), so right is the smaller value, which we should return.
        return last;
        
    }
}
// Time complexity: O(logn)
// Space complexity: O(1)