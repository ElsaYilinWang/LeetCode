// LeetCode 125 Valid Palindrom
// Reference: https://www.youtube.com/watch?v=UXVHeXNO9AA

class Solution {
    public boolean isPalindrome(String s) {
        // Get the left and right pointers
        int left = 0;
        int right = s.length() - 1;

        //Start a loop and compare characters
        while (left < right){
            // If same, move both pointers
            if (s.charAt(left) == s.charAt(right)){
                left ++;
                right --;

            } else {
                //If not, simply return false
                return false;
            }
            
        }
        // The loop stops and all have matched
        return true;

        
    }
}
