// LeetCode 383 Ransom Note
// Reference: https://leetcode.com/problems/ransom-note/solutions/1671552/1ms-100-easy-explanation-java-solution/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] alphabet_counter = new int[26];

        for (char c: magazine.toCharArray())
            alphabet_counter[c - 'a'] ++;

        for (char c: ransomNote.toCharArray()){
            if (alphabet_counter[c - 'a'] == 0)
                return false;
            
            alphabet_counter[c - 'a'] --;
        }
        return true;
    }
}