// LeetCode 3 Longest Substring Without Repeating Characters
// Reference: https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/3649636/3-method-s-c-java-python-beginner-friendly/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for ( int right = 0; right < n; right++){
            if (!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
        
    }
}
