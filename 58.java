// LeetCode 58 Length of Last Word
// Reference: https://leetcode.com/problems/length-of-last-word/solutions/370636/java-0ms-100-100-single-reverse-loop-with-explanation/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int lengthOfLastWord(String s) {

        int length = 0;

        // We are looking for the last word so going backward
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                // a letter is found so count
                length++;

            } else {
                // it's a white space instead
                // Did we already start to count a word?
                // Yes so we found the last word
                if (length > 0) return length;
            }
        }
        return length;
    }
}
