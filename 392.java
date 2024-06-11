// LeetCode 392 Is Subsequence
// Reference: https://leetcode.com/problems/is-subsequence/solutions/4074367/93-76-two-pointers-dp/?envType=study-plan-v2&envId=top-interview-150

class Solution {

    // Two pointers
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
        
    }
}
