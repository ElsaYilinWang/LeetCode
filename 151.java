// LeetCode 151 Reverse Words in a String
// Reference: https://leetcode.com/problems/reverse-words-in-a-string/solutions/3593904/5-line-simple-solution-with-full-explanation/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--){
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output
        // (without trailing space)
        return out + str[0];

    }
}

