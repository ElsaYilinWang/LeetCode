// LeetCode 191 Number of 1 Bits
// Reference: https://leetcode.com/problems/number-of-1-bits/solutions/55099/simple-java-solution-bit-shifting/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
    	while(n!=0) {
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
    }
}
