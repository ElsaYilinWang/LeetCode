//LeetCode 344 Reverse String
//Reference: https://leetcode.com/problems/reverse-string/solutions/1901756/java-c-3-way-s-visual-solution/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
            
        }
    }
}
