// LeetCode 387 First Unique Character in a String
// Reference: https://leetcode.com/problems/first-unique-character-in-a-string/solutions/2431836/java-100-faster-code-easy-solution-with-explanation/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int firstUniqChar(String s) {
        // Stores lowest index/ first index
        int ans = Integer.MAX_VALUE;

        // Iterate from a to z which is 26 

        for (char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}