// LeetCode 290: Word Pattern
// Reference: https://leetcode.com/problems/word-pattern/solutions/2977740/simple-java-solution-with-using-hashmap/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length()){
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(c)){
                charToWord.put(c, word);
            }

            if (!wordToChar.containsKey(word)) {
                wordToChar.put(word, c);
            }

            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
                return false;
            }
        }
        return true;
        
    }
}