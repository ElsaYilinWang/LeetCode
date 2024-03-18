// LeetCode 171 Excel Sheet Column Number
// Reference: https://leetcode.com/problems/excel-sheet-column-number/solutions/52154/concise-java-solution-with-explanation/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null) return -1;

        int sum = 0;

        for (char C: columnTitle.toUpperCase().toCharArray()){
            sum *= 26;
            sum += C - 'A' + 1;
        }

        return sum;

    }
}
