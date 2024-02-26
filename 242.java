// LeetCode 242 Valid Anagram
// Reference: https://leetcode.com/problems/valid-anagram/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        // Sorting
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    public boolean isAnagram2(String s, String t){

        // HashMap
        HashMap<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in String s
        for (char x: s.toCharArray()){
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in String t
        for (char x: t.toCharArray()){
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val: count.values()){
            if (val != 0){
                return false;
            }
        }

        return true;


    }


}
